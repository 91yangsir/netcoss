package com.yangsir.project.billmag.handleservcie.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.TimeUseBean;
import com.yangsir.project.billmag.handlerepository.IHandleBillRepository;
import com.yangsir.project.billmag.handleservcie.IHandleBillService;
import com.yangsir.project.billmag.queryrepository.IQueryBillRepostiory;
import com.yangsir.project.businessmag.queryrepository.IBusinessQueryRepository;
@Service
public class HandleBillServiceImpl implements IHandleBillService {
	@Resource
	private IHandleBillRepository HandleBillRepositoryImpl;
	@Resource
	private IQueryBillRepostiory queryBillRepostioryImpl;
	@Resource
	private IBusinessQueryRepository businessQueryRepositoryImpl;
	@Override
	public void addOnceBill(ServerInfoBean info) {
		// TODO Auto-generated method stub
		TimeUseBean bean=new TimeUseBean();
		bean.businessAcc(info.getBussinesAcc());//获取业务账号 
		bean.setLoginTime(info.getServerInTime());//获取登录时间
		bean.setOutTime(info.getServerOutTime());//获取登出时间
		bean.setServerIp(info.getServerIp());//获取服务器IP
		bean.setUseTime(info.getServerUseTime());//获取使用时间
		//通过账务账号查询出数据库中存储的费用信息，找出使用总时长最大的数据
		
		TimeUseBean bean1=queryBillRepostioryImpl.getMaxUseTimeBill(info.getBussinesAcc());
		if(bean1==null) {
			bean.setTotalUseTime(info.getServerUseTime());
		}else {
			bean.setTotalUseTime(info.getServerUseTime()+bean1.getTotalUseTime());
		}
		//再通过账务账号名称查询该账号的套餐详情。
		CostBean costBean=businessQueryRepositoryImpl.getBusinessByAcc(info.getBussinesAcc()).getCost();
		bean.setCost(costBean.getCostType());
		if(costBean.getCostType()==1) {
			bean.setOnceMoney(0);
		}else if(costBean.getCostType()==2) {
			bean.setOnceMoney(costBean.getCostUnit()*(info.getServerUseTime()/60));
		}else if(costBean.getCostType()==3) {
			if(bean.getTotalUseTime()<=costBean.getCostTime()*60*60) {
				bean.setOnceMoney(0);
			}else {
				bean.setOnceMoney(costBean.getCostUnit()*(info.getServerUseTime()/60));
			}
			
		}
		System.out.println(bean);
		HandleBillRepositoryImpl.save(bean);
		
	}

}

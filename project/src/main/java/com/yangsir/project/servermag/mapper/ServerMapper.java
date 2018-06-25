package com.yangsir.project.servermag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.yangsir.project.beans.ServerBean;

/**
 * 
 * @author dl
 *
 */
public interface ServerMapper {
	
	/**
	 * 获取所有服务器
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="serverIp",column="server_ip",javaType=String.class),
	})
	@Select(value= {"select * from t_server"})
	public List<ServerBean> getAllServer();
	

}

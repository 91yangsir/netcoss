package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
/**
 * 资费管理系统
 * @author Administrator
 *
 */
@Entity
@Table(name="t_cost")
public class CostBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3578563023399559528L;

	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;//id
	
	/**
	 * 资费名
	 */
	@Column(name="cost_name",length=20)
	private String costName;
	
	/**
	 * 资费类型
	 */
	@Column(name="cost_type",length=11)
	private int costType;
	
	/**
	 * 基本时长
	 */
	@Column(name="cost_time",length=11)
	private int costTime;
	
	
	/**
	 * 基本费用
	 */
	@Column(name="cost_base")
	private double costBase;
	
	/**
	 * 单位费用
	 */
	@Column(name="cost_unit")
	private double costUnit;
	
	/**
	 * 开通时间
	 */
	@Column(name="cost_start")
	private Date costStart;
	
	/**
	 * 资费说明
	 */
	@Column(name="cost_explain")
	private String costExplain;
	
	/**
	 * 业务连接
	 */
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cost")
	@Cascade(value= {CascadeType.ALL})
	private Set<BusinessBean> business;

	public CostBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCostName() {
		return costName;
	}

	public void setCostName(String costName) {
		this.costName = costName;
	}

	public int getCostType() {
		return costType;
	}

	public void setCostType(int costType) {
		this.costType = costType;
	}

	public int getCostTime() {
		return costTime;
	}

	public void setCostTime(int costTime) {
		this.costTime = costTime;
	}

	public double getCostBase() {
		return costBase;
	}

	public void setCostBase(double costBase) {
		this.costBase = costBase;
	}

	public double getCostUnit() {
		return costUnit;
	}

	public void setCostUnit(double costUnit) {
		this.costUnit = costUnit;
	}

	public Date getCostStart() {
		return costStart;
	}

	public void setCostStart(Date costStart) {
		this.costStart = costStart;
	}

	public String getCostExplain() {
		return costExplain;
	}

	public void setCostExplain(String costExplain) {
		this.costExplain = costExplain;
	}

	public Set<BusinessBean> getBusiness() {
		return business;
	}

	public void setBusiness(Set<BusinessBean> business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "CostBean [id=" + id + ", costName=" + costName + ", costType=" + costType + ", costTime=" + costTime
				+ ", costBase=" + costBase + ", costUnit=" + costUnit + ", costStart=" + costStart + ", costExplain="
				+ costExplain + "]";
	}
	
}
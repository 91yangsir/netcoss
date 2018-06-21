package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:41
 * 操作日志
 */

@Entity
@Table(name="t_operation_log")
public class OperationLogBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1948862309093189054L;

	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	/**
	 * 操作类型
	 */
	@Column(name="operation_log_type")
	private Integer operationLogType;
	
	/**
	 * 操作时间
	 */
	@Column(name="operation_log_time")
	private Date operationLogTime;
	
	/**
	 * 操作人员
	 */
	@Column(name="manager_name",length=20)
	private String managerName;
	
	/**
	 * 操作模块
	 */
	@Column(name="operation_log_model")
	private Integer operationLogModel;
	
	/**
	 * 操作数据
	 */
	@Column(name="operation_log_data")
	private String operationLogData;
	
	public OperationLogBean(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getOperationLogType() {
		return operationLogType;
	}

	public void setOperationLogType(Integer operationLogType) {
		this.operationLogType = operationLogType;
	}

	public Date getOperationLogTime() {
		return operationLogTime;
	}

	public void setOperationLogTime(Date operationLogTime) {
		this.operationLogTime = operationLogTime;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Integer getOperationLogModel() {
		return operationLogModel;
	}

	public void setOperationLogModel(Integer operationLogModel) {
		this.operationLogModel = operationLogModel;
	}

	public String getOperationLogData() {
		return operationLogData;
	}

	public void setOperationLogData(String operationLogData) {
		this.operationLogData = operationLogData;
	}

	@Override
	public String toString() {
		return "OperationLogBean [id=" + id + ", operationLogType=" + operationLogType + ", operationLogTime="
				+ operationLogTime + ", managerName=" + managerName + ", operationLogModel=" + operationLogModel
				+ ", operationLogData=" + operationLogData + "]";
	}

}
package com.yangsir.project.viewobject;

/**
 * @author guoqi
 * 页面展示分页数据类
 */

import java.io.Serializable;
import java.util.List;

public class DataGrid implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4688840943338663000L;
	
	/**
	 * total 数据总数
	 * rows 数据集合
	 */
	
	private Long total;
	private List<?> rows;
	
	public DataGrid() {
	}
	
	public DataGrid(Long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "DataGrid [total=" + total + ", rows=" + rows + "]";
	}
	
}


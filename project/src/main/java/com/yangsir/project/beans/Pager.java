package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:41
 * 分页类
 */
public class Pager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8734593309575943665L;

	/**
	 * @param page 当前页码
	 * @param rows 每页显示的条数
	 * @param index 起始位置
	 * @param totalRows 总条数
	 * @param totalPage 总页数
	 * @param datas 具体的数据
	 */
	
	private int page;
	private int rows;
	private int index;
	
	private int totalRows;
	private int totalPage;
	private List<?> datas;

	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Pager(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}



	public Pager(int page,int rows, int totalRows, List<?> datas) {
		super();
		this.page = page;
		this.rows = rows;
		this.totalRows = totalRows;
		this.datas = datas;
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
		totalPage = (totalRows % rows) == 0 ? (totalRows / rows) : (totalRows / rows) + 1;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	public int getIndex() {
		index = (page-1) * rows;
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", index=" + index + ", totalRows=" + totalRows
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
}
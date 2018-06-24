package com.yangsir.project.utils;

import java.io.Serializable;

public class MenuUtil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String text;
	private Boolean selected;
	
	public MenuUtil() {
		// TODO Auto-generated constructor stub
	}
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public Boolean getSelected() {
		return selected;
	}



	public void setSelected(Boolean selected) {
		this.selected = selected;
	}



	@Override
	public String toString() {
		return "MenuUtil [id=" + id + ", text=" + text + ", selected=" + selected + "]";
	}
	
	
}

package com.yangsir.project.viewobject;

import java.io.Serializable;
import java.util.List;

public class Series<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3178621730623411400L;
	public String name;
	public String type;
	public List<T> data;
	
	public Series() {
		// TODO 自动生成的构造函数存根
	}

	public Series(String name, String type, List<T> data) {
		super();
		this.name = name;
		this.type = type;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Series [name=" + name + ", type=" + type + ", data=" + data + "]";
	}
	
}

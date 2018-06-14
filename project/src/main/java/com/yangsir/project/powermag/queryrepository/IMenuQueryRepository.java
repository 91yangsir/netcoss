package com.yangsir.project.powermag.queryrepository;

import com.yangsir.project.beans.MenuBean;

public interface IMenuQueryRepository{
	
	public MenuBean getMenuById(long id);
	
	
	public MenuBean getMenuByName(String name);

}

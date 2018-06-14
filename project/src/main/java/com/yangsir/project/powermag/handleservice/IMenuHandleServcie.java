package com.yangsir.project.powermag.handleservice;

import com.yangsir.project.beans.MenuBean;

public interface IMenuHandleServcie {
	
	public void  addMenu(MenuBean bean);
	
	public void deleteMenu(long id);
	
	public void updateMenu(MenuBean bean);
	
	
}

package com.yangsir.project.powermag.queryservice;

import com.yangsir.project.beans.MenuBean;

public interface IMenuQueryService {
	/**
	 * 
	 * @param id  通过ID来查询菜单
	 * @return
	 */
  public MenuBean getMenuById(long id);
  /**
   * 
   * @param name 通过名字来查询菜单
   * @return
   */
  
  public MenuBean getMenuByName(String name);
	
}

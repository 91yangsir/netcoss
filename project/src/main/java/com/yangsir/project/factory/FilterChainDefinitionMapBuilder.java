package com.yangsir.project.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("/index.ftl", "anon");
		map.put("/user/menu", "anon");
		map.put("/user/shiro/logout", "logout");
		map.put("/**", "authc");
		
		return map;
	}
	
}

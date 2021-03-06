package com.yangsir.project.factory;

import java.io.IOException;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.jagregory.shiro.freemarker.ShiroTags;

import freemarker.template.TemplateException;

public class FreeMarkerConfigExtend extends FreeMarkerConfigurer {

	@Override
	public void afterPropertiesSet() throws IOException, TemplateException {
		// TODO Auto-generated method stub
		super.afterPropertiesSet();
		 this.getConfiguration().setSharedVariable("shiro", new ShiroTags());  
	}

	
}

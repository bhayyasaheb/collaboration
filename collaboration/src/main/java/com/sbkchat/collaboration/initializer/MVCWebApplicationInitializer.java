package com.sbkchat.collaboration.initializer;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sbkchat.collaboration.config.CORSFilter;
import com.sbkchat.collaboration.config.EmailConfig;
import com.sbkchat.collaboration.config.HibernateConfig;
import com.sbkchat.collaboration.config.MvcConfig;
import com.sbkchat.collaboration.config.WebSocketConfig;

public class MVCWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {HibernateConfig.class, EmailConfig.class, WebSocketConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {MvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}
	
	@Override
	protected Filter[] getServletFilters(){
		Filter [] singleton = { new CORSFilter() };
		return singleton;
	}

}

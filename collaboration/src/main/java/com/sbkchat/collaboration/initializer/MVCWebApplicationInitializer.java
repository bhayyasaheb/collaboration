package com.sbkchat.collaboration.initializer;

import java.io.File;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sbkchat.collaboration.config.CORSFilter;
import com.sbkchat.collaboration.config.EmailConfig;
import com.sbkchat.collaboration.config.HibernateConfig;
import com.sbkchat.collaboration.config.MvcConfig;
import com.sbkchat.collaboration.config.WebSocketConfig;

public class MVCWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5MB
	
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

	@Override
	protected void customizeRegistration(Dynamic registration) {
		
		// upload temp file will put here
		File uploadDirectory = new File(System.getProperty("java.io.tmpdir"));
		
		// register a MultipartConfigElement
		MultipartConfigElement multipartConfigElement = 
				new MultipartConfigElement(uploadDirectory.getAbsolutePath(),maxUploadSizeInMb,maxUploadSizeInMb*2,maxUploadSizeInMb/2);
				
		registration.setMultipartConfig(multipartConfigElement);
		super.customizeRegistration(registration);
	}

	
}

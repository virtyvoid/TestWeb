package com.testweb.config;

import com.testweb.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class<?>[]{WebConfig.class};
	}

/*	@Override
	protected Filter[] getServletFilters()
	{
		return new Filter[] { new CharacterEncodingFilter("UTF-8",true,true) };
	}*/

	@Override
	protected String[] getServletMappings()
	{
		return new String[] {"/"};
	}
}

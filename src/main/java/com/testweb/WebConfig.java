package com.testweb;

import org.jtwig.environment.EnvironmentConfiguration;
import org.jtwig.environment.EnvironmentConfigurationBuilder;
import org.jtwig.spring.JtwigViewResolver;
import org.jtwig.web.servlet.JtwigRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.StandardCharsets;

@Configuration
@EnableWebMvc
@ComponentScan
//@Import(SecurityConfig.class)
public class WebConfig extends WebMvcConfigurerAdapter
{
	@Bean
	public JtwigViewResolver viewResolver() {
		JtwigViewResolver viewResolver = new JtwigViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".twig");
		viewResolver.setOrder(1);
		//viewResolver.setContentType("charset=utf8"); // why so ?
		final EnvironmentConfiguration cfg = EnvironmentConfigurationBuilder.configuration()
				.render().withOutputCharset(StandardCharsets.UTF_8)
				.and().resources().withDefaultInputCharset(StandardCharsets.UTF_8).and().build();
		viewResolver.setRenderer(new JtwigRenderer(cfg));
		return viewResolver;
	}
}

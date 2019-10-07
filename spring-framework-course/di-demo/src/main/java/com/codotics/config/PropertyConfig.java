/**
 * 
 */
package com.codotics.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.codotics.examplebeans.FakeDataSource;

/**
 * @author Codotics Technologies
 *
 */
@Component
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Autowired
	Environment env;

	@Value("${codotics.username}")
	String user;

	@Value("${codotics.password}")
	String password;

	@Value("${codotics.dburl}")
	String url;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fds = new FakeDataSource();
		fds.setUser(env.getProperty("USERNAME"));
		fds.setPassword(password);
		fds.setUrl(url);
		return fds;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}

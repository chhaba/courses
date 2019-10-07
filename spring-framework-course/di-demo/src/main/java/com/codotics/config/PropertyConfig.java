/**
 * 
 */
package com.codotics.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.codotics.examplebeans.FakeDataSource;
import com.codotics.examplebeans.FakeJmsBroker;

/**
 * @author Codotics Technologies
 *
 */
@Component
//@PropertySource({ "classpath:datasource.properties", "classpath:jms.properties" })
@PropertySources({ @PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties") })
public class PropertyConfig {

	@Autowired
	Environment env;

	@Value("${codotics.username}")
	String user;

	@Value("${codotics.password}")
	String password;

	@Value("${codotics.dburl}")
	String url;

	@Value("${codotics.jms.username}")
	String jmsUserName;

	@Value("${codotics.jms.password}")
	String jmsPassword;

	@Value("${codotics.jms.url}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fds = new FakeDataSource();
		fds.setUser(env.getProperty("USERNAME"));
		fds.setPassword(password);
		fds.setUrl(url);
		return fds;
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fjb = new FakeJmsBroker();
		fjb.setUserName(jmsUserName);
		fjb.setPassword(jmsPassword);
		fjb.setUrl(jmsUrl);
		return fjb;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}

package com.codotics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.context.ApplicationContext;

import com.codotics.controllers.MyController;
import com.codotics.examplebeans.CustomProperties;
import com.codotics.examplebeans.FakeDataSource;
import com.codotics.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUserName());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());

		CustomProperties cp = (CustomProperties) ctx.getBean(CustomProperties.class);

		System.out.println(cp.getCustomUserName());
	}

}

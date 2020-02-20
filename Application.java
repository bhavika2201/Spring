package com.log;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String s[]) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Log log = applicationContext.getBean("DbFile", Log.class);
		log.log();
	User log1 = applicationContext.getBean("User", User.class);
		//log.log1();
		System.out.println(log1);
//		Log log1 = applicationContext.getBean("FileLogger", FileLogger.class);
//		log1.log();
//
//		System.out.println(log.hashCode());
//		System.out.println(log1.hashCode());
		CollectionTest c=applicationContext.getBean("col",CollectionTest.class);
		c.getAddressList();

		c.getAddressSet();
		c.getAddressMap();
		c.getAddressProp();
		applicationContext.close();
	}
}

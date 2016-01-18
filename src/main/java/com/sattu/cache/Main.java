package com.sattu.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DummyDao dao = context.getBean(DummyDao.class);
		long t1 = System.currentTimeMillis();
		System.out.println(dao.getDealerID("pingu"));
		long t2 = System.currentTimeMillis();
		System.out.println(dao.getDealerID("pingu"));
		long t3 = System.currentTimeMillis();
		System.out.println("First Call:  "+(t2-t1));
		System.out.println("Second Call:  "+(t3-t2));
	}

}

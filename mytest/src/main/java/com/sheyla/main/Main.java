package com.sheyla.main;

import com.sheyla.app.Appconfig;
import com.sheyla.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: sheyla
 * @Date:Create：in 2019/6/29 21:08
 * @Modified By：
 * @Description: 第一类
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		TestDao testDao = annotationConfigApplicationContext.getBean(TestDao.class);
		testDao.query();

	}

}

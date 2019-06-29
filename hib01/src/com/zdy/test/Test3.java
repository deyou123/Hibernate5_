package com.zdy.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sun.xml.internal.ws.Closeable;
import com.zdy.entity.School;

public class Test3 {
	/*
	 * 修改数据
	 * */
	public static void main(String[] args) {
		
			//加载配置文件
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//创建会话工厂
			SessionFactory factory = cfg.buildSessionFactory();
			//创建会话
			Session session = factory.openSession();
			//开启事务
			Transaction tran = session.beginTransaction();
			
			
			// 根据主键查询对象
			School school = session.get(School.class, 1);
			//实例化对象
		
			school.setScname("西安四中");
			session.update(school);
			
			
			//提交事务
			tran.commit();
			System.out.println("修改School成功");
			//关闭会话
			session.close();
			//关闭工厂释放资源
			factory.close();
	
	}
}

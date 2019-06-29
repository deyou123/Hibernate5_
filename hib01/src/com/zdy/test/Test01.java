package com.zdy.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sun.xml.internal.ws.Closeable;
import com.zdy.entity.School;

public class Test01 {
	public static void main(String[] args) {
		
			//���������ļ�
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//�����Ự����
			SessionFactory factory = cfg.buildSessionFactory();
			//�����Ự
			Session session = factory.openSession();
			
			//����������ѯ����
			School school = session.get(School.class, 1);
			System.out.println("===" + school);
			
			//�رջỰ
			session.close();
			//�رչ����ͷ���Դ
			factory.close();
	
	}
}

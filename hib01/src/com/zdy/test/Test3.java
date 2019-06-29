package com.zdy.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sun.xml.internal.ws.Closeable;
import com.zdy.entity.School;

public class Test3 {
	/*
	 * �޸�����
	 * */
	public static void main(String[] args) {
		
			//���������ļ�
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			//�����Ự����
			SessionFactory factory = cfg.buildSessionFactory();
			//�����Ự
			Session session = factory.openSession();
			//��������
			Transaction tran = session.beginTransaction();
			
			
			// ����������ѯ����
			School school = session.get(School.class, 1);
			//ʵ��������
		
			school.setScname("��������");
			session.update(school);
			
			
			//�ύ����
			tran.commit();
			System.out.println("�޸�School�ɹ�");
			//�رջỰ
			session.close();
			//�رչ����ͷ���Դ
			factory.close();
	
	}
}

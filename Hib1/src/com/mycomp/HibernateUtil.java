package com.mycomp;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private  static  SessionFactory sf=null;

public  static SessionFactory getSessionFactory(){
	if(sf==null){
		sf=new Configuration().configure().buildSessionFactory();
		System.out.println(sf);
	}
		return sf;
}
}

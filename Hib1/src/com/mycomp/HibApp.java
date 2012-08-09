package com.mycomp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		session = HibernateUtil.getSessionFactory().openSession();
				
		System.out.println("Inserting Record");
		
		 Emp emp = new Emp("alam2","software",40006,"Ranchi2");
		

		try {
			tx = session.beginTransaction();
			
			
			session.save(emp);//Object becomes Persistence Object and every persistence object 
			                   //is available in its session cache with the primary key 1
			
			Emp e=(Emp)session.get(Emp.class, 1);
			System.out.println(e.getEmpNumber());
			System.out.println(e.getEmpName());
			//session.flush();
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
				try {
					throw e;
				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}
		}

		finally {
			session.close();
		}
	}
}

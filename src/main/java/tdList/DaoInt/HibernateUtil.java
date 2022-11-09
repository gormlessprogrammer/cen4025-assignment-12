package tdList.DaoInt;

import org.hibernate.cfg.Configuration;

import tdlist.pojo.tdListDetails;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure("/hibernate.cfg.xml")
					.addPackage("tdlist.pojo").addAnnotatedClass(tdListDetails.class).buildSessionFactory();
		} catch (Throwable exception) {
			System.err.println("SessionFactory creation error! " + exception);
			throw new ExceptionInInitializerError(exception);
		}
	}

		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}
	}

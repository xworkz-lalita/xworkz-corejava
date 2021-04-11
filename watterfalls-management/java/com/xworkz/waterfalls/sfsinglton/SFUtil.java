package com.xworkz.waterfalls.sfsinglton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfalls.sfexception.SessionFactoryException;

public class SFUtil {
	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	private SFUtil() {
		System.out.println("created SFUtil factory");
	}

	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			factory = cfg.buildSessionFactory();
			if (cfg != null) {
				System.out.println("SF util is created successfully");
			} else {
				throw new SessionFactoryException("SF util is not created");
			}
		} catch (Exception e) {
			throw new SessionFactoryException(e.getMessage());
		}
	}
}

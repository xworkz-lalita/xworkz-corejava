package com.xworkz.util.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class SFUtil {
	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			factory = cfg.buildSessionFactory();
			if (factory != null) {
				System.out.println("SFUtil created successfully ");
			} else {
				throw new SessionFactoryException("SfUtil not created ");
			}
		} catch (Exception e) {
			throw new SessionFactoryException(e.getMessage());
		}

}}
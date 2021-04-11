package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
private static EntityManagerFactory factory;

public static EntityManagerFactory getFactory() {
	return factory;
}

static {
	try {
	factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
	if(factory!=null) {
		System.out.println("load the factory");
	}else {
		throw new EMFException("cannot load the factory");
	}
	}catch (Exception e) {
		throw new EMFException(e.getMessage());
	}
}

}

package com.xworkz.cartoon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;
import com.xworkz.util.util.SFUtil;

public class CartoonDAOImpl implements CartoonDAO {
	private List<CartoonEntity> entity;
	private SessionFactory factory = SFUtil.getFactory();
	Transaction transaction = null;

	public CartoonDAOImpl() {
		System.out.println("created cartoon impl");
	}

	@Override
	public void saveAll(List<CartoonEntity> entity) {
		System.out.println("created cartoon");
		System.out.println("entity" + entity);
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			for (CartoonEntity coupounEntity : entity) {
				session.save(coupounEntity);
			}
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public CartoonEntity findByName(String name) {
		try (Session session = factory.openSession()) {
			String hql = "select CART from CartoonEntity CART where CART.name='" + name + "' ";
			Query<CartoonEntity> query = session.createQuery(hql);
			CartoonEntity entity = query.uniqueResult();
			return entity;
		}

	}

	@Override
	public CartoonEntity findByChannelAndLanguage(ChannelName channelName, String language) {
		try (Session session = factory.openSession()) {
			String hql = "select CART from CartoonEntity CART where CART.channelName=:cm AND CART.language=:lang";
			Query<CartoonEntity> query = session.createQuery(hql);
			query.setParameter("cm",channelName);
			query.setParameter("lang",language);
			CartoonEntity entity = query.uniqueResult();
			return entity;
		}
	}
}

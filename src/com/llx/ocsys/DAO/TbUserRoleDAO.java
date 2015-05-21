package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbUserRole;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbUserRole entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbUserRole
 * @author MyEclipse Persistence Tools
 */
public class TbUserRoleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbUserRoleDAO.class);
	// property constants
	public static final String USER_NUMBER = "userNumber";
	public static final String IDENTITY_NAME = "identityName";
	public static final String IDENTITY_POWER = "identityPower";

	public void save(TbUserRole transientInstance) {
		log.debug("saving TbUserRole instance");
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			transaction.begin();
			getSession().save(transientInstance);
			transaction.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbUserRole persistentInstance) {
		log.debug("deleting TbUserRole instance");
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			transaction.begin();
			getSession().delete(persistentInstance);
			transaction.commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbUserRole findById(java.lang.Integer id) {
		log.debug("getting TbUserRole instance with id: " + id);
		try {
			TbUserRole instance = (TbUserRole) getSession().get(
					"com.llx.ocsys.entity.TbUserRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbUserRole instance) {
		log.debug("finding TbUserRole instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbUserRole")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbUserRole instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbUserRole as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserNumber(Object userNumber) {
		return findByProperty(USER_NUMBER, userNumber);
	}

	public List findByIdentityName(Object identityName) {
		return findByProperty(IDENTITY_NAME, identityName);
	}

	public List findByIdentityPower(Object identityPower) {
		return findByProperty(IDENTITY_POWER, identityPower);
	}

	public List findAll() {
		log.debug("finding all TbUserRole instances");
		try {
			String queryString = "from TbUserRole";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbUserRole merge(TbUserRole detachedInstance) {
		log.debug("merging TbUserRole instance");
		try {
			TbUserRole result = (TbUserRole) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbUserRole instance) {
		log.debug("attaching dirty TbUserRole instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbUserRole instance) {
		log.debug("attaching clean TbUserRole instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
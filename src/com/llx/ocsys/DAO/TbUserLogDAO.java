package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbUserLog;

import java.sql.Timestamp;
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
 * TbUserLog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbUserLog
 * @author MyEclipse Persistence Tools
 */
public class TbUserLogDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbUserLogDAO.class);
	// property constants
	public static final String USER_NUMBER = "userNumber";

	public void save(TbUserLog transientInstance) {
		log.debug("saving TbUserLog instance");
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

	public void delete(TbUserLog persistentInstance) {
		log.debug("deleting TbUserLog instance");
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

	public TbUserLog findById(java.lang.Integer id) {
		log.debug("getting TbUserLog instance with id: " + id);
		try {
			TbUserLog instance = (TbUserLog) getSession().get(
					"com.llx.ocsys.entity.TbUserLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbUserLog instance) {
		log.debug("finding TbUserLog instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbUserLog")
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
		log.debug("finding TbUserLog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbUserLog as model where model."
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

	public List findAll() {
		log.debug("finding all TbUserLog instances");
		try {
			String queryString = "from TbUserLog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbUserLog merge(TbUserLog detachedInstance) {
		log.debug("merging TbUserLog instance");
		try {
			TbUserLog result = (TbUserLog) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbUserLog instance) {
		log.debug("attaching dirty TbUserLog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbUserLog instance) {
		log.debug("attaching clean TbUserLog instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
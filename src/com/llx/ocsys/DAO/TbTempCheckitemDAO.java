package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbTempCheckitem;

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
 * TbTempCheckitem entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbTempCheckitem
 * @author MyEclipse Persistence Tools
 */
public class TbTempCheckitemDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbTempCheckitemDAO.class);
	// property constants
	public static final String TEMP_CHECKITEM_NUMBER = "tempCheckitemNumber";
	public static final String TEMP_CHECKITEM_NAME = "tempCheckitemName";
	public static final String TEMP_CHECKITEM_FEE = "tempCheckitemFee";
	public static final String TEMP_CHECKITEM_AMOUNT = "tempCheckitemAmount";
	public static final String TEMP_CHECKITEM_SUBTOTAL = "tempCheckitemSubtotal";
	public static final String REGISTRATION_NUMBER = "registrationNumber";
	
	private Session session;

	public void save(TbTempCheckitem transientInstance) {
		log.debug("saving TbTempCheckitem instance");
		try {
			session = getSession();
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

	public void delete(TbTempCheckitem persistentInstance) {
		log.debug("deleting TbTempCheckitem instance");
		try {
			session = getSession();
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

	public TbTempCheckitem findById(java.lang.Integer id) {
		log.debug("getting TbTempCheckitem instance with id: " + id);
		try {
			TbTempCheckitem instance = (TbTempCheckitem) getSession().get(
					"com.llx.ocsys.entity.TbTempCheckitem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbTempCheckitem instance) {
		log.debug("finding TbTempCheckitem instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbTempCheckitem")
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
		log.debug("finding TbTempCheckitem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbTempCheckitem as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTempCheckitemNumber(Object tempCheckitemNumber) {
		return findByProperty(TEMP_CHECKITEM_NUMBER, tempCheckitemNumber);
	}

	public List findByTempCheckitemName(Object tempCheckitemName) {
		return findByProperty(TEMP_CHECKITEM_NAME, tempCheckitemName);
	}

	public List findByTempCheckitemFee(Object tempCheckitemFee) {
		return findByProperty(TEMP_CHECKITEM_FEE, tempCheckitemFee);
	}

	public List findByTempCheckitemAmount(Object tempCheckitemAmount) {
		return findByProperty(TEMP_CHECKITEM_AMOUNT, tempCheckitemAmount);
	}

	public List findByTempCheckitemSubtotal(Object tempCheckitemSubtotal) {
		return findByProperty(TEMP_CHECKITEM_SUBTOTAL, tempCheckitemSubtotal);
	}

	public List findByRegistrationNumber(Object registrationNumber) {
		return findByProperty(REGISTRATION_NUMBER, registrationNumber);
	}

	public List findAll() {
		log.debug("finding all TbTempCheckitem instances");
		try {
			String queryString = "from TbTempCheckitem";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbTempCheckitem merge(TbTempCheckitem detachedInstance) {
		log.debug("merging TbTempCheckitem instance");
		try {
			TbTempCheckitem result = (TbTempCheckitem) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbTempCheckitem instance) {
		log.debug("attaching dirty TbTempCheckitem instance");
		try {
			session = getSession();
			Transaction transaction = session.beginTransaction();
			transaction.begin();
			getSession().saveOrUpdate(instance);
			transaction.commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbTempCheckitem instance) {
		log.debug("attaching clean TbTempCheckitem instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
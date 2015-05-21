package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbUsedCheckitem;

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
 * TbUsedCheckitem entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbUsedCheckitem
 * @author MyEclipse Persistence Tools
 */
public class TbUsedCheckitemDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbUsedCheckitemDAO.class);
	// property constants
	public static final String USED_CHECKITEM_NUMBER = "usedCheckitemNumber";
	public static final String USED_CHECKITEM_NAME = "usedCheckitemName";
	public static final String USED_CHECKITEM_FEE = "usedCheckitemFee";
	public static final String USED_CHECKITEM_AMOUNT = "usedCheckitemAmount";
	public static final String USED_CHECKITEM_SUBTOTAL = "usedCheckitemSubtotal";
	public static final String BILL_NUMBER = "billNumber";
	
	private Session session;

	public void save(TbUsedCheckitem transientInstance) {
		log.debug("saving TbUsedCheckitem instance");
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

	public void delete(TbUsedCheckitem persistentInstance) {
		log.debug("deleting TbUsedCheckitem instance");
		try {
			session = getSession();
			Transaction transaction = session.beginTransaction();
			transaction.begin();
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbUsedCheckitem findById(java.lang.Integer id) {
		log.debug("getting TbUsedCheckitem instance with id: " + id);
		try {
			TbUsedCheckitem instance = (TbUsedCheckitem) getSession().get(
					"com.llx.ocsys.entity.TbUsedCheckitem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbUsedCheckitem instance) {
		log.debug("finding TbUsedCheckitem instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbUsedCheckitem")
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
		log.debug("finding TbUsedCheckitem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbUsedCheckitem as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsedCheckitemNumber(Object usedCheckitemNumber) {
		return findByProperty(USED_CHECKITEM_NUMBER, usedCheckitemNumber);
	}

	public List findByUsedCheckitemName(Object usedCheckitemName) {
		return findByProperty(USED_CHECKITEM_NAME, usedCheckitemName);
	}

	public List findByUsedCheckitemFee(Object usedCheckitemFee) {
		return findByProperty(USED_CHECKITEM_FEE, usedCheckitemFee);
	}

	public List findByUsedCheckitemAmount(Object usedCheckitemAmount) {
		return findByProperty(USED_CHECKITEM_AMOUNT, usedCheckitemAmount);
	}

	public List findByUsedCheckitemSubtotal(Object usedCheckitemSubtotal) {
		return findByProperty(USED_CHECKITEM_SUBTOTAL, usedCheckitemSubtotal);
	}

	public List findByBillNumber(Object billNumber) {
		return findByProperty(BILL_NUMBER, billNumber);
	}

	public List findAll() {
		log.debug("finding all TbUsedCheckitem instances");
		try {
			String queryString = "from TbUsedCheckitem";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbUsedCheckitem merge(TbUsedCheckitem detachedInstance) {
		log.debug("merging TbUsedCheckitem instance");
		try {
			TbUsedCheckitem result = (TbUsedCheckitem) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbUsedCheckitem instance) {
		log.debug("attaching dirty TbUsedCheckitem instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbUsedCheckitem instance) {
		log.debug("attaching clean TbUsedCheckitem instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
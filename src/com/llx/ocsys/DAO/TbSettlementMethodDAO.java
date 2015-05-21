package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbSettlementMethod;

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
 * TbSettlementMethod entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbSettlementMethod
 * @author MyEclipse Persistence Tools
 */
public class TbSettlementMethodDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSettlementMethodDAO.class);
	// property constants
	public static final String SETTLEMENT_METHOD = "settlementMethod";
	public static final String SETTLEMENT_CHARGE_RATIO = "settlementChargeRatio";

	public void save(TbSettlementMethod transientInstance) {
		log.debug("saving TbSettlementMethod instance");
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

	public void delete(TbSettlementMethod persistentInstance) {
		log.debug("deleting TbSettlementMethod instance");
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

	public TbSettlementMethod findById(java.lang.Integer id) {
		log.debug("getting TbSettlementMethod instance with id: " + id);
		try {
			TbSettlementMethod instance = (TbSettlementMethod) getSession()
					.get("com.llx.ocsys.entity.TbSettlementMethod", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbSettlementMethod instance) {
		log.debug("finding TbSettlementMethod instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbSettlementMethod")
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
		log.debug("finding TbSettlementMethod instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSettlementMethod as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySettlementMethod(Object settlementMethod) {
		return findByProperty(SETTLEMENT_METHOD, settlementMethod);
	}

	public List findBySettlementChargeRatio(Object settlementChargeRatio) {
		return findByProperty(SETTLEMENT_CHARGE_RATIO, settlementChargeRatio);
	}

	public List findAll() {
		log.debug("finding all TbSettlementMethod instances");
		try {
			String queryString = "from TbSettlementMethod";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbSettlementMethod merge(TbSettlementMethod detachedInstance) {
		log.debug("merging TbSettlementMethod instance");
		try {
			TbSettlementMethod result = (TbSettlementMethod) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSettlementMethod instance) {
		log.debug("attaching dirty TbSettlementMethod instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSettlementMethod instance) {
		log.debug("attaching clean TbSettlementMethod instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
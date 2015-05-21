package com.llx.ocsys.DAO;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.sql.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.llx.ocsys.entity.TbTempDrug;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbTempDrug entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbTempDrug
 * @author MyEclipse Persistence Tools
 */
public class TbTempDrugDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbTempDrugDAO.class);
	// property constants
	public static final String TEMP_DRUG_NUMBER = "tempDrugNumber";
	public static final String TEMP_DRUG_NAME = "tempDrugName";
	public static final String TEMP_DRUG_FEE = "tempDrugFee";
	public static final String TEMP_DRUG_AMOUNT = "tempDrugAmount";
	public static final String TEMP_DRUG_SUBTOTAL = "tempDrugSubtotal";
	public static final String REGISTRATION_NUMBER = "registrationNumber";

	private Session session = getSession();;

	public void save(TbTempDrug transientInstance) {
		log.debug("saving TbTempDrug instance");
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

	public void delete(TbTempDrug persistentInstance) {
		log.debug("deleting TbTempDrug instance");
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

	public TbTempDrug findById(java.lang.Integer id) {
		log.debug("getting TbTempDrug instance with id: " + id);
		try {
			TbTempDrug instance = (TbTempDrug) getSession().get(
					"com.llx.ocsys.entity.TbTempDrug", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbTempDrug instance) {
		log.debug("finding TbTempDrug instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbTempDrug")
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
		log.debug("finding TbTempDrug instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbTempDrug as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTempDrugNumber(Object tempDrugNumber) {
		return findByProperty(TEMP_DRUG_NUMBER, tempDrugNumber);
	}

	public List findByTempDrugName(Object tempDrugName) {
		return findByProperty(TEMP_DRUG_NAME, tempDrugName);
	}

	public List findByTempDrugFee(Object tempDrugFee) {
		return findByProperty(TEMP_DRUG_FEE, tempDrugFee);
	}

	public List findByTempDrugAmount(Object tempDrugAmount) {
		return findByProperty(TEMP_DRUG_AMOUNT, tempDrugAmount);
	}

	public List findByTempDrugSubtotal(Object tempDrugSubtotal) {
		return findByProperty(TEMP_DRUG_SUBTOTAL, tempDrugSubtotal);
	}

	public List findByRegistrationNumber(Object registrationNumber) {
		return findByProperty(REGISTRATION_NUMBER, registrationNumber);
	}

	public List findAll() {
		log.debug("finding all TbTempDrug instances");
		try {
			String queryString = "from TbTempDrug";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbTempDrug merge(TbTempDrug detachedInstance) {
		log.debug("merging TbTempDrug instance");
		try {
			TbTempDrug result = (TbTempDrug) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

//	public void update(TbTempDrug detachedInstance) {
//		log.debug("merging TbTempDrug instance");
//		try {
//			// session = getSession();
//			transaction = session.beginTransaction();
//			transaction.begin();
//			getSession().update(detachedInstance);
//			transaction.commit();
//			log.debug("merge successful");
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}

	public void attachDirty(TbTempDrug instance) {
		log.debug("attaching dirty TbTempDrug instance");
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

	public void attachClean(TbTempDrug instance) {
		log.debug("attaching clean TbTempDrug instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
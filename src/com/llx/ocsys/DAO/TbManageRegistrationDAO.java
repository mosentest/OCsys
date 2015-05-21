package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbManageRegistration;

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
 * TbManageRegistration entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbManageRegistration
 * @author MyEclipse Persistence Tools
 */
public class TbManageRegistrationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbManageRegistrationDAO.class);
	// property constants
	public static final String REGISTRATION_NUMBER = "registrationNumber";
	public static final String REGISTRATION_STATUS = "registrationStatus";
	public static final String PATIENT_NAME = "patientName";
	public static final String PATIENT_SEX = "patientSex";
	public static final String PATIENT_AGE = "patientAge";
	public static final String PATIENT_TYPE = "patientType";
	public static final String SETTLEMENT_METHOD = "settlementMethod";
	
	private Session session;

	public void save(TbManageRegistration transientInstance) {
		log.debug("saving TbManageRegistration instance");
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

	public void delete(TbManageRegistration persistentInstance) {
		log.debug("deleting TbManageRegistration instance");
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

	public TbManageRegistration findById(java.lang.Integer id) {
		log.debug("getting TbManageRegistration instance with id: " + id);
		try {
			TbManageRegistration instance = (TbManageRegistration) getSession()
					.get("com.llx.ocsys.entity.TbManageRegistration", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbManageRegistration instance) {
		log.debug("finding TbManageRegistration instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbManageRegistration")
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
		log.debug("finding TbManageRegistration instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbManageRegistration as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRegistrationNumber(Object registrationNumber) {
		return findByProperty(REGISTRATION_NUMBER, registrationNumber);
	}

	public List findByRegistrationStatus(Object registrationStatus) {
		return findByProperty(REGISTRATION_STATUS, registrationStatus);
	}

	public List findByPatientName(Object patientName) {
		return findByProperty(PATIENT_NAME, patientName);
	}

	public List findByPatientSex(Object patientSex) {
		return findByProperty(PATIENT_SEX, patientSex);
	}

	public List findByPatientAge(Object patientAge) {
		return findByProperty(PATIENT_AGE, patientAge);
	}

	public List findByPatientType(Object patientType) {
		return findByProperty(PATIENT_TYPE, patientType);
	}

	public List findBySettlementMethod(Object settlementMethod) {
		return findByProperty(SETTLEMENT_METHOD, settlementMethod);
	}

	public List findAll() {
		log.debug("finding all TbManageRegistration instances");
		try {
			String queryString = "from TbManageRegistration";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbManageRegistration merge(TbManageRegistration detachedInstance) {
		log.debug("merging TbManageRegistration instance");
		try {
			TbManageRegistration result = (TbManageRegistration) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbManageRegistration instance) {
		log.debug("attaching dirty TbManageRegistration instance");
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

	public void attachClean(TbManageRegistration instance) {
		log.debug("attaching clean TbManageRegistration instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
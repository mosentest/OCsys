package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbDrugInformation;

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
 * TbDrugInformation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbDrugInformation
 * @author MyEclipse Persistence Tools
 */
public class TbDrugInformationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbDrugInformationDAO.class);
	// property constants
	public static final String DRUG_NUMBER = "drugNumber";
	public static final String DRUG_NAME = "drugName";
	public static final String DRUG_SPECIFICATIONS = "drugSpecifications";
	public static final String DRUG_UNIT = "drugUnit";
	public static final String DRUG_FEE = "drugFee";
	
	private Session session;

	public void save(TbDrugInformation transientInstance) {
		log.debug("saving TbDrugInformation instance");
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

	public void delete(TbDrugInformation persistentInstance) {
		log.debug("deleting TbDrugInformation instance");
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

	public TbDrugInformation findById(java.lang.Integer id) {
		log.debug("getting TbDrugInformation instance with id: " + id);
		try {
			TbDrugInformation instance = (TbDrugInformation) getSession().get(
					"com.llx.ocsys.entity.TbDrugInformation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbDrugInformation instance) {
		log.debug("finding TbDrugInformation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbDrugInformation")
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
		log.debug("finding TbDrugInformation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbDrugInformation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDrugNumber(Object drugNumber) {
		return findByProperty(DRUG_NUMBER, drugNumber);
	}

	public List findByDrugName(Object drugName) {
		return findByProperty(DRUG_NAME, drugName);
	}

	public List findByDrugSpecifications(Object drugSpecifications) {
		return findByProperty(DRUG_SPECIFICATIONS, drugSpecifications);
	}

	public List findByDrugUnit(Object drugUnit) {
		return findByProperty(DRUG_UNIT, drugUnit);
	}

	public List findByDrugFee(Object drugFee) {
		return findByProperty(DRUG_FEE, drugFee);
	}

	public List findAll() {
		log.debug("finding all TbDrugInformation instances");
		try {
			String queryString = "from TbDrugInformation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbDrugInformation merge(TbDrugInformation detachedInstance) {
		log.debug("merging TbDrugInformation instance");
		try {
			TbDrugInformation result = (TbDrugInformation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbDrugInformation instance) {
		log.debug("attaching dirty TbDrugInformation instance");
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

	public void attachClean(TbDrugInformation instance) {
		log.debug("attaching clean TbDrugInformation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.llx.ocsys.DAO;

import com.llx.ocsys.entity.TbUsedDrug;

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
 * TbUsedDrug entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbUsedDrug
 * @author MyEclipse Persistence Tools
 */
public class TbUsedDrugDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbUsedDrugDAO.class);
	// property constants
	public static final String USED_DRUG_NUMBER = "usedDrugNumber";
	public static final String USED_DRUG_NAME = "usedDrugName";
	public static final String USED_DRUG_FEE = "usedDrugFee";
	public static final String USED_DRUG_AMOUNT = "usedDrugAmount";
	public static final String USED_DRUG_SUBTOTAL = "usedDrugSubtotal";
	public static final String BILL_NUMBER = "billNumber";
	
	private Session session;

	public void save(TbUsedDrug transientInstance) {
		log.debug("saving TbUsedDrug instance");
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

	public void delete(TbUsedDrug persistentInstance) {
		log.debug("deleting TbUsedDrug instance");
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

	public TbUsedDrug findById(java.lang.Integer id) {
		log.debug("getting TbUsedDrug instance with id: " + id);
		try {
			TbUsedDrug instance = (TbUsedDrug) getSession().get(
					"com.llx.ocsys.entity.TbUsedDrug", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbUsedDrug instance) {
		log.debug("finding TbUsedDrug instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbUsedDrug")
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
		log.debug("finding TbUsedDrug instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbUsedDrug as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsedDrugNumber(Object usedDrugNumber) {
		return findByProperty(USED_DRUG_NUMBER, usedDrugNumber);
	}

	public List findByUsedDrugName(Object usedDrugName) {
		return findByProperty(USED_DRUG_NAME, usedDrugName);
	}

	public List findByUsedDrugFee(Object usedDrugFee) {
		return findByProperty(USED_DRUG_FEE, usedDrugFee);
	}

	public List findByUsedDrugAmount(Object usedDrugAmount) {
		return findByProperty(USED_DRUG_AMOUNT, usedDrugAmount);
	}

	public List findByUsedDrugSubtotal(Object usedDrugSubtotal) {
		return findByProperty(USED_DRUG_SUBTOTAL, usedDrugSubtotal);
	}

	public List findByBillNumber(Object billNumber) {
		return findByProperty(BILL_NUMBER, billNumber);
	}

	public List findAll() {
		log.debug("finding all TbUsedDrug instances");
		try {
			String queryString = "from TbUsedDrug";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbUsedDrug merge(TbUsedDrug detachedInstance) {
		log.debug("merging TbUsedDrug instance");
		try {
			TbUsedDrug result = (TbUsedDrug) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbUsedDrug instance) {
		log.debug("attaching dirty TbUsedDrug instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbUsedDrug instance) {
		log.debug("attaching clean TbUsedDrug instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
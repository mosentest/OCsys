package com.llx.ocsys.DAO;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.llx.ocsys.entity.TbBillsInformation;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbBillsInformation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.llx.ocsys.entity.TbBillsInformation
 * @author MyEclipse Persistence Tools
 */
public class TbBillsInformationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbBillsInformationDAO.class);
	// property constants
	public static final String BILL_NUMBER = "billNumber";
	public static final String BILL_STATUS = "billStatus";
	public static final String SHOULD_CHARGE = "shouldCharge";
	public static final String ACTUAL_CHARGE = "actualCharge";
	public static final String ODD_CHANGE = "oddChange";
	public static final String REGISTRATION_NUMBER = "registrationNumber";
	public static final String USER_NUMBER = "userNumber";

	private Session session;
	
	public List<TbBillsInformation> findByToday(String today) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			StringBuffer sql = new StringBuffer();
			sql.append(" select * from tb_bills_information ");
			sql.append(" where ");
//			sql.append(" payment_time > ? and user_number = ? ");
			sql.append(" payment_time > ?");
			SQLQuery createSQLQuery = session.createSQLQuery(sql.toString());
			createSQLQuery.setString(0, today);
//			createSQLQuery.setString(1, userNumber);
//			System.out.println("sql="+sql);
			List<TbBillsInformation> list = createSQLQuery.addEntity(TbBillsInformation.class).list();
//			transaction.commit();
			return list;
		} catch (RuntimeException re) {
			throw re;
		} finally {
			session.close();
		}
	}

	// 2014-5-1 -> 2015-5-1
	// private Timestamp paymentTime;
	// private Timestamp refundTime;
	public List<TbBillsInformation> findByPaymentTime(String beginDate,
			String endData) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			StringBuffer sql = new StringBuffer();
			sql.append(" select * from tb_bills_information ");
			sql.append(" where ");
			sql.append(" payment_time > ? and payment_time < ? ");
			SQLQuery createSQLQuery = session.createSQLQuery(sql.toString());
			createSQLQuery.setString(0, beginDate);
			createSQLQuery.setString(1, endData);
			List<TbBillsInformation> list = createSQLQuery.list();
			transaction.commit();
			return list;
		} catch (RuntimeException re) {
			throw re;
		} finally {
			session.close();
		}
	}

	public List<TbBillsInformation> findByRefundTime(String beginDate,
			String endData) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			StringBuffer sql = new StringBuffer();
			sql.append(" select * from tb_bills_information ");
			sql.append(" where ");
			sql.append(" refund_time > ? and refund_time < ? ");
			SQLQuery createSQLQuery = session.createSQLQuery(sql.toString());
			createSQLQuery.setString(0, beginDate);
			createSQLQuery.setString(1, endData);
			List<TbBillsInformation> list = createSQLQuery.list();
			transaction.commit();
			return list;
		} catch (RuntimeException re) {
			throw re;
		} finally {
			session.close();
		}
	}

	public static void main(String[] args) {
		TbBillsInformationDAO billsInformationDAO = new TbBillsInformationDAO();
		List<TbBillsInformation> findByPaymentTime = billsInformationDAO
				.findByPaymentTime("2014-5-1 10:10:00", "");
		System.out.println(findByPaymentTime.size());
	}

	public void save(TbBillsInformation transientInstance) {
		log.debug("saving TbBillsInformation instance");
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

	public void delete(TbBillsInformation persistentInstance) {
		log.debug("deleting TbBillsInformation instance");
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

	public TbBillsInformation findById(java.lang.Integer id) {
		log.debug("getting TbBillsInformation instance with id: " + id);
		try {
			TbBillsInformation instance = (TbBillsInformation) getSession()
					.get("com.llx.ocsys.entity.TbBillsInformation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbBillsInformation instance) {
		log.debug("finding TbBillsInformation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.llx.ocsys.entity.TbBillsInformation")
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
		log.debug("finding TbBillsInformation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbBillsInformation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBillNumber(Object billNumber) {
		return findByProperty(BILL_NUMBER, billNumber);
	}

	public List findByBillStatus(Object billStatus) {
		return findByProperty(BILL_STATUS, billStatus);
	}

	public List findByShouldCharge(Object shouldCharge) {
		return findByProperty(SHOULD_CHARGE, shouldCharge);
	}

	public List findByActualCharge(Object actualCharge) {
		return findByProperty(ACTUAL_CHARGE, actualCharge);
	}

	public List findByOddChange(Object oddChange) {
		return findByProperty(ODD_CHANGE, oddChange);
	}

	public List findByRegistrationNumber(Object registrationNumber) {
		return findByProperty(REGISTRATION_NUMBER, registrationNumber);
	}

	public List findByUserNumber(Object userNumber) {
		return findByProperty(USER_NUMBER, userNumber);
	}

	public List findAll() {
		log.debug("finding all TbBillsInformation instances");
		try {
			String queryString = "from TbBillsInformation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbBillsInformation merge(TbBillsInformation detachedInstance) {
		log.debug("merging TbBillsInformation instance");
		try {
			TbBillsInformation result = (TbBillsInformation) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbBillsInformation instance) {
		log.debug("attaching dirty TbBillsInformation instance");
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

	public void attachClean(TbBillsInformation instance) {
		log.debug("attaching clean TbBillsInformation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package tdList.DaoInt;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import tdList.Dao.tdListDao;
import tdlist.pojo.tdListDetails;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TdListDaoIntegration implements tdListDao {

	@Override
	public void saveTdListItem(tdListDetails tdListItem) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(tdListItem);
		transaction.commit();
		session.close();
	}

	@Override
	public List<tdListDetails> showAllTdListItems() {
		List<tdListDetails> tdList = new ArrayList<tdListDetails>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		//String hql = "select * from tdListItem";
		//Query<tdListDetails> query = session.createQuery("select tdindex, tditemname from tdlistitem");
		Criteria criteria = session.createCriteria(tdListDetails.class);
		//Query query = session.createQuery(hql);
		tdList = criteria.list();
		return tdList;
	}

	@Override
	public void updateTdList(int id, String tdListItem) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		tdListDetails tddetails = session.load(tdListDetails.class, id);
		tddetails.setId(id);
		tddetails.setTdListItem(tdListItem);
		session.update(tddetails);
		transaction.commit();
		session.close();
	}

	@Override
	public void deleteTdList(tdListDetails tdListItem) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(tdListItem);
		transaction.commit();
		session.close();
	}
	
	
}

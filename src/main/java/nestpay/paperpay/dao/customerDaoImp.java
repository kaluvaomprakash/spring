package nestpay.paperpay.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nestpay.paperpay.entity.customer;


@Repository
public class customerDaoImp implements customerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<customer> listCustomers() {
				Session currentSession = sessionFactory.getCurrentSession();
				Query<customer> theQuery = currentSession.createQuery("from Customer",customer.class);
				List<customer> customers = theQuery.getResultList();
				return customers;
}
}
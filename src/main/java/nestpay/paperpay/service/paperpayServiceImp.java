package nestpay.paperpay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import nestpay.paperpay.dao.customerDAO;
import nestpay.paperpay.entity.customer;

public class paperpayServiceImp implements paperpayService {

	
	@Autowired
	private customerDAO custDAo;
	
	@Override
	@Transactional
	public List<customer> listCustomers() {
		return custDAo.listCustomers();
	}

}

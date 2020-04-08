package nestpay.paperpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nestpay.paperpay.entity.customer;
import nestpay.paperpay.service.paperpayService;


@RestController
@RequestMapping("/customers")
public class customerController {
	@Autowired
	private paperpayService Pservice;

	@GetMapping("/")
	public List<customer> getCustomers(){
	return Pservice.listCustomers();
	}
}

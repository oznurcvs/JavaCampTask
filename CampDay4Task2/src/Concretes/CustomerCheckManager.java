package Concretes;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckRealIfPerson(Customer customer) {
		
		return true;
	}

}

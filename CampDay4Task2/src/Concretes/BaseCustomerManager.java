package Concretes;

import Abstracts.ICustomerService;
import Entities.Customer;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Save To DataBase" + " " + customer.getFirstName());
		
	}

}

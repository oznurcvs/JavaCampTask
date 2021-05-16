package Concretes;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void Save(Customer customer)  {
		
		if (customerCheckService.CheckRealIfPerson(customer)) {
			
			super.Save(customer);
			
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	

}

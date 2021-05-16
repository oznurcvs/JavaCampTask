package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckService {
	
	boolean CheckRealIfPerson(Customer customer)  ;
}

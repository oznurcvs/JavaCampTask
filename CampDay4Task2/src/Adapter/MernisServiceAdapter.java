package Adapter;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckRealIfPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		boolean end  = false;
		
		try {
			end= proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
			        customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		}
		
		catch(Exception e){
			System.out.println("Not a valid person");
		}
		
		return end;
		
	}

}

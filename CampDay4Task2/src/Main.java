import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concretes.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"oznur","cvs",LocalDate.of(1997, 4,22),"123456"));

	}

}

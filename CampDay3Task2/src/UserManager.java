
public class UserManager {
	
	public void add(User user) {
	System.out.println("Kullan�c� numaras�"+ user.getId() +" "+ "ve" + " " + "email'i"+ " "+ user.getEmail() + " "  + "olan kullan�c� giri� yapt�");
    }
	
	public void AddMultiple(User[] users) {
		for (User user: users) {
			add(user);
		}
		
	}

}

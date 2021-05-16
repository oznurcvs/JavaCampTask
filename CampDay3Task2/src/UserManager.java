
public class UserManager {
	
	public void add(User user) {
	System.out.println("Kullanýcý numarasý"+ user.getId() +" "+ "ve" + " " + "email'i"+ " "+ user.getEmail() + " "  + "olan kullanýcý giriþ yaptý");
    }
	
	public void AddMultiple(User[] users) {
		for (User user: users) {
			add(user);
		}
		
	}

}

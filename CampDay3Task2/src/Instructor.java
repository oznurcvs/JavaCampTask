
public class Instructor extends User {
	
	
	int Userid;
	String FirstName;
	String LastName;
	
	public Instructor(int id, String email, String password, int userid, String firstName, String lastName) {
		super(id, email, password);
		Userid = userid;
		FirstName = firstName;
		LastName = lastName;
	}
	
	

}


public class Student extends User {
	
	
	 int Userid;
	 String Firstname;
	 String LastName;
	



	public Student(int id, String email, String password, int userid, String firstname, String lastName) {
		super(id, email, password);
		Userid = userid;
		Firstname = firstname;
		LastName = lastName;
	}

	
}


public class User {

 private int id;
 private String Email;
 private String Password;
 
 public User(int id, String email, String password) {
	
	this.id = id;
	Email = email;
	Password = password;
}

 public int getId() {
	return id;
}

 public void setId(int id) {
	this.id = id;
}

 public String getEmail() {
	return Email;
}

 public void setEmail(String email) {
	this.Email = email;
}

 public String getPassword() {
	return Password;
}

 public void setPassword(String password) {
	this.Password = password;
}

}

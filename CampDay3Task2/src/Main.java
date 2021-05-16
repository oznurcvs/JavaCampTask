
public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager =new InstructorManager();
		Instructor instructor=new Instructor(1,"engin.demirog","123",1,"engin","demirog");
		
        StudentManager studentManager=new StudentManager();
		Student student =new Student(2,"oznur.cvs","456",2,"oznur","cvs");
		
		UserManager userManager =new UserManager();
		User[] users = {instructor, student};
		
		studentManager.add(student);
		instructorManager.add(instructor);
	
		
		userManager.AddMultiple(users);
		
		
		
		
		

	}

}

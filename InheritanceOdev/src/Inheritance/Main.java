package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		Instructor instructor = new Instructor();
		UserManager userManager = new UserManager();
		StudentManager  studentManager = new StudentManager();
		
		
		student.setId(1);
		student.setFirstName("Halis");
		student.setLastName("Bay");  
		student.setEmail("eminbay_58@hotmail.com");  
		student.setPhoneNumber("1111111111");  
		student.setCourse("Java & React");  
		student.setAddress("İstanbul");
		student.setAuthorize(false); 
		
		
		instructor.setId(2); 
		instructor.setFirstName("Engin");  
		instructor.setLastName("Demirog");  
		instructor.setEmail("engindemirogreiss@hotmail.com");  
		instructor.setPhoneNumber("333333333333333"); 
		instructor.setAddress("Ankara"); 
		instructor.setAuthorize(true);
		
		Student[] students = {student};
		User[] users = {student,instructor};
		
                userManager.addMultiple(users);
		studentManager.addCourse(students);
		
		
		
		
		

	}

}

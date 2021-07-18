package Inheritance;

public class StudentManager  {
	
	public void addCourse(Student[] students) 
	{
		for(Student student:students) 
		{
		System.out.println("Sevgili, "+student.getFirstName()+ " "
		+student.getCourse()  +" kampına Kaydınız başarıyla  yapılmıştır.");
		}
		
	}

}

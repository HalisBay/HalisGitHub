package Inheritance;

public class StudentManager  {
	
	public void addCourse(Student[] students) 
	{
		for(Student student:students) 
		{
		System.out.println("Sevgili, "+student.getFirstName()+ " "
		+student.getCourse()  +" kamp�na Kayd�n�z ba�ar�yla  yap�lm��t�r.");
		}
		
	}

}

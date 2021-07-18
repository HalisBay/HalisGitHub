package Inheritance;


public class UserManager {
	
	public void addMultiple(User[] users) 
	{
        for (User user : users) 
        {
        	System.out.println(" " + user.getId()+ " " + user.getFirstName() +" " +user.getLastName()+" " 
    				+user.getEmail()+" " + user.getPhoneNumber() +" " +user.getAddress()+". Yetki: " +
    							user.getAuthorize() +" " + "bilgileri ile sisteme giriþiniz yapýlmýþtýr");
        }
	
	}
	
	
}

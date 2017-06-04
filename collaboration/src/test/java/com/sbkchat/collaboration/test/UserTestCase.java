package com.sbkchat.collaboration.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sbkchat.collaboration.dao.UserDAO;
import com.sbkchat.collaboration.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static UserDAO userDAO;
	
	private static User user;
	
	@BeforeClass
	public static void init()
	{
		context =  new AnnotationConfigApplicationContext();
		context.scan("com.sbkchat.collaboration");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
	}
	
	/*@Test
	public void addUserTestCase()
	{
		User user = new User();
		
		user.setFirstName("Mahesh");
		user.setLastName("Waghmare");
		user.setUsername("Mahesh");
		user.setPassword("Mahesh@123");
		user.setEmailId("maheshwaghmare@gmail.com");
		user.setBirthDate(LocalDate.parse("1993-01-11")); //yyyy-mm-dd
		user.setGender('M');
		user.setPhone("9665224303");
		user.setRole("User");
		user.setStatus("APPROVED");
		user.setEnabled(true);
		user.setOnline(true);
		user.setProfile("noDp.jpg");
		
		assertEquals("You have Successfully saved a user along with authorities inside the database!",true,userDAO.addUser(user));
	}*/
	
	/*@Test
	public void updateUserTestCase()
	{
		//User user = new User();
		
		user = userDAO.getUserByUserName("Bhayyasaheb");
		user.setRole("Admin");
		
		assertEquals("Failed to updated User!",true, userDAO.updateUser(user));
	}*/
	
	@Test
	public void deleteUserTestCase()
	{
		user = userDAO.getUser(1005);
		
		assertEquals("Failed to delete User! ", true, userDAO.deleteUser(user));
		
	}
	
	@Test
	public void getAllUserByStatus()
	{
		int size = userDAO.list("APPROVED").size();
		
		assertEquals("Failed to get the all User!",4,size);
	}
	
	@Test
	public void getAllUser()
	{
		//int size  = userDAO.list().size();
		assertEquals("Failed to get the User!",4, userDAO.list().size());
	}
}




















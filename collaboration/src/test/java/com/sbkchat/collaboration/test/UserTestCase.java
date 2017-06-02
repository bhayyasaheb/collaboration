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
	
	private User user;
	
	@BeforeClass
	public static void init()
	{
		context =  new AnnotationConfigApplicationContext();
		context.scan("com.sbkchat.collaboration");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
	@Test
	public void addUserTestCase()
	{
		User user = new User();
		
		user.setFirstName("Bhayyasaheb");
		user.setLastName("Koke");
		user.setUsername("Bhayyasaheb");
		user.setPassword("SBK@123");
		user.setEmailId("bhayyasahebkoke@gmail.com");
		user.setBirthDate(LocalDate.parse("1993-04-30")); //yyyy-mm-dd
		user.setGender('M');
		user.setPhone("9730586363");
		user.setRole("Super_Admin");
		user.setStatus("APPROVED");
		user.setEnabled(true);
		user.setOnline(true);
		user.setProfile("noDp.jpg");
		
		assertEquals("You have Successfully saved a user along with authorities inside the database!",true,userDAO.addUser(user));
	}
}

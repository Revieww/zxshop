package me.gacl;


import java.util.List;

import me.gacl.dao.UserDao;
import me.gacl.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/spring-*.xml")
public class ProductTypeSpringTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void Test01(){
		
	 List<User> users = userDao.findAll();
	 System.out.println(users.size());
	}

}

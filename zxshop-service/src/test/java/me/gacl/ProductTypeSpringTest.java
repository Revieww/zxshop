package me.gacl;


import java.util.List;

import me.gacl.core.UserService;
import me.gacl.core.redis.RedisService;
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
	private RedisService redisService;
	
	@Test
	public void Test01(){
		redisService.setValue("user", "你好");
		System.out.println(redisService.getValue("user"));
	}

}

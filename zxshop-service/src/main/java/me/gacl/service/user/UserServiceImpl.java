package me.gacl.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.gacl.core.user.api.UserService;
import me.gacl.dao.UserDao;
import me.gacl.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void save() {
		User user = new User();
		userDao.save(user);
		
		//System.out.println(1/0);
	}
	
	
}

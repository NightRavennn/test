package aa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aa.dao.UserDao;
import aa.model.UserModel;
import aa.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public UserModel findUser(String uname,String pwd) {
		UserModel user=userDao.findUser(uname,pwd);
		return user;
	}
}

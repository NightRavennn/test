package aa.service;

import aa.model.UserModel;

public interface UserService {
	public UserModel findUser(String uname,String pwd);
}

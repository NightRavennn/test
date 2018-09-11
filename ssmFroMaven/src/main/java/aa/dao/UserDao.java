package aa.dao;

import aa.model.UserModel;

public interface UserDao {

	UserModel findUser(String uname, String pwd);

}

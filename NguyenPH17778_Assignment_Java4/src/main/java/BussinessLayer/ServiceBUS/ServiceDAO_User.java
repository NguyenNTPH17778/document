package BussinessLayer.ServiceBUS;

import java.util.List;


import BussinessLayer.Entities.User;
import BussinessLayer.IServiceBUS.IServiceUser;
import DataAccessLayer.ServiceUser;

public class ServiceDAO_User implements IServiceUser {
	// trong day ko co contructor , ko khoi? tao.o ServiceDao_user dc ,them contrutor zo di
	DataAccessLayer.ServiceUser user;
	public ServiceDAO_User() {//lai sai , nhin ne`
		user = new ServiceUser();//xem trong DAL co contructor chua
	}
	@Override
	public User addUser(User entity) throws Exception {
		return user.addUser(entity);
	}

	@Override
	public User UpdateUser(User entity) throws Exception {
		return user.UpdateUser(entity);
	}

	@Override
	public User DeleteCategory(User entity) throws Exception {
		return user.DeleteCategory(entity);
	}

	@Override
	public List<User> selectAll() throws Exception {
		return user.selectAll();
	}

	@Override
	public User findUser(int id) {
		return user.findUser(id);
	}

	@Override
	public User loginUser(String email, String password) {
		return user.loginUser(email, password);
	}

}

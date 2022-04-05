package BussinessLayer.IServiceBUS;

import java.util.List;


import BussinessLayer.Entities.*;

public interface IServiceUser {
	public User addUser(User entity) throws Exception;
	public User UpdateUser(User entity) throws Exception;
	public User DeleteCategory(User entity) throws Exception;
	public List<User> selectAll()throws Exception;
	public User findUser(int id);
	public User loginUser(String email, String password);
}
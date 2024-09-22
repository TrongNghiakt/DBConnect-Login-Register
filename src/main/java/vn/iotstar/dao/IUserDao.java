package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.User;

public interface IUserDao {

	void insert(User user);

	List<User> findAll();

	User findById(int id);

	User findByUserName(String email);

	boolean checkExistEmail(String email);

	boolean checkExistUsername(String username);

	boolean checkExistPhone(String phone);

	boolean verifyOldPass(String username, String email, String oldpassword);

	boolean updatePassword(String username, String newpassword);
}

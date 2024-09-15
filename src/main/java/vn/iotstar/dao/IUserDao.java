package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.User;

public interface IUserDao {

	void insert(User user);

	List<User> findAll();

	User findById(int id);

	User findByUserName(String username);

	boolean checkExistEmail(String email);

	boolean checkExistUsername(String username);

	boolean checkExistPhone(String phone);
}

package vn.iotstar.services.impl;

import vn.iotstar.dao.IUserDao;
import vn.iotstar.dao.impl.UserDaoImpl;
import vn.iotstar.models.User;
import vn.iotstar.services.IUserService;

public class UserServiceImpl implements IUserService {
	IUserDao userDao = new UserDaoImpl(); // Lấy toàn bộ hàm trong tầng Dao của user

	@Override
	public User login(String username, String password) {
		User user = this.findByUserName(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}

		return null;
	}

	@Override
	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);

	}

	@Override
	public boolean register(String username, String password, String fullname, String email, String phone) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDao.insert(new User(username, password, null, fullname, email, phone, 3, date));
		return true;

	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	@Override
	public boolean verifyOldPass(String username, String email, String oldpassword) {
		return userDao.verifyOldPass(username, email, oldpassword);
	}

	@Override
	public boolean updatePassword(String username, String newpassword) {
		return userDao.updatePassword(username, newpassword);
	}

}

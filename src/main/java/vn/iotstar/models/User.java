package vn.iotstar.models;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", passWord=" + passWord + ", images=" + images + ", roleid=" + roleid + ", phone=" + phone
				+ ", createdDate=" + createdDate + "]";
	}

	private int id;
	private String email;
	private String userName;
	private String fullName;
	private String passWord;
	private String images;
	private int roleid;
	private String phone;
	private Date createdDate;

	public User() {
		super();
	}

	public User(String email, String userName, String fullName, String passWord, String images, int roleid,
			String phone, Date createdDate) {
		super();
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.passWord = passWord;
		this.images = images;
		this.roleid = roleid;
		this.phone = phone;
		this.createdDate = createdDate;
	}

	public User(int id, String email, String userName, String fullName, String passWord, String images, int roleid,
			String phone, Date createdDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.passWord = passWord;
		this.images = images;
		this.roleid = roleid;
		this.phone = phone;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}

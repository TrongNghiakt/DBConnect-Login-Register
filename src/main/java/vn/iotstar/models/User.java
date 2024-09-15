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
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", images=" + images
				+ ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + ", roleid=" + roleid
				+ ", createdDate=" + createdDate + "]";
	}

	private int id;
	private String userName;
	private String passWord;
	private String images;
	private String fullName;
	private String email;
	private String phone;
	private int roleid;
	private Date createdDate;

	public User() {
		super();
	}

	public User(String userName, String passWord, String images, String fullName, String email, String phone,
			int roleid, Date createdDate) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.images = images;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.roleid = roleid;
		this.createdDate = createdDate;
	}

	public User(int id, String userName, String passWord, String images, String fullName, String email, String phone,
			int roleid, Date createdDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.images = images;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.roleid = roleid;
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

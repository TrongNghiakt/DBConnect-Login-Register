package vn.iotstar.models;

import java.io.Serializable;

public class CategoryModel implements Serializable {
	private int categoryid;
	private String categoryname;
	private String images;
	private int status;

	public CategoryModel() {
		super();
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + ", images=" + images
				+ ", status=" + status + "]";
	}

}

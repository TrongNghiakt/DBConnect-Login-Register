package vn.iotstar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iotstar.configs.DBConnectMySQL;
import vn.iotstar.dao.ICategoryDao;
import vn.iotstar.models.CategoryModel;

public class CategoryDaoImpl implements ICategoryDao {
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<CategoryModel> findAll() {
		String sql = "Select * from categories";
		List<CategoryModel> list = new ArrayList<>();
		try {
			conn = DBConnectMySQL.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModel category = new CategoryModel();
				category.setCategoryid(rs.getInt("categoryid"));
				category.setCategoryname(rs.getString("categoryname"));
				category.setImages(rs.getString("images"));
				category.setStatus(rs.getInt("status"));
				list.add(category);
			}
			conn.close();
			ps.close();
			rs.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategoryModel findById(int id) {
		String sql = "Select * from categories where categoryid = ?";

		try {
			conn = DBConnectMySQL.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModel category = new CategoryModel();
				category.setCategoryid(rs.getInt("categoryid"));
				category.setCategoryname(rs.getString("categoryname"));
				category.setImages(rs.getString("images"));
				category.setStatus(rs.getInt("status"));
				return category;
			}
			conn.close();
			ps.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(CategoryModel category) {
		String sql = "insert into categories(categoryname,images,status) values(?,?,?)";

		try {
			conn = DBConnectMySQL.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, category.getCategoryname());
			ps.setString(2, category.getImages());
			ps.setInt(3, category.getStatus());
			ps.executeUpdate();

			conn.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(CategoryModel category) {
		String sql = "update categories set categoryname = ?,images = ?,status=? where categoryid = ?";

		try {
			conn = DBConnectMySQL.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, category.getCategoryname());
			ps.setString(2, category.getImages());
			ps.setInt(3, category.getStatus());
			ps.setInt(4, category.getCategoryid());
			ps.executeUpdate();

			conn.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		String sql = "delete from categories where categoryid = ?";

		try {
			conn = DBConnectMySQL.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ps.executeUpdate();

			conn.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CategoryModel> findName(String keyword) {
		String sql = "Select * from categories where categoryname like ?";
		List<CategoryModel> list = new ArrayList<>();
		try {
			conn = DBConnectMySQL.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + keyword + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModel category = new CategoryModel();
				category.setCategoryid(rs.getInt("categoryid"));
				category.setCategoryname(rs.getString("categoryname"));
				category.setImages(rs.getString("images"));
				category.setStatus(rs.getInt("status"));
				list.add(category);
			}
			conn.close();
			ps.close();
			rs.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

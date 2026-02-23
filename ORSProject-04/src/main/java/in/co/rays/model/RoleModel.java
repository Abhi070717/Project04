package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.RoleBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DatabaseException;
import in.co.rays.util.JDBCDataSource;

public class RoleModel {

	public Integer nextPk() throws DatabaseException {

		Connection conn = null;
		int pk = 0;

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("select max(id) from st_role");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			throw new DatabaseException("Exception : Exception in getting Pk");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return pk + 1;
	}

	public long add(RoleBean bean) throws ApplicationException {

		Connection conn = null;
		int pk = 0;

		try {
			pk = nextPk();
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("insert into st_role values(?, ?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, pk);
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getDescription());
			pstmt.setString(4, bean.getCreatedBy());
			pstmt.setString(5, bean.getModifiedBy());
			pstmt.setTimestamp(6, bean.getCreatedDatetime());
			pstmt.setTimestamp(7, bean.getModifiedDatetime());
			int i = pstmt.executeUpdate();
			
			conn.commit();
			
			System.out.println(i + " Query OK, The rows affected (0.02 sec)" + "\n"
					+ "Records: Added successfully Duplicates: 0  Warnings: 0");

			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e1) {
				throw new ApplicationException("Exception : add rollback exception " + e1.getMessage());
			}
			throw new ApplicationException("Exception : Exception in add Role");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return pk;

	}

	public void update(RoleBean bean) throws ApplicationException {

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement(
					"update st_role set name = ?, description = ?, created_by = ?, modified_by = ?, created_datetime = ?, modified_datetime = ? where id = ?");

			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getDescription());
			pstmt.setString(3, bean.getCreatedBy());
			pstmt.setString(4, bean.getModifiedBy());
			pstmt.setTimestamp(5, bean.getCreatedDatetime());
			pstmt.setTimestamp(6, bean.getModifiedDatetime());
			pstmt.setLong(7, bean.getId());
			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println(i + " Query OK, The rows affected (0.02 sec)" + "\n"
					+ "Records: Updated successfully  Duplicates: 0  Warnings: 0");

			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();

			} catch (Exception e1) {
				throw new ApplicationException("Exception : Update rollback exception " + e1.getMessage());
			}
			throw new ApplicationException("Exception : Exception in updating Role");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

	}

	public void delete(RoleBean bean) throws ApplicationException {

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("delete from st_role where id = ?");

			pstmt.setLong(1, bean.getId());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println(i + " Query OK, The rows affected (0.02 sec)" + "\n"
					+ "Records: Deleted successfully  Duplicates: 0  Warnings: 0");

			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();

			} catch (Exception e1) {
				throw new ApplicationException("Exception : Delete rollback exception " + e1.getMessage());
			}
			throw new ApplicationException("Exception : Exception in updating Role");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}

	}

	public RoleBean findByPk(long Pk) throws ApplicationException {

		Connection conn = null;
		RoleBean bean = null;

		StringBuffer sb = new StringBuffer("select * from st_role where id = ?");

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setLong(1, Pk);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bean = new RoleBean();
				bean.setId(rs.getLong(1));
				bean.setName(rs.getString(2));
				bean.setDescription(rs.getString(3));
				bean.setCreatedBy(rs.getString(4));
				bean.setModifiedBy(rs.getString(5));
				bean.setCreatedDatetime(rs.getTimestamp(6));
				bean.setModifiedDatetime(rs.getTimestamp(7));
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			throw new ApplicationException("Exception : Exception in getting user by pk");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return bean;

	}

	public List<RoleBean> search(RoleBean bean) throws ApplicationException {

		StringBuffer sb = new StringBuffer("select * from st_role where 1=1");
		
		Connection conn = null;
		ArrayList<RoleBean> list = new ArrayList<RoleBean>();

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sb.toString());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bean = new RoleBean();
				bean.setId(rs.getLong(1));
				bean.setName(rs.getString(2));
				bean.setDescription(rs.getString(3));
				bean.setCreatedBy(rs.getString(4));
				bean.setModifiedBy(rs.getString(5));
				bean.setCreatedDatetime(rs.getTimestamp(6));
				bean.setModifiedDatetime(rs.getTimestamp(7));
				list.add(bean);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			throw new ApplicationException("Exception : Exception in search role");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return list;

	}

}

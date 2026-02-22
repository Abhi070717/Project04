
package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.CourseBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DatabaseException;
import in.co.rays.util.JDBCDataSource;

public class CourseModel {

    public Integer nextPk() throws DatabaseException {

        Connection conn = null;
        int pk = 0;

        try {
            conn = JDBCDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select max(id) from st_course");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next())
                pk = rs.getInt(1);

            rs.close();
            pstmt.close();

        } catch (Exception e) {
           
            throw new DatabaseException("Exception : Exception in getting PK");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }
        return pk + 1;
    }
 public long add(CourseBean bean) throws ApplicationException {

        Connection conn = null;
        int pk = 0;

        try {
            conn = JDBCDataSource.getConnection();
            pk = nextPk();
            conn.setAutoCommit(false);

            PreparedStatement pstmt = conn.prepareStatement(
                    "insert into st_course values(?, ?, ?, ?, ?, ?, ?, ?)");

            pstmt.setInt(1, pk);
            pstmt.setString(2, bean.getName());
            pstmt.setString(3, bean.getDuration());
            pstmt.setString(4, bean.getDescription());
            pstmt.setString(5, bean.getCreatedBy());
            pstmt.setString(6, bean.getModifiedBy());
            pstmt.setTimestamp(7, bean.getCreatedDatetime());
            pstmt.setTimestamp(8, bean.getModifiedDatetime());

            pstmt.executeUpdate();
            conn.commit();
            pstmt.close();

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
                throw new ApplicationException("Exception : add rollback exception " + ex.getMessage());
            }
            throw new ApplicationException("Exception : Exception in add Course");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }

        return pk;
    }
 
    public void update(CourseBean bean) throws ApplicationException {

        Connection conn = null;

        try {
            conn = JDBCDataSource.getConnection();
            conn.setAutoCommit(false);

            PreparedStatement pstmt = conn.prepareStatement(
                    "update st_course set name = ?, duration = ?, description = ?, created_by = ?, modified_by = ?, "
                            + "created_datetime = ?, modified_datetime = ? where id = ?");

            pstmt.setString(1, bean.getName());
            pstmt.setString(2, bean.getDuration());
            pstmt.setString(3, bean.getDescription());
            pstmt.setString(4, bean.getCreatedBy());
            pstmt.setString(5, bean.getModifiedBy());
            pstmt.setTimestamp(6, bean.getCreatedDatetime());
            pstmt.setTimestamp(7, bean.getModifiedDatetime());
            pstmt.setLong(8, bean.getId());

            pstmt.executeUpdate();
            conn.commit();
            pstmt.close();

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
                throw new ApplicationException("Exception : Delete rollback exception " + ex.getMessage());
            }
            throw new ApplicationException("Exception in updating Course");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }
    }

    public void delete(CourseBean bean) throws ApplicationException {

        Connection conn = null;

        try {
            conn = JDBCDataSource.getConnection();
            conn.setAutoCommit(false);

            PreparedStatement pstmt = conn.prepareStatement("delete from st_course where id = ?");
            pstmt.setLong(1, bean.getId());
            pstmt.executeUpdate();

            conn.commit();
            pstmt.close();

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
                throw new ApplicationException("Exception : Delete rollback exception " + ex.getMessage());
            }
            throw new ApplicationException("Exception : Exception in delete Course");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }
    }

    public CourseBean findByPk(long pk) throws ApplicationException {

        StringBuffer sql = new StringBuffer("select * from st_course where id = ?");
        CourseBean bean = null;
        Connection conn = null;

        try {
            conn = JDBCDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            pstmt.setLong(1, pk);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                bean = new CourseBean();
                bean.setId(rs.getLong(1));
                bean.setName(rs.getString(2));
                bean.setDuration(rs.getString(3));
                bean.setDescription(rs.getString(4));
                bean.setCreatedBy(rs.getString(5));
                bean.setModifiedBy(rs.getString(6));
                bean.setCreatedDatetime(rs.getTimestamp(7));
                bean.setModifiedDatetime(rs.getTimestamp(8));
            }

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            throw new ApplicationException("Exception : Exception in getting Course by pk");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }

        return bean;
    }

   

    public List<CourseBean> list() throws ApplicationException {
        return search(null);
    }

    public List<CourseBean> search(CourseBean bean)
            throws ApplicationException {

        StringBuffer sql = new StringBuffer("select * from st_course where 1=1");


        List<CourseBean> list = new ArrayList<>();
        Connection conn = null;

        try {
            conn = JDBCDataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                bean = new CourseBean();
                bean.setId(rs.getLong(1));
                bean.setName(rs.getString(2));
                bean.setDuration(rs.getString(3));
                bean.setDescription(rs.getString(4));
                bean.setCreatedBy(rs.getString(5));
                bean.setModifiedBy(rs.getString(6));
                bean.setCreatedDatetime(rs.getTimestamp(7));
                bean.setModifiedDatetime(rs.getTimestamp(8));

                list.add(bean);
            }

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            throw new ApplicationException("Exception : Exception in search Course");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }

        return list;
    }
}
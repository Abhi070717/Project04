package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.util.Date;

import in.co.rays.bean.RoleBean;
import in.co.rays.model.RoleModel;

public class TestRoleModel {
	
	public static RoleModel model = new RoleModel();

	public static void main(String[] args) throws Exception {

//		testnextPk();
//		testAdd();
//		testupdate();
		testdelete();
	}

	public static void testnextPk() throws Exception {


		model.nextPk();
		System.out.println("NextPk method  Run");

	}

	public static void testAdd() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setName("Abhishish");
		bean.setDescription("B.Tech");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("User");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);
		System.out.println("Data Stored in st_role");
	}
	
	public static void testupdate() throws Exception {
		
		RoleBean bean = new RoleBean();
		
		bean.setId(1);
		bean.setName("Abhishish Bhawsar");
		bean.setDescription("B.Tech CSE(DS)");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("User");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		model.update(bean);
		System.out.println("Data Updated in st_role");
	}
	
	public static void testdelete() throws Exception {
		
		RoleBean bean = new RoleBean();
		
		bean.setId(1);
		
		model.Delete(bean);
		System.out.println("Data Deleted in st_role");
		
	}

}
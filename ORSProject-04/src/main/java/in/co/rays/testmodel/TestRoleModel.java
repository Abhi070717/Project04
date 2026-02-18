package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.RoleBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.model.RoleModel;

public class TestRoleModel {

	public static RoleModel model = new RoleModel();

	public static void main(String[] args) throws Exception {

//		testnextPk();
//		testAdd();
//		testupdate();
//		testdelete();
//		testfindByPk();
		testsearch();
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

		model.delete(bean);
		System.out.println("Data Deleted in st_role");

	}

	public static void testfindByPk() {

		try {
			RoleBean bean = model.findByPk(1L);
			if (bean == null) {
				System.out.println("Test FindByPk Failed");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testsearch() {

		try {
			RoleBean bean = new RoleBean();
			List list = new ArrayList();
			bean.setName("Rajvansh");
			list = model.search(bean);
			if (list.size() < 0) {
				System.out.println("Test Serach fail");
			}
			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (RoleBean) it.next();

				System.out.println(bean.getId());
				System.out.println(bean.getName());
				System.out.println(bean.getDescription());
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
}
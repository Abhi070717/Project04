package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.RoleBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.model.RoleModel;
import in.co.rays.model.UserModel;

public class TestRoleModel {

	public static void main(String[] args) throws Exception {

//		testFindByPk();
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
		testSearch();
	}

	public static void testNextPk() throws Exception {

		RoleModel model = new RoleModel();
		model.nextPk();
		System.out.println("NextPk method  Run");

	}

	public static void testAdd() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setName("Student");
		bean.setDescription("B.Tech");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();

		model.add(bean);
		System.out.println("Data Stored in st_role");
	}

	public static void testUpdate() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setId(1);
		bean.setName("Student");
		bean.setDescription("B.Tech CSE(DS)");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();

		model.update(bean);
		System.out.println("Data Updated in st_role");
	}

	public static void testDelete() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setId(1);

		RoleModel model = new RoleModel();

		model.delete(bean);
		System.out.println("Data Deleted in st_role");

	}

	public static void testFindByPk() {

		RoleModel model = new RoleModel();

		try {
			RoleBean bean = model.findByPk(1L);
			
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testSearch() {

		RoleModel model = new RoleModel();

		try {
			RoleBean bean = new RoleBean();
			List list = new ArrayList();
			bean.setName("Student");
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
package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

//		testAdd();
		testUpdate();
//		testDelete();
//		testFindByPk();
//		testSearch();

	}

	public static void testAdd() throws Exception {

		UserBean bean = new UserBean();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstName("Abhishish");
		bean.setLastName("Bhawsar");
		bean.setLogin("ram@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("1999-11-19"));
		bean.setMobileNo("9876543210");
		bean.setRoleId(1);
		bean.setGender("Male");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		UserModel model = new UserModel();

		long pk = model.add(bean);

		System.out.println("User added with PK = " + pk);

	}

	public static void testUpdate() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstName("Abhishek");
		bean.setLastName("Bhawsar");
		bean.setLogin("abhi@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("1999-11-19"));
		bean.setMobileNo("9876543210");
		bean.setGender("Male");

		model.update(bean);

		System.out.println("User Updated");

	}

	public static void testDelete() throws Exception {

		UserBean bean = new UserBean();

		bean.setId(1);

		UserModel model = new UserModel();

		model.delete(bean);

		System.out.println("User Deleted");

	}

	public static void testFindByPk() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLogin());

	}

	public static void testSearch() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = new UserBean();

//		bean.setFirstName("Ram");

		List list = model.search(bean);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLogin());

		}

	}

}
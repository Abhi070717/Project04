package in.co.rays.proj4.testmodel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.model.UserModel;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

		// addTest();
		// updateTest();
		// deleteTest();
		// findByPkTest();
		// findByLoginTest();
		// authenticateTest();
		searchTest();

	}

	public static void addTest() throws Exception {

		UserBean bean = new UserBean();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstName("Ram");
		bean.setLastName("Sharma");
		bean.setLogin("ram@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2000-01-01"));
		bean.setMobileNo("9999999999");
		bean.setRoleId(2);
		bean.setGender("Male");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		UserModel model = new UserModel();

		long pk = model.add(bean);

		System.out.println("User added with PK = " + pk);

	}

	public static void updateTest() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);

		bean.setFirstName("UpdatedName");

		model.update(bean);

		System.out.println("User Updated");

	}

	public static void deleteTest() throws Exception {

		UserBean bean = new UserBean();

		bean.setId(1);

		UserModel model = new UserModel();

		model.delete(bean);

		System.out.println("User Deleted");

	}

	public static void findByPkTest() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLogin());

	}

	public static void findByLoginTest() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByLogin("ram@gmail.com");

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLogin());

	}

	public static void authenticateTest() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.authenticate("ram@gmail.com", "123");

		if (bean != null) {

			System.out.println("Login Success");
			System.out.println(bean.getFirstName());

		} else {

			System.out.println("Login Failed");

		}

	}

	public static void searchTest() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = new UserBean();

		bean.setFirstName("Ram");

		List<UserBean> list = model.search(bean);

		for (UserBean u : list) {

			System.out.println(u.getId());
			System.out.println(u.getFirstName());
			System.out.println(u.getLogin());

		}

	}

}
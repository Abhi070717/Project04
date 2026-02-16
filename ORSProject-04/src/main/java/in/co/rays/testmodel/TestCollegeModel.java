package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.util.List;

import in.co.rays.bean.CollegeBean;
import in.co.rays.model.CollegeModel;

public class TestCollegeModel {

	public static void main(String[] args) throws Exception {

//		addTest();
//		updateTest();
//		deleteTest();
//		findByPkTest();
//		findByNameTest();
//		searchTest();

	}

	// Add Test
	public static void addTest() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setName("LNCT College");
		bean.setAddress("Bhopal");
		bean.setState("MP");
		bean.setCity("Bhopal");
		bean.setPhoneNo("9999999999");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		CollegeModel model = new CollegeModel();

		long pk = model.add(bean);

		System.out.println("College added with PK = " + pk);

	}

	// Update Test
	public static void updateTest() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByPk(1);

		bean.setName("Updated College");

		model.update(bean);

		System.out.println("College Updated");

	}

	// Delete Test
	public static void deleteTest() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setId(1);

		CollegeModel model = new CollegeModel();

		model.delete(bean);

		System.out.println("College Deleted");

	}

	// Find By PK Test
	public static void findByPkTest() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByPk(1);

		System.out.println("ID : " + bean.getId());
		System.out.println("Name : " + bean.getName());
		System.out.println("City : " + bean.getCity());

	}

	// Find By Name Test
	public static void findByNameTest() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByName("LNCT College");

		System.out.println("ID : " + bean.getId());
		System.out.println("Name : " + bean.getName());
		System.out.println("City : " + bean.getCity());

	}

	// Search Test
	public static void searchTest() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = new CollegeBean();

		bean.setName("LNCT");

		List<CollegeBean> list = model.search(bean);

		for (CollegeBean c : list) {

			System.out.println("ID : " + c.getId());
			System.out.println("Name : " + c.getName());
			System.out.println("City : " + c.getCity());
			System.out.println("Phone : " + c.getPhoneNo());

		}

	}

}

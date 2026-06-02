package in.co.rays.proj4.testmodel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.StudentModel;

public class TestStudentModel {

	public static void main(String[] args) throws Exception {

//		addTest();
//		updateTest();
//		deleteTest();
//		findByPkTest();
//		findByEmailTest();
//		searchTest();

	}

	// Add Test
	public static void addTest() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		StudentBean bean = new StudentBean();

		bean.setFirstName("Amit");
		bean.setLastName("Verma");
		bean.setDob(sdf.parse("2001-01-01"));
		bean.setGender("Male");
		bean.setMobileNo("9876543210");
		bean.setEmail("amit@gmail.com");
		bean.setCollegeId(1); // Make sure college exists
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(System.currentTimeMillis()));
		bean.setModifiedDatetime(new Timestamp(System.currentTimeMillis()));

		StudentModel model = new StudentModel();

		long pk = model.add(bean);

		System.out.println("Student added with PK = " + pk);

	}

	// Update Test
	public static void updateTest() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByPk(1);

		bean.setFirstName("UpdatedName");

		model.update(bean);

		System.out.println("Student Updated");

	}

	// Delete Test
	public static void deleteTest() throws Exception {

		StudentBean bean = new StudentBean();

		bean.setId(1);

		StudentModel model = new StudentModel();

		model.delete(bean);

		System.out.println("Student Deleted");

	}

	// Find By PK Test
	public static void findByPkTest() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByPk(1);

		System.out.println("ID : " + bean.getId());
		System.out.println("Name : " + bean.getFirstName());
		System.out.println("Email : " + bean.getEmail());

	}

	// Find By Email Test
	public static void findByEmailTest() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByEmailId("amit@gmail.com");

		System.out.println("ID : " + bean.getId());
		System.out.println("Name : " + bean.getFirstName());
		System.out.println("Email : " + bean.getEmail());

	}

	// Search Test
	public static void searchTest() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = new StudentBean();

		bean.setFirstName("Amit");

		List<StudentBean> list = model.search(bean);

		for (StudentBean s : list) {

			System.out.println("ID : " + s.getId());
			System.out.println("Name : " + s.getFirstName());
			System.out.println("Email : " + s.getEmail());
			System.out.println("College : " + s.getCollegeName());

		}

	}
}

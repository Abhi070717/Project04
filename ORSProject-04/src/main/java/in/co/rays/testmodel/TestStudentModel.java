package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.StudentBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DatabaseException;
import in.co.rays.model.StudentModel;

public class TestStudentModel {

	public static void main(String[] args) throws ParseException {

//		testNextPk();
//		testAdd();
//		testUpdate();
//		testDelete();
		testFindByPk();
	}

	public static void testNextPk() {

		StudentModel model = new StudentModel();
		try {
			int i = model.nextPk();
			System.out.println("NextPk : " + i);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}

	}

	public static void testAdd() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		StudentBean bean = new StudentBean();

		bean.setFirstName("Aniket");
		bean.setLastName("Singh");
		bean.setDob(sdf.parse("2000-11-10"));
		bean.setGender("male");
		bean.setMobileNo("7946554655");
		bean.setEmail("ani@gmail.com");
		bean.setCollegeId(1);
		bean.setCollegeName("SGSITS");
		bean.setCreatedBy("root@gmail.com");
		bean.setModifiedBy("root@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		StudentModel model = new StudentModel();
		try {
			long i = model.add(bean);
			System.out.println("Data Stored in st_student: " + i);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testUpdate() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		StudentBean bean = new StudentBean();

		bean.setFirstName("Aniket");
		bean.setLastName("Singh");
		bean.setDob(sdf.parse("2000-11-10"));
		bean.setGender("male");
		bean.setMobileNo("7946554655");
		bean.setEmail("ani@gmail.com");
		bean.setCollegeId(1);
		bean.setCollegeName("SGSITS");
		bean.setCreatedBy("root@gmail.com");
		bean.setModifiedBy("root@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		StudentModel model = new StudentModel();
		try {
			model.update(bean);

			System.out.println("Data Stored in st_student");
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testDelete() {

		StudentBean bean = new StudentBean();

		bean.setId(2);

		StudentModel model = new StudentModel();
		try {
			model.delete(bean);

			System.out.println("Data Deleted in st_student");
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testFindByPk() {

		StudentModel model = new StudentModel();
		StudentBean bean = new StudentBean();

		try {

			bean = model.findByPk(1);

			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getGender());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	public static void testSearch() {


		try {
			StudentBean bean = new StudentBean();

			bean.setFirstName("Ankit");

			StudentModel model = new StudentModel();
			List list = new ArrayList();
			list = model.search(bean);

			Iterator it = list.iterator();
			while (it.hasNext()) {

			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getGender());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println("CreatedBy: " + bean.getCreatedBy());
			System.out.println("ModifiedBy: " + bean.getModifiedBy());
			System.out.println("CreatedDatetime: " + bean.getCreatedDatetime());
			System.out.println("ModifiedDatetime: " + bean.getModifiedDatetime());
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
}

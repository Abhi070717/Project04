package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.FacultyBean;
import in.co.rays.model.FacultyModel;

public class TestFacultyModel {

	public static void main(String[] args) {

//		testNextPk();
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
//		testSearch();

	}

	public static void testNextPk() {

		try {
			FacultyModel model = new FacultyModel();

			int i = model.nextPk();

			System.out.println("Next PK = " + i);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testAdd() {

		try {
			FacultyBean bean = new FacultyBean();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			bean.setFirstName("Rahul");
			bean.setLastName("Sharma");
			bean.setDob(sdf.parse("1990-05-10"));
			bean.setGender("Male");
			bean.setMobileNo("9876543210");
			bean.setEmail("rahul@gmail.com");
			bean.setCollegeId(1);
			bean.setCollegeName("LNCT");
			bean.setCourseId(1);
			bean.setCourseName("BCA");
			bean.setSubjectId(1);
			bean.setSubjectName("Java");
			bean.setCreatedBy("root@gmail.com");
			bean.setModifiedBy("root@gmail.com");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			FacultyModel model = new FacultyModel();

			long pk = model.add(bean);

			System.out.println("Faculty Added Successfully, PK = " + pk);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testUpdate() {

		try {
			FacultyBean bean = new FacultyBean();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			bean.setId(2);
			bean.setFirstName("Amit");
			bean.setLastName("Verma");
			bean.setDob(sdf.parse("1988-07-15"));
			bean.setGender("Male");
			bean.setMobileNo("0789456123");
			bean.setEmail("amit@gmail.com");
			bean.setCollegeId(1);
			bean.setCollegeName("LNCT");
			bean.setCourseId(1);
			bean.setCourseName("BCA");
			bean.setSubjectId(1);
			bean.setSubjectName("Advanced Java");
			bean.setCreatedBy("root@gmail.com");
			bean.setModifiedBy("root@gmail.com");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			FacultyModel model = new FacultyModel();

			model.update(bean);

			System.out.println("Faculty Updated Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testDelete() {

		try {
			FacultyBean bean = new FacultyBean();

			bean.setId(3);

			FacultyModel model = new FacultyModel();

			model.delete(bean);

			System.out.println("Faculty Deleted Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testFindByPk() {

		try {
			FacultyModel model = new FacultyModel();

			FacultyBean bean = model.findByPk(1);

			System.out.println("ID : " + bean.getId());
			System.out.println("Name : " + bean.getFirstName() + " " + bean.getLastName());
			System.out.println("Email : " + bean.getEmail());
			System.out.println("Mobile : " + bean.getMobileNo());
			System.out.println("College : " + bean.getCollegeName());
			System.out.println("Course : " + bean.getCourseName());
			System.out.println("Subject : " + bean.getSubjectName());
			System.out.println("CreatedBy: " + bean.getCreatedBy());
			System.out.println("ModifiedBy: " + bean.getModifiedBy());
			System.out.println("CreatedDatetime: " + bean.getCreatedDatetime());
			System.out.println("ModifiedDatetime: " + bean.getModifiedDatetime());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testSearch() {

		try {
			FacultyBean bean = new FacultyBean();
			
			FacultyModel model = new FacultyModel();

			List list = model.search(bean);

			Iterator it = list.iterator();

			while (it.hasNext()) {
				bean = (FacultyBean) it.next();
				System.out.println("ID : " + bean.getId());
				System.out.println("Name : " + bean.getFirstName() + " " + bean.getLastName());
				System.out.println("Email : " + bean.getEmail());
				System.out.println("Mobile : " + bean.getMobileNo());
				System.out.println("College : " + bean.getCollegeName());
				System.out.println("Course : " + bean.getCourseName());
				System.out.println("Subject : " + bean.getSubjectName());
				System.out.println("CreatedBy: " + bean.getCreatedBy());
				System.out.println("ModifiedBy: " + bean.getModifiedBy());
				System.out.println("CreatedDatetime: " + bean.getCreatedDatetime());
				System.out.println("ModifiedDatetime: " + bean.getModifiedDatetime());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
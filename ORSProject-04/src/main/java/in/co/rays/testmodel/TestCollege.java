package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.CollegeBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DatabaseException;
import in.co.rays.model.CollegeModel;

public class TestCollege {

	public static void main(String[] args) {

//		testNextPk();
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
		testsearch();
	}

	public static void testNextPk() {

		CollegeModel model = new CollegeModel();
		try {
			int i = model.nextPk();
			System.out.println("NextPk : " + i);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}

	}

	public static void testAdd() {

		CollegeBean bean = new CollegeBean();

		bean.setName("SGSITS");
		bean.setAddress("Regal Square");
		bean.setState("Madhya Pradesh");
		bean.setCity("Indore");
		bean.setPhoneNo("9876543210");
		bean.setCreatedBy("root@gmail.com");
		bean.setModifiedBy("root@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CollegeModel model = new CollegeModel();
		try {
			long i = model.add(bean);
			System.out.println("Data Stored in st_college: " + i);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	public static void testUpdate() {

		CollegeBean bean = new CollegeBean();

		bean.setId(1);
		bean.setName("SGSITS");
		bean.setAddress("Regal Square");
		bean.setState("Madhya Pradesh");
		bean.setCity("Indore");
		bean.setPhoneNo("0123456789");
		bean.setCreatedBy("root@gmail.com");
		bean.setModifiedBy("root@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CollegeModel model = new CollegeModel();

		try {
			model.update(bean);
			System.out.println("Data Updated in st_college");
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testDelete() {

		CollegeBean bean = new CollegeBean();

		bean.setId(1);

		CollegeModel model = new CollegeModel();

		try {
			model.delete(bean);
			System.out.println("Data Deleted in st_college");
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testFindByPk() {

		CollegeModel model = new CollegeModel();

		try {
			CollegeBean bean = model.findByPk(1);

			System.out.println("Name: " + bean.getName());
			System.out.println("Address: " + bean.getAddress());
			System.out.println("State: " + bean.getState());
			System.out.println("City: " + bean.getCity());
			System.out.println("PhoneNo: " + bean.getPhoneNo());
			System.out.println("CreatedBy: " + bean.getCreatedBy());
			System.out.println("ModifiedBy: " + bean.getModifiedBy());
			System.out.println("CreatedDatetime: " + bean.getCreatedDatetime());
			System.out.println("ModifiedDatetime: " + bean.getModifiedDatetime());
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	public static void testsearch() {
		try {
			CollegeBean bean = new CollegeBean();
			bean.setName("SGSITS");

			CollegeModel model = new CollegeModel();
			List list = new ArrayList();
			list = model.search(bean);

			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (CollegeBean) it.next();
				System.out.println("Name: " + bean.getName());
				System.out.println("Address: " + bean.getAddress());
				System.out.println("State: " + bean.getState());
				System.out.println("City: " + bean.getCity());
				System.out.println("PhoneNo: " + bean.getPhoneNo());
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

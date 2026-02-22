package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.SubjectBean;
import in.co.rays.exception.ApplicationException;
import in.co.rays.exception.DatabaseException;
import in.co.rays.model.SubjectModel;

public class TestSubjectModel {

	public static void main(String[] args) {

//		testNextPk();
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
//		testSearch();

	}

	public static void testNextPk() {

		SubjectModel model = new SubjectModel();
		try {
			int i = model.nextPk();
			System.out.println("NextPk : " + i);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}

	}

	public static void testAdd() {

		try {

			SubjectBean bean = new SubjectBean();

			bean.setName("Core Java");
			bean.setCourseId(1);
			bean.setDescription("Java Basics");
			bean.setCreatedBy("root@gmail.com");
			bean.setModifiedBy("root@gmail.com");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			SubjectModel model = new SubjectModel();

			long pk = model.add(bean);

			System.out.println("Subject Added Successfully, PK = " + pk);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void testUpdate() {

		try {

			SubjectBean bean = new SubjectBean();

			bean.setId(2);
			bean.setName("Advanced Java");
			bean.setCourseId(1);
			bean.setDescription("Advanced Topics");
			bean.setCreatedBy("root@gmail.com");
			bean.setModifiedBy("root@gmail.com");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			SubjectModel model = new SubjectModel();

			model.update(bean);

			System.out.println("Subject Updated Successfully");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void testDelete() {

		try {

			SubjectBean bean = new SubjectBean();

			bean.setId(3);

			SubjectModel model = new SubjectModel();

			model.delete(bean);

			System.out.println("Subject Deleted Successfully");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void testFindByPk() {

		try {

			SubjectModel model = new SubjectModel();

			SubjectBean bean = model.findByPk(1);

			System.out.println("ID : " + bean.getId());
			System.out.println("Name : " + bean.getName());
			System.out.println("Course ID : " + bean.getCourseId());
			System.out.println("Course Name : " + bean.getCourseName());
			System.out.println("Description : " + bean.getDescription());
			System.out.println("CreatedBy: " + bean.getCreatedBy());
			System.out.println("ModifiedBy : " + bean.getModifiedBy());
			System.out.println("CreatedDatetime : " + bean.getCreatedDatetime());
			System.out.println("ModifiedDatetime : " + bean.getModifiedDatetime());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void testSearch() {

		try {
			SubjectBean bean = new SubjectBean();

			SubjectModel model = new SubjectModel();

			List list = new ArrayList();

			list = model.search(bean);

			Iterator it = list.iterator();

			while (it.hasNext()) {
				bean = (SubjectBean) it.next();
				System.out.println("ID : " + bean.getId());
				System.out.println("Name : " + bean.getName());
				System.out.println("Course ID : " + bean.getCourseId());
				System.out.println("Course Name : " + bean.getCourseName());
				System.out.println("Description : " + bean.getDescription());
				System.out.println("CreatedBy : " + bean.getCreatedBy());
				System.out.println("ModifiedBy : " + bean.getModifiedBy());
				System.out.println("CreatedDatetime : " + bean.getCreatedDatetime());
				System.out.println("ModifiedDatetime : " + bean.getModifiedDatetime());
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

}

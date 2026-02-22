package in.co.rays.testmodel;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.TimetableBean;
import in.co.rays.exception.DatabaseException;
import in.co.rays.model.SubjectModel;
import in.co.rays.model.TimetableModel;

public class TestTimetableModel {

	public static void main(String[] args) {

//		testNextPk();
//		testAdd();
//		testUpdate();
//		testDelete();
//		testFindByPk();
//		testSearch();

	}

	public static void testNextPk() {

		TimetableModel model = new TimetableModel();
		try {
			int i = model.nextPk();
			System.out.println("NextPk : " + i);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}
	}

	public static void testAdd() {

		try {
			TimetableBean bean = new TimetableBean();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			bean.setSemester("3rd");
			bean.setDescription("Mid Exam");
			bean.setExamDate(sdf.parse("2026-03-15"));
			bean.setExamTime("10:00 AM");
			bean.setCourseId(1);
			bean.setCourseName("B.Tech");
			bean.setSubjectId(1);
			bean.setSubjectName("Java");
			bean.setCreatedBy("root@gmail.com");
			bean.setModifiedBy("root@gmail.com");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			TimetableModel model = new TimetableModel();

			long pk = model.add(bean);

			System.out.println("Timetable Added Successfully, PK = " + pk);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testUpdate() {

		try {
			TimetableBean bean = new TimetableBean();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			bean.setId(2);
			bean.setSemester("4th");
			bean.setDescription("Final Exam");
			bean.setExamDate(sdf.parse("2026-04-20"));
			bean.setExamTime("2:00 PM");
			bean.setCourseId(1);
			bean.setCourseName("BCA");
			bean.setSubjectId(1);
			bean.setSubjectName("Advanced Java");
			bean.setCreatedBy("root@gmail.com");
			bean.setModifiedBy("root@gmail.com");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			TimetableModel model = new TimetableModel();

			model.update(bean);

			System.out.println("Timetable Updated Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testDelete() {

		try {

			TimetableBean bean = new TimetableBean();

			bean.setId(3);

			TimetableModel model = new TimetableModel();

			model.delete(bean);

			System.out.println("Timetable Deleted Successfully");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void testFindByPk() {

		try {

			TimetableModel model = new TimetableModel();

			TimetableBean bean = model.findByPk(2);

			System.out.println("ID : " + bean.getId());
			System.out.println("Semester : " + bean.getSemester());
			System.out.println("Course : " + bean.getCourseName());
			System.out.println("Subject : " + bean.getSubjectName());
			System.out.println("Exam Date : " + bean.getExamDate());
			System.out.println("Exam Time : " + bean.getExamTime());
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
			TimetableModel model = new TimetableModel();

			TimetableBean bean = new TimetableBean();

			List list = model.search(bean);

			Iterator it = list.iterator();

			while (it.hasNext()) {

				bean = (TimetableBean) it.next();

				System.out.println("ID : " + bean.getId());
				System.out.println("Semester : " + bean.getSemester());
				System.out.println("Course : " + bean.getCourseName());
				System.out.println("Subject : " + bean.getSubjectName());
				System.out.println("Exam Date : " + bean.getExamDate());
				System.out.println("Exam Time : " + bean.getExamTime());
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
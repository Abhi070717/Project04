package in.co.rays.testmodel;

import in.co.rays.exception.DatabaseException;
import in.co.rays.model.MarksheetModel;

public class TestMarksheet {

	public static void main(String[] args) {

		testNextPk();
	}

	public static void testNextPk() {

		MarksheetModel model = new MarksheetModel();
		try {
			int i = model.nextPk();
			System.out.println("NextPk : " + i);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}

	}

	public static void testAdd() {
	}

}

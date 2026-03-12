package in.co.rays.proj4.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import in.co.rays.proj4.bean.RecipeBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.model.RecipeModel;
import in.co.rays.proj4.util.DataValidator;
import in.co.rays.proj4.util.PropertyReader;
import in.co.rays.proj4.util.ServletUtility;

@WebServlet("/RecipeCtl")
public class RecipeCtl extends BaseCtl {

	@Override
	protected void preload(HttpServletRequest request) {
		RecipeModel Model = new RecipeModel();
		try {
			List<RecipeBean> list = Model.list();
			request.setAttribute("ingredientsList", list);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected boolean validate(HttpServletRequest request) {

		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("name"))) {
			request.setAttribute("name", PropertyReader.getValue("error.require", "Name"));
			pass = false;
		} else if (!DataValidator.isName(request.getParameter("name"))) {
			request.setAttribute("name", "Invalid Name");
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("ingredient"))) {
			request.setAttribute("ingredient", PropertyReader.getValue("error.require", "Ingredient"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("level"))) {
			request.setAttribute("level", PropertyReader.getValue("error.require", "Difficutly Level"));
			pass = false;
		}
		return pass;
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletUtility.forward(getView(), request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletUtility.forward(getView(), request, response);

	}

	@Override
	protected String getView() {
		return ORSView.RECIPE_VIEW;
	}

}

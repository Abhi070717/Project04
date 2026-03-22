package in.co.rays.proj4.controller;

public interface ORSView {

	public String APP_CONTEXT = "/ORSProject-04";

	public String PAGE_FOLDER = "/jsp";
	
	public String WELCOME_VIEW = PAGE_FOLDER + "/Welcome.jsp";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";

	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_CTL = APP_CONTEXT + "/RoleCtl";

	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	public String USER_CTL = APP_CONTEXT + "/UserCtl";

	public String ERROR_VIEW = PAGE_FOLDER + "/ErrorView.jsp";
	public String ERROR_CTL = APP_CONTEXT + "/ErrorCtl";

}
package in.co.rays.proj4.controller;

/**
 * ORSView defines application-wide constants for JSP view paths and their
 * corresponding controller URL mappings. These constants are used throughout
 * the project to avoid hard-coded strings in controllers and JSPs.
 *
 * <p>
 * - {@code APP_CONTEXT} is the application context root. <br>
 * - {@code PAGE_FOLDER} is the base folder where JSP pages are located. <br>
 * - Other constants map logical view names (JSP paths) and controller URL
 * patterns used by servlets.
 * </p>
 *
 * @author Abhishish Bhawsar
 * 
 * @version 1.0
 *
 */
public interface ORSView {

	/** Application context root. */
	public String APP_CONTEXT = "/ORSProject-04";

	/** Base JSP folder. */
	public String PAGE_FOLDER = "/jsp";

	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String JAVA_DOC = APP_CONTEXT + "/doc/index.html";

	public String WELCOME_VIEW = PAGE_FOLDER + "/WelcomeView.jsp";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";

	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";

	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";

	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";

	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";

	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";

	public String GET_MARKSHEET_VIEW = PAGE_FOLDER + "/GetMarksheetView.jsp";
	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";

	public String MARKSHEET_MERIT_LIST_VIEW = PAGE_FOLDER + "/MarksheetMeritListView.jsp";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";

	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_CTL = APP_CONTEXT + "/ctl/RoleCtl";

	public String ROLE_LIST_VIEW = PAGE_FOLDER + "/RoleListView.jsp";
	public String ROLE_LIST_CTL = APP_CONTEXT + "/ctl/RoleListCtl";

	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	public String USER_CTL = APP_CONTEXT + "/ctl/UserCtl";

	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	public String USER_LIST_CTL = APP_CONTEXT + "/ctl/UserListCtl";

	public String COLLEGE_VIEW = PAGE_FOLDER + "/CollegeView.jsp";
	public String COLLEGE_CTL = APP_CONTEXT + "/ctl/CollegeCtl";

	public String COLLEGE_LIST_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
	public String COLLEGE_LIST_CTL = APP_CONTEXT + "/ctl/CollegeListCtl";

	public String STUDENT_VIEW = PAGE_FOLDER + "/StudentView.jsp";
	public String STUDENT_CTL = APP_CONTEXT + "/ctl/StudentCtl";

	public String STUDENT_LIST_VIEW = PAGE_FOLDER + "/StudentListView.jsp";
	public String STUDENT_LIST_CTL = APP_CONTEXT + "/ctl/StudentListCtl";

	public String MARKSHEET_VIEW = PAGE_FOLDER + "/MarksheetView.jsp";
	public String MARKSHEET_CTL = APP_CONTEXT + "/ctl/MarksheetCtl";

	public String MARKSHEET_LIST_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
	public String MARKSHEET_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetListCtl";

	public String COURSE_VIEW = PAGE_FOLDER + "/CourseView.jsp";
	public String COURSE_CTL = APP_CONTEXT + "/ctl/CourseCtl";

	public String COURSE_LIST_VIEW = PAGE_FOLDER + "/CourseListView.jsp";
	public String COURSE_LIST_CTL = APP_CONTEXT + "/ctl/CourseListCtl";

	public String SUBJECT_VIEW = PAGE_FOLDER + "/SubjectView.jsp";
	public String SUBJECT_CTL = APP_CONTEXT + "/ctl/SubjectCtl";

	public String SUBJECT_LIST_VIEW = PAGE_FOLDER + "/SubjectListView.jsp";
	public String SUBJECT_LIST_CTL = APP_CONTEXT + "/ctl/SubjectListCtl";

	/** Timetable View JSP */
	public String TIMETABLE_VIEW = PAGE_FOLDER + "/TimeTableView.jsp";
	/** Timetable Controller URL */
	public String TIMETABLE_CTL = APP_CONTEXT + "/ctl/TimeTableCtl";

	/** TimeTable List JSP */
	public String TIMETABLE_LIST_VIEW = PAGE_FOLDER + "/TimeTableListView.jsp";
	/** TimeTable List Controller URL */
	public String TIMETABLE_LIST_CTL = APP_CONTEXT + "/ctl/TimeTableListCtl";

	/** Faculty View JSP */
	public String FACULTY_VIEW = PAGE_FOLDER + "/FacultyView.jsp";
	/** Faculty Controller URL */
	public String FACULTY_CTL = APP_CONTEXT + "/ctl/FacultyCtl";

	/** Faculty List JSP */
	public String FACULTY_LIST_VIEW = PAGE_FOLDER + "/FacultyListView.jsp";
	/** Faculty List Controller URL */
	public String FACULTY_LIST_CTL = APP_CONTEXT + "/ctl/FacultyListCtl";

	/** ================= Error Page ================= */

	/** Error JSP */
	public String ERROR_VIEW = PAGE_FOLDER + "/ErrorView.jsp";

	/** Error Controller URL */
	public String ERROR_CTL = APP_CONTEXT + "/ctl/ErrorCtl";

	/** ================= Daily Models ================= */

	/** Health View JSP */
	public String HEALTH_VIEW = PAGE_FOLDER + "/HealthView.jsp";
	/** Health Controller URL */
	public String HEALTH_CTL = APP_CONTEXT + "/ctl/HealthCtl";

	/** Health List JSP */
	public String HEALTH_LIST_VIEW = PAGE_FOLDER + "/HealthListView.jsp";
	/** Health List Controller URL */
	public String HEALTH_LIST_CTL = APP_CONTEXT + "/ctl/HealthListCtl";

	/** Purge View JSP */
	public String PURGE_VIEW = PAGE_FOLDER + "/PurgeView.jsp";
	/** Purge Controller URL */
	public String PURGE_CTL = APP_CONTEXT + "/ctl/PurgeCtl";

	/** Purge List JSP */
	public String PURGE_LIST_VIEW = PAGE_FOLDER + "/PurgeListView.jsp";
	/** Purge List Controller URL */
	public String PURGE_LIST_CTL = APP_CONTEXT + "/ctl/PurgeListCtl";

	/** System View JSP */
	public String SYSTEM_VIEW = PAGE_FOLDER + "/SystemView.jsp";
	/** System Controller URL */
	public String SYSTEM_CTL = APP_CONTEXT + "/ctl/SystemCtl";

	/** System List JSP */
	public String SYSTEM_LIST_VIEW = PAGE_FOLDER + "/SystemListView.jsp";
	/** System List Controller URL */
	public String SYSTEM_LIST_CTL = APP_CONTEXT + "/ctl/SystemListCtl";

	/** Subscription View JSP */
	public String SUBSCRIPTION_VIEW = PAGE_FOLDER + "/SubscriptionView.jsp";
	/** Subscription Controller URL */
	public String SUBSCRIPTION_CTL = APP_CONTEXT + "/ctl/SubscriptionCtl";

	/** Subscription List JSP */
	public String SUBSCRIPTION_LIST_VIEW = PAGE_FOLDER + "/SubscriptionListView.jsp";
	/** Subscription List Controller URL */
	public String SUBSCRIPTION_LIST_CTL = APP_CONTEXT + "/ctl/SubscriptionListCtl";

	/** Feature View JSP */
	public String FEATURE_VIEW = PAGE_FOLDER + "/FeatureView.jsp";
	/** Feature Controller URL */
	public String FEATURE_CTL = APP_CONTEXT + "/ctl/FeatureCtl";

	/** Feature List JSP */
	public String FEATURE_LIST_VIEW = PAGE_FOLDER + "/FeatureListView.jsp";
	/** Feature List Controller URL */
	public String FEATURE_LIST_CTL = APP_CONTEXT + "/ctl/FeatureListCtl";

	/** Audit View JSP */
	public String AUDIT_VIEW = PAGE_FOLDER + "/AuditView.jsp";
	/** Audit Controller URL */
	public String AUDIT_CTL = APP_CONTEXT + "/ctl/AuditCtl";
	
	/** Audit List JSP */
	public String AUDIT_LIST_VIEW = PAGE_FOLDER + "/AuditListView.jsp";
	/** Audit List Controller URL */
	public String AUDIT_LIST_CTL = APP_CONTEXT + "/ctl/AuditListCtl";

	/** Allow View JSP */
	public String ALLOW_VIEW = PAGE_FOLDER + "/AllowView.jsp";
	/** Allow Controller URL */
	public String ALLOW_CTL = APP_CONTEXT + "/ctl/AllowCtl";
	
	/** Allow List JSP */
	public String ALLOW_LIST_VIEW = PAGE_FOLDER + "/AllowListView.jsp";
	/** Allow List Controller URL */
	public String ALLOW_LIST_CTL = APP_CONTEXT + "/ctl/AllowListCtl";

	/** Block View JSP */
	public String BLOCK_VIEW = PAGE_FOLDER + "/BlockView.jsp";
	/** Block Controller URL */
	public String BLOCK_CTL = APP_CONTEXT + "/ctl/BlockCtl";
	
	/** Block List JSP */
	public String BLOCK_LIST_VIEW = PAGE_FOLDER + "/BlockListView.jsp";
	/** Block List Controller URL */
	public String BLOCK_LIST_CTL = APP_CONTEXT + "/ctl/BlockListCtl";

	/** Rule View JSP */
	public String RULE_VIEW = PAGE_FOLDER + "/RuleView.jsp";
	/** Rule Controller URL */
	public String RULE_CTL = APP_CONTEXT + "/ctl/RuleCtl";
	
	/** Rule List JSP */
	public String RULE_LIST_VIEW = PAGE_FOLDER + "/RuleListView.jsp";
	/** Rule List Controller URL */
	public String RULE_LIST_CTL = APP_CONTEXT + "/ctl/RuleListCtl";
}

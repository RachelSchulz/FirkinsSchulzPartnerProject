package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Department;

/**
 * Servlet implementation class EditDepartmentServlet
 */
@WebServlet("/editDepartmentServlet")
public class EditDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepartmentHelper helper = new DepartmentHelper();
		
		String oldName = request.getParameter("oldName");
		String name = request.getParameter("newName");
		String mgrName = request.getParameter("managerName");
		
		Department toUpdate = helper.searchDepartmentByName(oldName);
		toUpdate.setDepartmentName(name);
		toUpdate.setDptManagerName(mgrName);
	}

}

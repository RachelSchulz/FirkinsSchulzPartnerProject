package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListEmployee;


/**
 * Servlet implementation class EditItemServlet
 */
@WebServlet("/editEmployeeServlet")
public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeServlet() {
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
		ListEmployeeHelper dao = new ListEmployeeHelper();
			String name = request.getParameter("name");
			String department= request.getParameter("department");
			String hours = request.getParameter("hours");
			String payperhour = request.getParameter("payperhour");
			int hours2 = Integer.parseInt(hours);
			double payperhour2 = Double.parseDouble(payperhour); 
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				ListEmployee itemToUpdate = dao.searchForItemById(tempId);
				itemToUpdate.setName(name);
				itemToUpdate.setDepartment(department);
				itemToUpdate.setHours2(hours2);
				itemToUpdate.setPayperhour2(payperhour2);
				dao.updateEmployee(itemToUpdate);
				getServletContext().getRequestDispatcher("/viewAllAnimalsServlet").forward(request, response);
				doGet(request, response);
	}

}

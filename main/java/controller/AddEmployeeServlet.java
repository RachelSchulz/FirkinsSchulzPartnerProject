package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListEmployee;



@WebServlet("/addEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String department= request.getParameter("department");
		String hours = request.getParameter("hours");
		String payperhour = request.getParameter("payperhour");
		int hours2 = Integer.parseInt(hours);
		double payperhour2 = Double.parseDouble(payperhour); 
		
		ListEmployee li =new ListEmployee(name, department, hours2, payperhour2);
		ListEmployeeHelper dao = new ListEmployeeHelper();
		dao.insertItem(li);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

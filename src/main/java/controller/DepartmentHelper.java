/**
* Rachel Schulz - rsgoodrich
* CIS175 - Fall 2023
* Oct 9, 2023
*/
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Department;

/**
 * @author Rachel Schulz - rsgoodrich
 * CIS175 - Fall 2023
 * Oct 9, 2023
 */
public class DepartmentHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EmployeeJPA");
	
	public void insertDepartment(Department d) {
		EntityManager manager = emfactory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(d);
		manager.getTransaction().commit();
		manager.close();	
	}
	
	@SuppressWarnings("unchecked")
	public List<Department> showAllDepartments() {
		EntityManager manager = emfactory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM department i");
		List<Department> allItems = q.getResultList();
		manager.close();
		return allItems;
	}
	
	public Department searchDepartmentByName(String departmentName) {
		EntityManager manager = emfactory.createEntityManager();
		TypedQuery<Department> query = manager.createQuery("SELECT i FROM department AS i WHERE i.departmentName = :departmentName", Department.class);
		query.setParameter("departmentName", departmentName);
		Department dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
	
	public void delete(Department toDelete) {
		EntityManager manager = emfactory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Department.class, toDelete.getDepartmentName()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(Department d) {
		EntityManager manager = emfactory.createEntityManager();
		Department dbEntity = manager.find(Department.class, d.getDepartmentId());
		manager.getTransaction().begin();
		dbEntity.setDepartmentName(d.getDepartmentName());
		dbEntity.setDptManagerName(d.getDptManagerName());
		manager.getTransaction().commit();
		manager.close();
	}
}

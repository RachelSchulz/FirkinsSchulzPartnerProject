package controller;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListEmployee;

public class ListEmployeeHelper {
static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EmployeeJPA");

public void insertItem(ListEmployee li) {
	EntityManager em = emfactory.createEntityManager();
	DepartmentHelper helper = new DepartmentHelper();
	li.setDepartment(helper.searchDepartmentByName(li.getDepartment().getDepartmentName()));
	em.getTransaction().begin();
	em.persist(li);	
	em.getTransaction().commit();
	em.close();
	
}
	public List<ListEmployee> showAllEmployees(){
		EntityManager em = emfactory.createEntityManager();
		List<ListEmployee> allEmployees= em.createQuery("SELECT i FROM ListEmployee i").getResultList();
		return allEmployees;
		}
	public void deleteItem(ListEmployee toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(ListEmployee.class, toDelete.getId()));
		em.getTransaction().commit();
		em.close();
		}
	public List<ListEmployee> searchForNameByName(String nameName) {
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListEmployee> typedQuery = em.createQuery("select li from ListEmployee li where li.name = :selectedName", ListEmployee.class);
		typedQuery.setParameter("selectedName",nameName);
		List<ListEmployee> foundNames = typedQuery.getResultList();
		em.close();
		return foundNames;
		}
	public ListEmployee
		searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListEmployee found = em.find(ListEmployee.class, idToEdit);
		em.close();
		return found;
		}
	public void updateEmployee(ListEmployee toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		


	}
	public void cleanUp(){
		emfactory.close();
		}
	
}


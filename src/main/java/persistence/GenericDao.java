package persistence;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDao<Classe, Classe2> {
	Session session;
	Transaction transaction;
	Criteria criteria;
	Query query;
	Classe classe;
	Classe2 classe2;
	
	public GenericDao(Classe c) {
		this.classe = c;
	}
	
	public GenericDao(Classe c, Classe2 c2) {
		this.classe = c;
		this.classe2 = c2;
	}

	

	public void create(Classe c) throws Exception {
	session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(c);
		transaction.commit();
		session.close();
	}
						
	public void create(Classe c, Classe2 c2) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(c);  
		session.save(c2); 
		transaction.commit();
		session.close();
	}
	
	public void update(Classe c) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(c);
		transaction.commit();
		session.close();
	}
	
	public void update(Classe c, Classe2 c2) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(c);
		session.update(c2);
		transaction.commit();
		session.close();
	}

	public void delete(Classe c) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.delete(c);
		transaction.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Classe> findAll() {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Classe> lista = session.createCriteria(classe.getClass()).list();
		session.close();
		return lista;
	}

	public Classe findByCode(Integer code) {
		session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		Classe c = (Classe) session.get(classe.getClass(), code);
		session.close();
		return c;
	}
	
	public Classe findByNome(String nome) {
		session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		Classe c = (Classe) session.get(classe.getClass(), nome);
		session.close();
		return c;
	}
	
	public Long count(){  
		 session = HibernateUtil.getSessionFactory().openSession();
	        Query q = session.createQuery("SELECT COUNT(*) AS total FROM " + classe.getClass().getName());  
	        return (Long) q.uniqueResult();
	}

//	public GenericDao<Departamento, Funcionario> findByCode(Departamento departamento) {
//		session = HibernateUtil.getSessionFactory().openSession();
//		@SuppressWarnings("unchecked")
//		Classe c = (Classe) session.get(classe.getClass(), departamento);
//		session.close();
//		return (GenericDao<Departamento, Funcionario>) c;
//	}
//	
	
}	
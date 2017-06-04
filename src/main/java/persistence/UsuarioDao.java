package persistence;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import entity.Usuario;

public class UsuarioDao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	Session session;
	Transaction transaction;
	Query query;
	Criteria criteria;
	
	HibernateTemplate hibernate;
	 
	 public void setSessionFactory(SessionFactory sessionFactory)
	 throws Exception{
		 hibernate = new HibernateTemplate(sessionFactory);
	 }
	 
	 public void create(Usuario u){
		 session = HibernateUtil.getSessionFactory().openSession();
		  transaction= session.beginTransaction(); 
		   session.save(u);//gravo o cliente
		  transaction.commit(); // EXECUTA A GRAVAÇÃO
		  session.close();   //FECHA A SESSÃO
	 }
	
	 public void delete(Usuario u){
		 session = HibernateUtil.getSessionFactory().openSession();
		 	transaction = session.beginTransaction();
		 		session.delete(u);
		 	transaction.commit();
		 session.close();
	 }
	  
	  public void update(Usuario u) throws Exception{
	  session = HibernateUtil.getSessionFactory().openSession();
	  transaction= session.beginTransaction(); 
	  session.update(u); 
	  transaction.commit();
	  session.close();
	  }
	  
	 public List<Usuario> findAll(){
		 return hibernate.loadAll(Usuario.class);
	 }
	 
	 public Usuario findByCode(Integer cod){
		 return (Usuario) hibernate.get(Usuario.class, cod);
	 }

	 public List<Usuario> findAllUsers(){
		 session = HibernateUtil.getSessionFactory().openSession();
		 	List<Usuario> lista = session.createQuery("from Usuario").list();
		session.close();
		return lista;
	 }
	 
	 
	 
}
package persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import entity.Endereco;
import entity.Notify;

public class NotifyDao extends GenericDao<Notify, Endereco>{
	
	public NotifyDao(Notify c) {
		super(c);
	}
	 public Long count(){  
		 session = HibernateUtil.getSessionFactory().openSession();
	        Query q = session.createQuery("SELECT COUNT(*) AS total FROM Notify");  
	        return (Long) q.uniqueResult();
	   }
	 
	 public List<Notify> filtroPorNome(String nome) throws Exception {			
			session = HibernateUtil.getSessionFactory().openSession();
			criteria = session.createCriteria(Notify.class);
			criteria.add(Restrictions.like("nomeNotify", "%"+nome+"%"));
			List<Notify> lista = criteria.list();
			session.close();
			return lista;
	 }
	 
	 public List<Notify> filtroPorCodigo(Integer id) throws Exception {			
			session = HibernateUtil.getSessionFactory().openSession();
			criteria = session.createCriteria(Notify.class);
			criteria.add(Restrictions.eq("id", id));
			List<Notify> lista = criteria.list();
			session.close();
			return lista;
	 }
 

	 
}
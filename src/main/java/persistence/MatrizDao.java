package persistence;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import entity.Endereco;
import entity.Matriz;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JRField;

public class MatrizDao extends GenericDao<Matriz, Endereco>{
		
	public MatrizDao(Matriz c) {
	super(c);
}

		public List<Matriz> relatorioPorContrato(Matriz m) throws Exception {			
			session = HibernateUtil.getSessionFactory().openSession();
			query = session.createQuery("select m from Matriz m where m.contratoVenda =:contrato");
			query.setString("contrato", m.getContratoVenda());
			return query.list();
		}

		public List<Matriz> findByClienteContratoeData(String contrato, Date data1,Date data2, String cliente){
			  session = HibernateUtil.getSessionFactory().openSession();
			  criteria = session.createCriteria(Matriz.class);
			  criteria.add(Restrictions.like("contratoVenda", "%"+contrato+"%"));
			  if (data1 != null) {
				  criteria.add(Restrictions.ge("dataDeCadastro", data1));
			  }
			  if (data2!=null) {
				  criteria.add(Restrictions.le("dataDeCadastro",  data2));  
			  }
			  criteria.add(Restrictions.like("cliente", "%"+cliente+"%"));
			  criteria.addOrder(Order.desc("dataDeCadastro"));
			  criteria.setMaxResults(100);
			  List<Matriz> lista = criteria.list();
			   session.close();
			 return lista;
	  }
		
		public List<Matriz> findByAcompanhamentoEmbarque(String cliente, String navio, Date dataBL1, Date dataBL2, Date dataEstufe1, Date dataEstufe2){
			  session = HibernateUtil.getSessionFactory().openSession();
			  criteria = session.createCriteria(Matriz.class);
			  criteria.add(Restrictions.like("cliente", "%"+cliente+"%"));
			  
			  if (navio.length() == 3 ) {
				  criteria.add(Restrictions.between("navio", "a", "z"));
			  }else if (navio.length() == 4 ) {
				  criteria.add(Restrictions.like("navio", ""));
			  }
			  
			  if (dataBL1 != null) {
				  criteria.add(Restrictions.ge("dataBL", dataBL1));
			  }
			  if (dataBL2!=null) {
				  criteria.add(Restrictions.le("dataBL",  dataBL2));  
		  }
			  
			  if (dataEstufe1 != null) {
				  criteria.add(Restrictions.ge("dataEstufe", dataEstufe1));
			  }
			  if (dataEstufe2!=null) {
				  criteria.add(Restrictions.le("dataEstufe",  dataEstufe2));  
			  }
			  criteria.addOrder(Order.desc("dataEstufe"));
			  criteria.setMaxResults(100);
			  List<Matriz> lista = criteria.list();
			  session.close();
			  return lista;
	  }

		
		public Long count(){  
			 session = HibernateUtil.getSessionFactory().openSession();
		        Query q = session.createQuery("SELECT COUNT(*) AS total FROM Matriz");  
		        return (Long) q.uniqueResult();
		}
}
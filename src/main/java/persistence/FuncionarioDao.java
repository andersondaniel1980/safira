package persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Funcionario;
import entity.Departamento;

public class FuncionarioDao {

	
	Session session;
	Transaction transaction;
	Query query;
	Criteria criteria;
	
	
//	public void create(Aluno a, List<Disciplina> disciplinas) throws Exception{
//		session = HibernateUtil.getSessionFactory().openSession();
//		transaction = session.beginTransaction();
//		session.save(a);
//		for(Disciplina d : disciplinas){
//			d.setAluno(a);
//			session.save(d);
//		}
//		transaction.commit();
//		session.close();
//	}
	
	public void create(Funcionario f) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
//		Departamento d = new Departamento();
//		session.save(d);   // org.hibernate.TransientObjectException: object references an unsaved transient instance 	
//		f.setDepartamento(d); //Não muda nada em tirar
		session.save(f);
		transaction.commit();
		session.close();
	}
	public Departamento findByCode(Departamento departamento) {
		session = HibernateUtil.getSessionFactory().openSession();
		Departamento c = (Departamento) session.get(Departamento.class, departamento);
		session.close();
		return c;
	}
	
	
	
//	@SuppressWarnings("unchecked")
//	public List<Aluno> findAll(){
//		session = HibernateUtil.getSessionFactory().openSession();
//		List<Aluno> lista = session.createCriteria("from Aluno").list();
//		session.close();
//		return lista;
//	}
	
	
	
	
	
	
	
}

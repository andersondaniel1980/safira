package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Cliente;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Cliente, Long>{

	
}

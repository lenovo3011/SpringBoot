package StudentAppWithDB.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import StudentAppWithDB.entity.Student;

public interface DAO extends JpaRepository<Student, String> {
	
	

}

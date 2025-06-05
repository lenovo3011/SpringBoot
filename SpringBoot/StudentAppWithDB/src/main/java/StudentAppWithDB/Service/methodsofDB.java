package StudentAppWithDB.Service;
import java.util.List;
import StudentAppWithDB.DAO.*;


import org.springframework.stereotype.Service;

import StudentAppWithDB.entity.Student;
@Service
public interface methodsofDB {
		public List<Student> getAllStudent ()  ;
		public Student getOneStudent(String rollno) ;
		public Student addStudent (Student student) ;
		public Student updateStudent (Student student) ;
		public boolean deleteStudent(String rollno) ;
		}




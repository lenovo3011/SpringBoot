package StudentAppWithDB.Service;
import java.util.List;


import StudentAppWithDB.DAO.DAO;
import StudentAppWithDB.entity.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class actualDB implements methodsofDB {
	@Autowired
	private DAO studentDao ;
	//List <Student> list ;
	public actualDB () {
//		list = new ArrayList <> () ;
//		list.add(new Student ("1002", "Rutvi Raj Parsharam" , "8208180805", "Female" , "MH") ) ;
//		list.add(new Student ("0408", "Raj Shantaram Parsharam" , "7030602280", "Male" , "MH") ) ;
//		
	}	
	@Override
	public List<Student> getAllStudent() {
	return studentDao.findAll() ;
		
	}
	@Override
	public Student getOneStudent(String rollno) {
	  return  studentDao.findById(rollno).orElseThrow(() -> new RuntimeException("Student not found with rollno: " + rollno));
	 }

	//@Override
//	public Optional<Student> getOneStudent(String rollno) {
////		
////		Student s1 = null ;
////		for (Student s2 : list) {
////			if (s2.getRollno().equals(rollno) ) {
////				s1=s2 ;
////				break ;
////				
////			}
////		}
//		Optional <Student> student  = studentDao.findById(rollno) ;
//	return student ;
//	}
	@Override
	public Student addStudent(Student student) {
//		//list.add(new Student (student.getRollno() , student.getName() , student.getPhone() , student.getSex(), student.getState())) ;
//		list.add(student);
		
		studentDao.save(student) ;
		return student;
	}
	@Override
	public Student updateStudent(Student student) {
//		for (Student s : list) {
//			if (s.getRollno().equals(student.getRollno())) {
//				s.setName(student.getName());
//				s.setPhone(student.getPhone());
//				s.setRollno(student.getRollno());
//				s.setSex(student.getSex());
//				s.setState(student.getState());
//			}
//		}
		studentDao.save(student) ;
	return student;
	}
	@Override
	public boolean deleteStudent(String rollno) {
		boolean flag = false ;
		studentDao.delete(studentDao.getOne(rollno) );
//		for (Student s : list ) {
//			if (s.getRollno().equals(rollno)) {
//				list.remove(s) ;
				flag = true ;
//				break ;
//			}
//		}
	return flag;
	}
	
	

}

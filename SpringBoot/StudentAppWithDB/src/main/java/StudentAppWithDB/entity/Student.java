package StudentAppWithDB.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "Student")
public class Student {
	@Id
	@PrimaryKeyJoinColumn
	@Column (name = "RollNo" , columnDefinition = "varchar(10)", nullable = false, unique = true )
	private String rollno ;
	@Column (name = "Name"  , columnDefinition = "varchar(25)" , nullable = false )
	private String name;
	@Column (name = "Phone" , columnDefinition = "number(10)", nullable = false) 
	private String phone ;
	@Column (name = "Sex" , columnDefinition = "varchar(5)" , nullable = false )
	private String sex ;
	@Column (name = "State", columnDefinition = "varchar(11)" , nullable = true)
	private String state ;
	public Student(String rollno, String name, String phone, String sex, String state) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.state = state;
	}
	public Student() {
		super();
		
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", phone=" + phone + ", sex=" + sex + ", state=" + state
				+ "]";
	}
	
	
}

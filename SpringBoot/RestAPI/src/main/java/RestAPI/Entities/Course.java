package RestAPI.Entities;
public class Course {
	private long id ;
	private String cName ;
	private String desc ;
	private int fee ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getDesc() {
		return desc;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cName=" + cName + ", desc=" + desc + ", fee=" + fee + "]";
	}
	public Course(long id, String cName, String desc, int fee) {
		super();
		this.id = id;
		this.cName = cName;
		this.desc = desc;
		this.fee = fee;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
}
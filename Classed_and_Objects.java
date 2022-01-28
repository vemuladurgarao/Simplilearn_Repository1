package assistedProjects;

public class Classed_and_Objects {

	
	private int age;
	private String city;
	private String job;
	public Classed_and_Objects(int age, String city, String job) {
		super();
		this.age = age;
		this.city = city;
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public String toString()
	{
		return ("his age is "+this.getAge()+"and he is from"+this.getCity()+"and he was doing"+this.getJob());
	}
	

	public static void main(String[] args) {
		Classed_and_Objects cl=new Classed_and_Objects(23, "hyderabad", "software");
		System.out.println(cl.toString());
	}
	
}

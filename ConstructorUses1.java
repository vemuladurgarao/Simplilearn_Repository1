package assistedProjects;



public class ConstructorUses1 
{
	
	private int data;
	private double d;
	
	public ConstructorUses1(int data,double d)
	{
		this.data=data;
		this.d=d;
	}
  public static void main(String[] args) {
	
	  ConstructorUses1 c=new ConstructorUses1(23, 40.0);
	  System.out.println("parameterized constructor");  //parameterized constructor
	  System.out.println(c.data);
	  System.out.println(c.d);
	 
	 
	 
	 
  } 
}
	 
	 
			  



  



 





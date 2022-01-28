package assistedProjects;

public class methods {
public static void main(String[] args) {
	
	methods m=new methods();
	System.out.println(m.multiply(10, 20));
	m.show(10, 20);
	m.show(10, 20.3);
}

private int c;

    //method with return type

  public int multiply(int a,int b)
  {
	  return c=a*b;
  }
  
  public void show(int a,int b)
  {
	  int c=a/b;
	  System.out.println("division is :"+c);
  }
  public void show(int a,double b)
  {
	  System.out.println("multipication is :"+a*b);
  }
}

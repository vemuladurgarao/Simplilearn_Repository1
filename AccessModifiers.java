package assistedProjects;

public class AccessModifiers
{

	private int d=30;
	
	private void show()
	{
		System.out.println("it is private method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers a=new AccessModifiers();
		a.show(); //private variables and methods are used with the class and within the package cannot used outside the class if used it will show the complie time error
        System.out.println(a.d);
        
        Methods m=new Methods(); //public variables and methods are used within the class and in same package and outside class in same package and it can access outside the package
        m.Public_method();
        System.out.println(m.d1);
        
        default_method d=new default_method();//without using modifier it is a default modifier it can be used within the class and in same package and cane used outside the class but cannot be used outside the package
        d.method1();
        System.out.println(d.d2); 
        
        Protected_method p=new Protected_method();
        p.show1();// protected methods can be used within the class and in outside class in same package and it can access outside the package but through inheritance only
        
        
        
	}

}


 class Methods
{
	 public int d1=40;
	 public void Public_method()
	 {
		 System.out.println("it is a public method");
	 }
      
      
}
 
 
 class default_method
 {                             //when using the outside the package first we have to import the package
	 int d2=50;
	 void method1()
	 {
		System.out.println("it is a default method becoz we are not using any access modifier"); 
	 }
 }
 
 
 class Protected_method
 {
	 protected void show1()
	 {
		 System.out.println("it is a protected method");
	 }
 }

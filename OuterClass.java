package assistedProjects;

public class OuterClass 
{
	private String msg="hello";
	class inner
	{
	public void show(){
		System.out.println(msg+"it is a outer class");
	}
  public static void main(String[] args) {
	
	  OuterClass out=new OuterClass();
	  OuterClass.inner in=out.new inner();
	  in.show();
}
}
}
     
 

class InnerClass //it is a inner class
{
	private String msg="hii";
   
	class inner1
	{
	   public void Inner_Class() 
	   {
		
		   System.out.println("it is a inner");
		  
		   }
	
	   public static void main(String[] args) {
			
		   InnerClass ins=new InnerClass();
		   InnerClass.inner1 in1=ins.new inner1();
		   in1.Inner_Class();
	
   }
	 
}
}





   

   


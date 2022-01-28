package assistedProjects;


class Demo extends Exception  {
	public Demo(String s) { 
        super(s); 
    } 
} 
public class CustomizeExceptions {
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try
	        { 
	            throw new Demo("temp"); 
	        } 
	        catch (Demo d) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(d.getMessage()); 
	        } 

		}

	}


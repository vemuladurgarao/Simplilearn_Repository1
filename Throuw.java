package assistedProjects;

public class Throuw {

    public static void main(String[] args)
    {
    	Throuw T = new Throuw();
        try
       {
           T.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\n\tError : " + Ex.getMessage());
       }
       System.out.print("\n\tEnd of program.");
   

        int a=45,b=0,result;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                result = a / b;
                System.out.print("\n\tThe result is : " + result);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }


    void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
     


}

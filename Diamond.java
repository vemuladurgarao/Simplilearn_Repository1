package assistedProjects;

public interface Diamond {

    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
 class TestClass implements Diamond, Second 
{  
    public void show() 
    {  
        Diamond.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass ob = new TestClass(); 
        ob.show(); 
    } 

}

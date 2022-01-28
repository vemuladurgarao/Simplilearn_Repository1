package assistedProjects;

public class Polymorphism {

	public static void main(String[] args)
	{
		Polymorphism p=new Polymorphism();
		System.out.println(p.polymorphism(20, 20));
		System.out.println(p.polymorphism(2, 3, 6));
		System.out.println(p.polymorphism(3.5, 4.6));
	
		
	}
	public int polymorphism(int x,int y)
	{
		return x*y;
	}
	public int polymorphism(int x,int y,int z)
	{
		return x*y+z;
	}
	public double polymorphism(double x,double y)
	{
		return x+y;
	}
}
class car
{
public int gear; 
public int speed; 
public car(int gear, int speed) 
{ 
    this.gear = gear; 
    this.speed = speed; 
} 
public void applyBrake(int decrement) 
{ 
    speed -= decrement; 
} 
public void speedUp(int increment) 
{ 
    speed += increment; 
}  
public String toString()  
{ 
    return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed); 
}  
} 
class Safari extends car  
{ 
public int seatHeight; 
public Safari(int gear,int speed,int startHeight) 
{  
    super(gear, speed); 
    seatHeight = startHeight; 
}  
public void setHeight(int newValue) 
{ 
    seatHeight = newValue; 
} 
@Override
public String toString() 
{ 
    return (super.toString()+ 
            "\nseat height is "+seatHeight); 
} 
}
 class Test  
{ 
public static void main(String args[])  
{ 
    Safari mb = new Safari(3, 100, 25); 
    System.out.println(mb.toString());
} 





}





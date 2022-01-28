package assistedProjects;

public class Inheritance {

 
	    public int gear; 
	    public int speed; 
	    public Inheritance(int gear, int speed) { 
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
	    public void applyBrake(int decrement) { 
	        speed -= decrement; 
	    } 
	    public void speedUp(int increment) { 
	        speed += increment; 
	    }  
	    public String toString()  { 
	        return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed); 
	    }  
	}
	class MountainBike extends Inheritance  { 
	    public int seatHeight; 
	    public MountainBike(int gear,int speed,int startHeight) {  
	        super(gear, speed); 
	        seatHeight = startHeight; 
	    }  
	    public void setHeight(int newValue) { 
	        seatHeight = newValue; 
	    } 
	    
	    @Override
	    public String toString() { 
	        return (super.toString()+ "\nseat height is "+seatHeight); 
	    } 
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MountainBike mb = new MountainBike(3, 100, 25); 
		        System.out.println(mb.toString());

		}
	}
	




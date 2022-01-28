package assistedProjects;

public class StasticsMain {


public class Main
{
public static void main(String[] args) {
	OrderedStastics ob = new OrderedStastics(); 
    int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
    int n = arr.length,k = 4; 
    System.out.println(" smallest element is "+ ob.orderedStastics(arr, 0, n-1, k)); 
}
}
}

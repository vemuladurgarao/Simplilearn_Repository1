package assistedProjects;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.lang.String;

public class MapUses 
{
public static void main(String[] args) {
	MapUses map=new MapUses();
	System.out.println("hashmap");
	map.hashMap();
	System.out.println("linkedhashmap");
	map.linkedHashMap();
	System.out.println("treemap");
	map.treeMap();
	
	
}
public void hashMap() //hashmap contains the values based on the keys 2.it contains only unique keys
{
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(1, "durgarao");
	h.put(2, "ravi");// for adding the elements we had used the put() method
	h.put(3, "null");
	h.put(1, "durgarao");//it does not allow the duplicate values
	System.out.println(h);
	System.out.println(h.get(3));
	System.out.println(h.size());
}
public void linkedHashMap() //it maintains the insertion order
{
	LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
	map.put(1, null);
	map.put(2, "durgarao");
	map.put(3, "ravi");
	System.out.println(map);
	map.clear();
	System.out.println(map);
	System.out.println(map.isEmpty());
}

public void treeMap()
{
	TreeMap<Integer,String> t1=new TreeMap();
	t1.put(1, null);
	t1.put(2,"durgarao");
	t1.put(1, null); //it does not allow the null key and null value and duplicate values
	System.out.println(t1);
	System.out.println(t1.clone());
	
}
}

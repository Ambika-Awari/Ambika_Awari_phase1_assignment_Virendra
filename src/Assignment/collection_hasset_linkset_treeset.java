package Assignment;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class collection_hasset_linkset_treeset {

	public static void main(String[] args) {
		 HashSet<String> hs=new HashSet<String>();
			
			hs.add("Apple");
			hs.add("orange");
			hs.add("banana");
			hs.add("Pineapple");
			hs.add("Papaya");
			hs.add("Mango ");
			hs.add("Guava");
			hs.add("Lemon");
			hs.add("Watermelon");
			hs.add("Blackberry ");
			
			System.out.println("Size of Hashset is "+ hs.size());
		     System.out.println("remove the element "+hs.remove("Apple") + hs.remove("Papaya"));
		     hs.add("Cherry");
			hs.add("Grapes");
			hs.add("Plum");
		     System.out.println("Size of Hashset is "+ hs.size());
			System.out.println("Does hashset contains this 'orange' element  " + hs.contains("orange"));		
		
			System.out.println("remove the element "+hs.remove("i"));
		    hs.clear();
		    System.out.println("is hashset empty  " +hs.isEmpty());
		    
		    System.out.println("----------------------------------");
		    
	       
	    	
	        LinkedList<String>         ll = new LinkedList<String>();
	        
	        ll.add("Apple");
			ll.add("orange");
			ll.add("banana");
			ll.add("Pineapple");
			ll.add("Papaya");
			ll.add("Mango ");
			ll.add("Guava");
			ll.add("Lemon");
			ll.add("Watermelon");
			ll.add("Blackberry ");
			
			
			 System.out.println("Size  "+ll.size());        
	        System.out.println(ll);
	        System.out.println("Size  "+ll.size());
	        ll.add("Cherry");
	        ll.add("Grapes");
	        ll.add("Plum");
	     	System.out.println("Size  "+ll.size()); 
	        System.out.println("remove Apple and Papaya "+ll.remove("Papaya")+ll.remove("Apple"));
	        System.out.println("Does List contains 'orange' "+ll.contains("orange"));
	        System.out.println("Is List empty "+ll.isEmpty());
	        System.out.println("----------------------------------");
		    
	        TreeSet<String> treeSet = new TreeSet<String>();       
	        
	        treeSet.add("Apple ");
	        treeSet.add("orange");
	        treeSet.add("banana");
	        treeSet.add("Pineapple");
	        treeSet.add("Papaya");
	        treeSet.add("Mango ");
	        treeSet.add("Guava");
	        treeSet.add("Lemon");
			treeSet.add("Watermelon");
			treeSet.add("Blackberry ");
			
			
			System.out.println("Size  "+ treeSet.size());
	        System.out.println("TreeSet is : " + treeSet);
	      
	        System.out.println("does it contain orange"+treeSet.contains("orange"));
	        System.out.println("Size  "+ treeSet.size());
	        treeSet.add("Cherry");
			treeSet.add("Grapes");
			treeSet.add("Plum");
	        System.out.println("removing Apple : " +treeSet.remove("Apple") );
	        System.out.println("removing Papaya : " +treeSet.remove("Papaya") );
	        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
	}

}

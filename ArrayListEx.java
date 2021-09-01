package first;
import java.util.*;

public class ArrayListEx {
	
	public static void main(String[] args) {
		// in this video we discuss about arraylist 
	    // how to define arraylist in java
		// basic and important method is used in arraylist in java
		
		//define 
		
		ArrayList <String> arr1=new ArrayList <String>();
		
	   // how to add element in arraylist using add method
		
		arr1.add("catch error");
		arr1.add("Subscribe");
		arr1.add("Like ");
		arr1.add("Share");
		arr1.add("Thanks for watching");
		
		System.out.println(arr1);
		
		
		// how to remove element from arraylist using index and value
		// first using index
		 // if we want to remove index 2 from arraylist  (*note index start always from 0 in java )
		
		arr1.remove(2);
		
		System.out.println(arr1);
		
//		output -- [catch error, Subscribe, Share, Thanks for watching]    here index 2 is missing 
		
		
//		using value removal in arraylist
//		java is a case sensitive so we have to type proper word like in this case s of share is capital in arraylist
		arr1.remove("Share");
		System.out.println(arr1);	
		
//		output ---- [catch error, Subscribe, Thanks for watching]
		
		
		 
		// contains method is used to check a specific element is available in arraylist or not
		// it gives only true and false
		System.out.println(arr1.contains("Subscribe"));
		
		
		// size method gives size of arraylist  
		System.out.println(arr1.size());
		// it gives size of final arraylist size or length
		
		
		
		// get method is used to get value on specific index in arraylist 
		
		System.out.println(arr1.get(1));
//		index start from 0,1,2 so it gives Subscribe
		
		
		// clear is used to clear arraylist in single step 
		arr1.clear();
		System.out.println(arr1);
		
		
		System.out.println("Thanks for watching my video and please do subscribe my channel and like the video ");
		
		
		
		
		  
		
		
		
		
		
		
		
		
		
		
		  
		
		
		
	}

}

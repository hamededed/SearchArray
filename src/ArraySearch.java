
import java.util.Scanner;
public class ArraySearch {
	  public static void main(String[] args) { 
	  methodOne(); 
	  } 
	  static void methodOne() { 
	    // initialize array 
	    String[] array = {  "xxxxx@gmail.com", "jjjjj@hotmail.com", "yyyyy@yaho.com" }; 
	    // initialize value to search 

	    Scanner value = new Scanner(System.in);
	    System.out.println("Please enter your email to check: ");
	    String valueToSearch = value.nextLine();
	    
	    // initialize boolean variable 
	    boolean isExists = false; 
	    // iterate over array 
	    for (int i = 0; i < array.length; i++) { 
	      // get the value at current array index 
	      String arrayValue = array[i]; 
	      // compare values 
	      if (valueToSearch.equals(arrayValue)) { 
	        isExists = true; 
	        // if value is found, terminate the loop 
	        break; 
	      } 
	    } 
	    if (isExists) { 
	      System.out.println("E mail is found in the array, please try another ID."); 
	    } else { 
	      System.out.println("E mail is not found in the array, please proceed to save it."); 
	    } 
	  } 
	}





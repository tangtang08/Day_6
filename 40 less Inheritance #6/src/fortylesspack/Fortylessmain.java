//Tangy F.
//Displaying odd numbers less than 40 using inheritance

package fortylesspack;
public class Fortylessmain {

	public static void main(String[] args) {
		
		// create an OBJECT
		Fortylessmain obj1=new Fortylessmain();
		int w=1;
		//call the METHOD
		System.out.println(obj1.odd(w));	
	}

	public int odd(int w ){
		//declare a variable 
		int r=1;

		// create a do while loop
	do {
		 System.out.println(r);
		
		// add 2 to so that it prints the 2nd number that appears after it prints  	 
		 r=r+2;
	} 
	while ( r<=38);
		
		return r;
	}
	
	}		
	

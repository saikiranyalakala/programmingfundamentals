package AssignmentNew;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitToCelsius {
	public void  convertToCentigrade(){
		float temperatue=0;
		 Scanner in = new Scanner(System.in);      
		 
		    System.out.println("Enter temperatue in Fahrenheit");
		    temperatue = in.nextInt();
		if(temperatue>0){
	 
	    temperatue = ((temperatue - 32)*5)/9;
	    DecimalFormat f = new DecimalFormat("##.00");
	    	 System.out.println("Temperatue in Celsius = " +f.format(temperatue)); 
		}
	    	 else{
	    	 System.out.println("invalid input");
	    
	    	
	     }
	    }
	
	public static void main(String[] args) {
		FahrenheitToCelsius fc=new FahrenheitToCelsius();
		fc.convertToCentigrade();
		
	}

}

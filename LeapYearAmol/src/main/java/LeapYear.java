package main.java;

public class LeapYear {

	public boolean Check(int year){
		 boolean leap = false;

		 	/*
		 	 * exactly divisible by 4 except for century years
		 	 * 
		 	 */
		    
	        if(year % 4 == 0)
	        {  
	        	//divisible by 4 but not by 100 ARE leap year
	        	if( year % 100 == 0)
	            {
	        	    //divisible by 400 is leap year
	                if ( year % 400 == 0)
	                    leap = true;
	                else
	                    leap = false;
	            }
	            else
	                leap = true;
	        }
	        else
	            leap = false;

	        if(leap)
	            System.out.println(year + " is a leap year.");
	        else
	            System.out.println(year + " is not a leap year.");
	    
		return leap;
	}
}

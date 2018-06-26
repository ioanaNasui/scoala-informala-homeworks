//Implement a Number of Days in a Month calculator using a switch statement.
public class DaysInAMonth {
	public static void main(String... args){
		System.out.println("Please write the month (eg. March): ");
		String month= System.console().readLine();//Sting.parseString(args[0]);
		month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
		int numDays=0;
		switch(month.toLowerCase()) {
    		case "january": case "march": case "may":
            case "july": case "august": case "october":
            case "december":
                numDays = 31;
                System.out.println(month+" has "+numDays+ " days!" );
                break;
    		case "april": case "june":
            case "september": case "november":
                numDays = 30;
                System.out.println(month+" has "+numDays+ " days!" );
                break;
    		case "february":
    			System.out.println("Please write the year: ");
				int year = Integer.parseInt(System.console().readLine()); //int year=Integer.parseInt(args[0]); // 0 or 1?!?!?!
    			if (!(year % 4 == 0)) 
    				{numDays=28;
    				} 
                else if (!(year % 100 == 0)) 
                		{numDays=29;
    				} 
                     else if (!(year % 400 == 0)) 
                     		 {numDays=29;
    				 	} 
                 		  else  numDays = 29;
                System.out.println(month+" has "+numDays+ " days!" );
                break;
            default:
                System.out.println("The month you wrote is invalid. Please pay attention to the spelling");
        }
		
	}
}
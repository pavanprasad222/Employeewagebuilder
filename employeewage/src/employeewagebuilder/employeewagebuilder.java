package employeewagebuilder;

public class employeewagebuilder {
	 public static final int IS_PART_TIME = 1;
	   public static final int IS_FULL_TIME = 2;
	   
	public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR,
			                            int NO_OF_WORKING_DAYS, int MAX_HOUR_PER_MONTH) {
		// TODO Auto-generated method stub
			  //variables
			  int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			  //computation
			  while (totalEmpHrs <= MAX_HOUR_PER_MONTH  &&
			          totalWorkingDays < NO_OF_WORKING_DAYS) {
			   totalWorkingDays++;
			  int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			   switch (empCheck) {
			    case IS_PART_TIME:
			       empHrs = 4;
			        break;
			    case IS_FULL_TIME:
			       empHrs = 8;
			       break;
			   default:
			      empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp hr: " +empHrs);
			}
			int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Total Emp Wage for Company: " +company+" is: "+ totalEmpWage);
			
			return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computeEmpWage("SRMT", 30, 20, 50);
		computeEmpWage("Dmart", 20, 10, 40);
			   }
	}





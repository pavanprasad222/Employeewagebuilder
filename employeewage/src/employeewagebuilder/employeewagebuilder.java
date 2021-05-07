package employeewagebuilder;

public class employeewagebuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			       // constants
			       int IS_FULL_TIME = 1;
			       // computation
			       double empCheck = Math.floor(Math.random() * 10) % 2;
			       if (empCheck == IS_FULL_TIME)
			       System.out.println("Employe is Present");
			      else
			       System.out.println("Employe is Absent");
			    }
}
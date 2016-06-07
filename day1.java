import java.util.Scanner; 
public class day1 {

	public static void main(String[] args) {
		
		
		String answer = "";
		
		do 
		{
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		double n1 = scan.nextDouble();

		System.out.println("Enter Width");
		double n2 = scan.nextDouble(); 
		
		System.out.println("Area = " + (n1 * n2));
		System.out.println("perimeter = " + (n1 * 2 + n2 * 2));
		
		System.out.println("do you want to continue?");
		String garbage = scan.nextLine(); //clear input string 
		answer= scan.next();
		
		} while (answer.equalsIgnoreCase("y")|| answer.equalsIgnoreCase("yes"));
			
		System.out.println("Jyanee");
		
		
	}

}

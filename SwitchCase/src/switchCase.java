import java.util.Scanner;
public class switchCase {
                                                   //Calculator
	public static void 3 
	(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a==");
	int a=sc.nextInt();
	
	System.out.println("Enter b==");
	int b=sc.nextInt();
	
	System.out.println("Enter Operation");
	sc.nextLine();
	char operation=sc.nextLine().charAt(0);
	
	int result=0;
	

	switch(operation) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("Invalid Operation!!!");
	}

	System.out.println("Result is" +  result);

	}

}

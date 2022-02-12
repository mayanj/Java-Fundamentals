import java.util.Scanner;

public class MultiOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteredNumber;
		System.out.println("Welcome to the Multi-Operations option.");
		System.out.println("Enter '1': To check the Palindrome Number.");
		System.out.println("Enter '2': To print the pattern of stars in decreasing order.");
		System.out.println("Enter '3': To check whether the input number is a prime number.");
		System.out.println("Enter '4': To print Fibonacci series of size.");
		System.out.println("**************************");
		
		Scanner in = new Scanner(System.in);
		int operation = in.nextInt();
		System.out.println(operation);
		
		switch(operation) {
		case 1:
			System.out.println("Please enter the number: ");
			 enteredNumber = in.nextInt();
			 palindromeCheck(enteredNumber);
			break;
		case 2:
			System.out.println("Please enter the number of rows: ");
			enteredNumber = in.nextInt();
			printPattern(enteredNumber);
			break;
		case 3:
			System.out.println("Please enter the number: ");
			enteredNumber = in.nextInt();
			checkPrimeNumber(enteredNumber);
			break;
		case 4:
			System.out.println("Please enter the number: ");
			enteredNumber = in.nextInt();
			printFibonacciSeries(enteredNumber);
			break;
			
		}
	}

	
	public static void palindromeCheck(int number) {
		int temp=number,rem,rev=0;
		while(number>0) {
			rem=number%10;
			rev= (rev*10)+rem;
			number /=10;
		}
		if(rev==temp) {
			System.out.println(temp  +" is a Palindrome Number.");
		}else {
			System.out.println(rev +" is not a Palindrome Number");
		}
		
	}

	public static void printPattern(int number) {
	//To print the pattern of stars in decreasing order. 	
		for(int i=number; i>0; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void checkPrimeNumber(int number) {
		int counter=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				counter++;
				System.out.println(number+" is not a prime number.");
				break;
			}
		}
		if(counter==0) {
			System.out.println(number+ " is a prime number.");
		}
		}
	
	public static void printFibonacciSeries(int number) {
		int nextNum, num1=0, num2=1;
		for(int i=1;i<number;i++) {
			System.out.print(num1+",");
			nextNum = num1+num2;
			num1=num2;
			num2=nextNum;
		}
	}
}

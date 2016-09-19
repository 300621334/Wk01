package numbers;

/**Addition program that displays two numbers*/
//to comment out with // do ctrl+/
//to comment out e /**/ ctrl+shift+/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumbersDriver {

//main() method is beginning point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//GUI commands
		String name = JOptionPane.showInputDialog("What is your name? ");
		String message = String.format("Welcome, %s to Java Programming!", name);
		JOptionPane.showMessageDialog(null, message);
				
		
		
		
		
/*//Create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("first number: ");
		num1 = input.nextInt();
		System.out.print("Second Number: ");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.printf("Sum of %d & %d is %d",num1, num2, sum);
		input.close();
		*/
		
		
		
		
		
		
		
		/*Scanner input = new Scanner(System.in); 
		String name;
		System.out.print("Type your name please: ");
		name = input.nextLine();
		System.out.println("You name is " + name + ".");
		*/
		
	}//end main method

}//end class

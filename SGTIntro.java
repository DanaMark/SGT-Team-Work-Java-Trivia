import java.util.Scanner;


public class SGTIntro {

	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Hi! Do you want to play Java Trivia? (Answer Y/N)");
		String answerYN = input.nextLine();
		
		if(answerYN.equalsIgnoreCase("Y")){
			System.out.println("Great! Let's play!");
			
		}else if(answerYN.equalsIgnoreCase("N")){
			System.out.println("Have a nice day!");
			
		}else{
			System.out.println("Please, answer with Y or N.");
		}
		

		String exp3 = "Classes and Objects are basic concepts of Object Oriented Programming which revolve around the real life entities.\n"
				+ "A class is a user defined blueprint or prototype from which objects are created. \n"
				+ "It represents the set of properties or methods that are common to all objects of one type.";
		
		String exp4 = "Because in Java elements start counting from 0. Element [0] is \"1\", so element [3] is \"4\".";
		
		String exp5 = "It is a basic unit of Object Oriented Programming and represents the real life entities. \n"
				+ "A typical Java program creates many objects, which as you know, interact by invoking methods.";
		
		String exp6 = "We can declare variables in java as follows: type: Type of data that can be stored in this variable.\n"
				+ " name: Name given to the variable.";
		
		String exp7 = "Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly \n"
				+ " while some condition evaluates to true. Java provides three ways for executing the loops. \n"
				+ "While all the ways provide similar basic functionality, they differ in their syntax and condition checking time. ";
		
		String exp8 = "Char size is 16 bit i.e 2 byte. ";
		
		String exp9 = "Using new keyword is the most basic way to create an object. This is the most common way to create an object in java. \n"
					+ " Almost 99% of objects are created in this way. ";
		
		String exp10 = "&& Conects two boolean expresions into one. Both expresions must be true for the overall expresion to be true";
		
		
		
		String q8 = "What is the size of a Char in Java? \n"
				+ " A.  16 bits \n"
			    + " B.  7 bits \n"
			    + " C.  8 bits \n"
			    + " D.  4 bits.";
		
		String q9 = "What is the keyword used in java to create an object? \n"
				+ " A.  This \n"
				+ " B.  Sync \n"
			    + " C.  New \n"
				+ " D.  New() ";
		
		String q10 = "If you want your condition to depend upon two conditions BOTH being true. \n" 
				+ "What is the propper notation to put between the two Boolean statements?\n "
				+ " A. 	&& \n"
				+ " B.  ! \n"
			    + " C.  == \n"
				+ " D.  ||  ";
		

			   

			    
			    
		
		
		
		
		
		System.out.println(exp4);
	}

}

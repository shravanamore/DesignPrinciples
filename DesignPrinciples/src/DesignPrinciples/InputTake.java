package DesignPrinciples;

import java.util.*;
public class InputTake
{
    static Scanner sc;

    public InputTake() 
    {
        sc = new Scanner(System.in);
    }

    static int readNumber1() 
    {
        return sc.nextInt();
    }
    
    static int readNumber2() 
    {
        return sc.nextInt();
    }
   public void takeInput()
   {
	    int number1=0;
	    int number2=0;
	    int choice=0;
	    
	    while(true)
	    {
	        System.out.println("1 ->Add(+)");
	        System.out.println("2 -> Substract(-)");
	        System.out.println("3 -> Multiplication(*)");
	        System.out.println("4 -> Division(/)");
	        System.out.println("5 -> Modulo(%)");
	        System.out.println("6 -> Exit");
	        System.out.println("Enter your choice");
	        choice=sc.nextInt();
	        
	        if(choice == 6)
	        {
	        	System.out.println("Exit");
	            System.exit(0);
	        }
	        System.out.println("Enter the first number ");
            number1 = readNumber1();    
            System.out.println("Enter the second number");
            number2 = readNumber2();                
	        switch(choice)
	        {
	            case 1:
		            Addition sum = new Addition(); 
		            sum.perform(number1, number2);
		            break;
	            case 2:           
		            Subtract subtract = new Subtract();
		            subtract.perform(number1, number2);
		            break;
	            case 3:
		            Multiply mult = new Multiply();
		            mult.perform(number1, number2);
		            break;
	            case 4:
		            Division div = new Division();
		            div.perform(number1, number2);
		            break;
	            case 5:
		            Modulo modulo = new Modulo();
		            modulo.perform(number1,number2);
		            break;
	            default:
		            System.out.println("Enter your choice  ");
		            break;
	                
	        }       
	    }
   }

}
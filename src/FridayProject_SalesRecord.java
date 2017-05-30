//This Programs asks for customer ID, Name, SalesCost, Tax Code and outputs all the input Values with the total cost.
// User can add more records until they quit

import java.util.Scanner;
import java.io.*;

public class FridayProject_SalesRecord {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);


		double total_Cost= 0;

		Boolean more_Record= true;
		String tax_code;

		while (more_Record){

			System.out.println("Enter the Customer ID: ");
			String customer_Id=sc.next();
			sc.nextLine();

			System.out.println("Enter the Customer Name: ");
			String name=sc.nextLine();
			System.out.println("Enter the Sales Amount: ");

			while (!sc.hasNextDouble()){
				System.out.println(" Wrong Input. Enter the Sales Amount: ");
				System.out.println("Enter the Sales Amount: ");
				sc.next();


			}
			double amount=sc.nextDouble();
			sc.nextLine();
			
			do{
			System.out.println("Enter the Tax Code: ");
			String code=sc.nextLine();
			tax_code=code.toLowerCase();

			
			}
		     while ( !(sc.equals("nrm")) && !(sc.equals("npf")) && !(sc.equals("biz")));
			
			

       

			if ((tax_code.equals("NRM"))||(tax_code.equals("nrm")) ){

				total_Cost= .06*amount+ amount; 
			}

			else if ((tax_code.equals("NPF"))||(tax_code.equals("npf"))){

				total_Cost= amount; 
			}
			else if ((tax_code.equals("BIZ"))||(tax_code.equals("biz"))){

				total_Cost= amount+.045*amount; 
			}

			else{
				System.out.print("The Tax Code was incorrect \n");

			}

			if (total_Cost>0){

				System.out.println("Customer ID: "+ customer_Id);
				System.out.println("Customer Name: "+name);
				System.out.println("Sales Amount:$ "+ amount);
				System.out.println("Total Amount due:$ "+ total_Cost);	


			}
			System.out.println("Do you want to Enter More Record(y/n)?");
			String choice=sc.next();

			if (choice.equals("y")){
				continue;

			}

			else if(choice.equals("n")) {
				more_Record= false;
			}

			else{

				System.out.println("Wrong Input");

			}





		}
		
	}


}


/*

Pseudocode:

Sales_Record



WHILE MoreRecord

	Prompt Customer_ID, Name, Sales_Amount, TaxCode

	IF TaxCode== NRM
	    tax=.06 x Sales_Amount
	ELSEIF TaxCode== NPF
	    tax=0
	ELSEIF TaxCode==BIZ
	    tax= .045 x Sales_Amount

	ENDIF

	TotalCost= SalesAmount+tax

	Print Customer_ID
    Print Customer Name
	Print Sales_Amount
	Print TaxCode
	Print TotalCost

	Prompt If User Wants More Record

	LOOP






 */
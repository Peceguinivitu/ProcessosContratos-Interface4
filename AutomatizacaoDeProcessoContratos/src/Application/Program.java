package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Contract;
import Model.Entities.Installment;
import Model.Service.ContractService;
import Model.Service.PaypalService;

public class Program {
  public static void main(String args[]) {
	  
	 Locale.setDefault(Locale.US);
	  

	 
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the contract details:");
	  System.out.print("Number:");
	  int number = sc.nextInt();
	  sc.nextLine();
	  System.out.print("Date (dd/MM/yyyy):");
	  LocalDate date = LocalDate.parse(sc.next(), formatter);
	  System.out.print("contract value:");
	  double value = sc.nextDouble();
	  
	  Contract contract = new Contract(number,date,value);
	  
	  
	  System.out.print("Enter the number of installments:");
	  int enterInstallments = sc.nextInt();
	  
	  
	  ContractService contractService = new ContractService(new PaypalService());
	  
	  contractService.processContract(contract, enterInstallments);
	  
	  System.out.println("INSTALLMENTS:");
	  for(Installment installment: contract.getInstallments()) {
		  System.out.println(installment);
	  }
	  
	  
	  sc.close();
  }
}

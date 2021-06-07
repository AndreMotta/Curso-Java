package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.Departamento;
import entidade.HourContract;
import entidade.Worker;
import entidade.enums.WorkerLevel;

public class Program {
@SuppressWarnings("unused")
public static void main(String[]args) throws ParseException {//throws== permissão para erro no Date
 Scanner sc= new Scanner(System.in);
 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
 

 	System.out.print("Enter department's name: ");
 	String departamentoName= sc.nextLine();
 	System.out.println("Enter worker data: ");
 	System.out.print("Name: ");
 	String workerName =sc.nextLine();
 	System.out.print("Level: ");
 	String workerLevel =sc.nextLine();
 	System.out.print("Base Salary: ");
 	double baseSalary=sc.nextDouble();
 	Worker worker= new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary, new Departamento(departamentoName));	
	
 	System.out.println();//perguntar sobre contratos
 	System.out.println("How many contracts to this worker? ");
 	int n= sc.nextInt();
 	
 	for(int i=1; i<=n;i++) {
 		System.out.println("Enter contract #" + i + " data: ");
 		System.out.print("Date (DD/MM/YYYY): ");
 		Date contractDate= sdf.parse(sc.next());//data para o que o usuario digitar
 		System.out.print("Value per hours: ");
 		double ValuePerHour=sc.nextDouble();
 		System.out.print("Duration (hours): ");
 		int hours= sc.nextInt();
 		HourContract contract= new HourContract(contractDate, ValuePerHour, hours);
 		worker.addContract(contract);
 		System.out.println();//dar espaço entre os contratos
 	}
 	//inicio do fim
 	System.out.println("-----------------");//organizando console
 	System.out.println("Enter month and year to calculate income (MM/YYYY): ");
 	String monthAndYearString= sc.next();
 	int month= Integer.parseInt(monthAndYearString.substring(0,2));
 	int year= Integer.parseInt(monthAndYearString.substring(3));
 	System.out.println("name: " + worker.getName());
 	System.out.println("Department: " + worker.getDepartment().getName());
 	System.out.println("Income for " + monthAndYearString + ": " + String.format("%.2f", worker.income(year, month)));
 
 	
sc.close();}
}

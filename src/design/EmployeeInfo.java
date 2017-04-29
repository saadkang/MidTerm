package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	public static String companyProduct = "Laptop";
	public int companyEmployee = 10000;
	public static final String companyArea = "800000 sq ft";
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int companyEmployee){
		this.companyEmployee = companyEmployee;
	}
    public EmployeeInfo(String companyProduct){
		this.companyProduct = companyProduct;
	}
    public static String getcompanyName(){
    	return companyName;
    }
    public static String getcompanyArea(){
    	return companyArea;
    }
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(){
		int total=0;
		int salary = 100000;
		int jobWellDone = 10/100;
		int jobOnAverage = 5/100;
		if(jobWellDone > jobOnAverage){
			total = salary / jobWellDone;
			System.out.println("Better Employee Bonus: "+total);
		}else{
			total = salary / jobOnAverage;
			System.out.println("Average Employee Bonus: "+total);
		}
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		int salary = 100000;
		int firstYearWork = 1;
		int secondYearWork = 2;
		int firstYearPension = 5/100;
		int secondYearPension = 10/100;
		if(secondYearWork > firstYearWork && secondYearPension > firstYearPension){
			total = salary / secondYearPension;
			System.out.println("Pension for 2nd year: "+total);
		}else{
			total = salary / firstYearPension;
			System.out.println("Pension for 1st year: "+total);
		}
		return total;
	}
	@Override
	public int employeeId() {
		int employeeid = 5;
		while(employeeid != 0){
			System.out.println(employeeId());
		}
		return 0;
	}
	
	public String employeeName() {
		String employeeName = "Mario";
		return null;
	}
	
	public void assignDepartment() {
		String department = "IT";
		if("IT".equals(department)){
			System.out.println("Mario's department: "+department);
		}else if("Leader".equals(department)){
			System.out.println("Brittany's department: "+department);
		}
		
	}
	
	public int calculateSalary() {
		int workHours = 0;
		int rate = 20;
		int overTime;
		int total;
		Scanner sc = new Scanner(System.in);
		workHours = sc.nextInt();
		if(workHours > 15 && workHours < 40){
			total = workHours * rate;
		}else if(workHours > 40){
			overTime = workHours -= 40;
			total = (int) (workHours * rate + overTime * 1.5);
		}
		return 0;
	}
	
	public void benefitLayout() {
		String benefit;
		int option = 0;
		switch(option){
		case 1:
			benefit = "Home Mortgage";
			System.out.println("Company will pay 60% of your mortgage and when needed help with relocation");
			break;
		case 2:
			benefit = "Company Car";
			System.out.println("Company will buy you a car of your choosing");
		}
		
	}
}

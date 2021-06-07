package entidade;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departamento department;
	private List<HourContract> contracts= new ArrayList<>();
	
	public Worker() {
	}

	//a lista foi instanciada na parte de cima 
	public Worker(String name, WorkerLevel level, Double baseSalary, Departamento department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departamento getDepartment() {
		return department;
	}

	public void setDepartment(Departamento department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income (int year, int month) {
		double sum= baseSalary;
		Calendar cal= Calendar.getInstance();
		for (HourContract c: contracts) {
			
			cal.setTime(c.getDate());
			int c_year= cal.get(Calendar.YEAR);
			int c_month= 1 + cal.get(Calendar.MONTH);
			
		if (year == c_year && month== c_month) {
				sum += c.totalValue();
		}}//fim if e for 
		return sum;}
}//fim da classe 

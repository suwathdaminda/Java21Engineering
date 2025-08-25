package au.abc;

import java.util.Arrays;
import java.util.List;

import au.abc.RecordExample.Id.Type;

public class RecordExample {

	record ABCEmployee(String name, Id id) {}
	record Id (int idNum, Type type) {
		enum Type{FULL_TIME, PART_TIME}
	};
	record NonABCEmployee(String name, Id id) {}
	
	
	public static void main(String[] args) {

		ABCEmployee[] empList = new ABCEmployee[4];
		createABCCompanyEmployeeList(empList);
		List<ABCEmployee> abcList = Arrays.asList(empList);
		
		NonABCEmployee employee = createNonABCEmployee();
		isABCEmployee(employee, abcList);
		
		ABCEmployee likelyABCemployee = new ABCEmployee("Sam", new Id(3,Type.PART_TIME));
		isABCEmployee(likelyABCemployee, abcList);
		
		ABCEmployee exABCemployee = new ABCEmployee("Sandra", new Id(2,Type.PART_TIME));
		isABCEmployee(exABCemployee, abcList);
	
	}

	private static boolean isABCEmployee(Object employee, List<ABCEmployee> abcEmployeeList) {
		if (employee instanceof ABCEmployee(String name, Id id)) {
			String empRecord = "(name:"+ name +" Id:"+id.idNum()+" Employment Type :"+id.type()+")";
			if (abcEmployeeList.contains(employee)) {
				System.out.println("Ïs a ABC employee :: " + empRecord);
				return true;
			}  else {
				System.out.println("Ïs a (ex) ABC employee :: " + empRecord);
			}
		} else {
			System.out.println("Ïs not a ABC employee :: " + employee.toString());
		}
		return false;
	}

	private static NonABCEmployee createNonABCEmployee() {
		NonABCEmployee nonEmployee =  new NonABCEmployee("Shiela", new Id(1, Type.FULL_TIME)); 
		return nonEmployee;
	}

	private static void createABCCompanyEmployeeList(ABCEmployee[] empList) {
		
		empList[0] = new ABCEmployee("Dazy", new Id(1, Type.FULL_TIME));
		empList[1] = new ABCEmployee("Dorin", new Id(2, Type.PART_TIME)); 
		empList[2] = new ABCEmployee("Sam", new Id(3, Type.PART_TIME)); 
		empList[3] = new ABCEmployee("Adian", new Id(4, Type.FULL_TIME)); 
		

		for(ABCEmployee e: empList) {
			System.out.println("Employee Id for : "+ e.name() + " is " + e.id().idNum() +  " and employee type is :" + e.id().type());
		}
	}
}

package au.abc;

import java.awt.DefaultFocusTraversalPolicy;

public class SwitchPatternMatching {

	interface Employee {};
	static class RegularEmployee implements Employee{};
	enum CSuiteEmployee implements Employee {CEO, CFO};
	record EmpId(String name, int id) {};
	
	static void handleId(Object empObject) {
		switch (empObject) {
			case null -> System.out.println("id is null");
			case Integer i -> {
				switch(i) {
					case -1, 0 -> System.out.println("reserved");
					case Integer idint 
						when idint < 0 -> System.out.println("negative");
					case Integer idInt -> System.out.println("positive");
				}
			}
			case String s -> System.out.println("String");
			case EmpId eid -> System.out.println("emp name :" + eid.name + " id:" + eid.id);
		
			case Employee e -> {
				switch(e) {
					case CSuiteEmployee.CEO -> System.out.println("CEO");
					case CSuiteEmployee.CFO -> System.out.println("CFO");
					default -> System.out.println("irregular");
				}
			}
			default -> System.out.println("some other");
			
		}
	
	}
	
	public static void main(String[] args) {
		SwitchPatternMatching matching = new SwitchPatternMatching();
		EmpId e = new EmpId("s", 0);
		matching.handleId(e);
		
		matching.handleId(CSuiteEmployee.CEO);
		matching.handleId(RegularEmployee.class);	}
}

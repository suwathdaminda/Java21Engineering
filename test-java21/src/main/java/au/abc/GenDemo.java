package au.abc;

public class GenDemo {

	public static void main(String[] args) {
		
		Gen<Integer> iob;
		
		iob =  new Gen<Integer>(88);
		iob.showType();
		
		int v = iob.getOb();
		System.out.println("value: " + v);
		
		Gen<String> strOb = new Gen<String>("Generic Test");
		strOb.showType();
		
		String str = strOb.getOb();
		System.out.println("value: " + str);
		
	}

}

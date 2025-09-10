package au.abc;

public class Gen<T> {

	private T ob;

	public Gen(T o) {
		this.ob = o;
	}

	public T getOb() {
		return ob;
	}
	
	public void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

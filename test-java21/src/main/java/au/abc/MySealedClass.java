package au.abc;

public sealed class MySealedClass permits Alpha, Beta {

	public void identify() {
		System.out.println(getClass().getName());
	}
}

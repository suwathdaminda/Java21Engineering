package au.abc;

public non-sealed class Beta extends MySealedClass implements MySealedIf {

	@Override
	public void test() {
		System.out.println(getClass().getName());
		
	}

}

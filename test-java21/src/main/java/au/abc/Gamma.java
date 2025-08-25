package au.abc;

public class Gamma extends Beta implements MyIf {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
		System.out.println(getClass().getName());
	}
}

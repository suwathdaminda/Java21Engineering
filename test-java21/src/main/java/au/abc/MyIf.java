package au.abc;

public non-sealed interface MyIf extends MySealedIf{

	@Override
	default void test() {
		System.out.println("extending sealed interface by a non-sealed interface");
		
	}
}

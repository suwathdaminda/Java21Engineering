package au.abc;

public sealed interface MySealedIf permits Alpha, Beta, MyIf {
	public void test();

}

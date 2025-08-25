package au.abc;

public class SealedClassExample {

	public static void main(String[] args) {
		MySealedClass mySealedClass =  new MySealedClass();
		mySealedClass.identify();
		Alpha alpha =  new Alpha();
		alpha.identify();
		Beta beta = new Beta();
		beta.identify();
		beta.test();
		Gamma gamma = new Gamma();
		gamma.identify();
		gamma.test();
	}
	
}

package au.abc;

public class LambdaTest {
	
	public static void main(String[] args) throws EmptyArrayException {

		LambdaNoArgFunction ret = () -> Math.random() % 100;
		System.out.println("test lambda to return double : " + ret.test());

		// find given number is a even 
		LambdaOneArgFunction x = (n) -> n % 2 == 0;
		// find given is positive or negative
		LambdaOneArgFunction y = (n) -> n >= 0;
		
		if (x.test(10))
			System.out.println("10 is a even number");
		
		if (!x.test(11))
			System.out.println("11 is not a even number");

		if (y.test(5))
			System.out.println("5 is a positive integer");
		
		if (!y.test(-1))
			System.out.println("-1 is a negative integer");
		
		// find given is a factor of another
		LambdaTwoArgFunction z = (n, m) -> n % m == 0;
		
		if (z.test(10, 2))
			System.out.println("2 is a factor of 10");
		
		if (!z.test(10, 3))
			System.out.println("3 is not a factor of 10");
		
		// find factorial of a given - block lambda
		LambdaOneArgFunction3 f = (n) -> {
			
			int result = 1;
			for(int i=1; i<=n; i++) {
				result = i * result;
			}
			return result;
		};
		System.out.println("factorial of 5 (5!) is " + f.test(5));

		System.out.println("factorial of 5 (0!) is " + f.test(0));
		
		System.out.println("factorial of 5 (6!) is " + f.test(6));
		
		// to upper case - block lambda
		LambdaOneArgFunction2 s = (n) -> {
			return n.toUpperCase();
		};
		
		System.out.println("upper case of 'lambda' is " + s.test("lambda"));
		
		// reverse the string - block lambda
		LambdaOneArgFunction2 r = (n) -> {
			String result = "";
			int i;
			for(i = n.length()-1; i>=0; i--) {
				result += n.charAt(i); 
			}
			return result;
		};

		System.out.println("reverse of 'lambda' is " + r.test("lambda"));
		
		// test exception with Lambda
		LambdaFunctionWithException e = (n) -> {
			if (n.length == 0) {
				throw new EmptyArrayException();
			}
			double sum = 0;
			for(int i=0; i<n.length; i++) 
				sum += n[i];
			return sum/n.length;
		};

		double[] ary = {1.0,2.0,9.0};
		System.out.println("avg of array [] is " + e.test(ary));
		System.out.println("avg of array [] is " + e.test(new double[0]));
		
	}

}

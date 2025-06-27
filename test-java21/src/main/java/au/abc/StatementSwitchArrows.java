package au.abc;

public class StatementSwitchArrows {

	
	public static void main(String[] args) {
		int up =0;
		int down =0;
		int left =0;
		int right =  0;
		
		char direction = 'R';
		
		switch(direction) {
			case 'R' -> {
							System.out.println("Turning right");
							right++;
						}
			case 'L' -> {
				System.out.println("Turning left");
				left++;
			}
			case 'U' -> {
				System.out.println("Turning up");
				up++;
			}
			case 'D' -> {
				System.out.println("Turning down");
				down++;
			}
		}
		System.out.println(right);
	}
}

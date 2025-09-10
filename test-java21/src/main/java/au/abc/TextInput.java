package au.abc;

public class TextInput {

	private String currentValue = "";

	public TextInput() {
	}

	public void add(char c) {
		currentValue += c;
	}
	
	public String getValue() {
		return currentValue;
	}
}

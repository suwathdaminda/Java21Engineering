package au.abc;

import java.util.regex.Pattern;

public class NumericInput extends TextInput {

	public NumericInput() {
	}

	@Override
	public void add(char c) {
		String charSeq = "" + c;
		if (!Pattern.matches("[0-9]", charSeq)) {
			super.add(c);
		}
	}
}

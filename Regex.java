public class Regex {

	public String isNumOrOp(String token) {

		if (!token.matches("^[0-9+-/*]+$")) {
			return "Error: Unexpected character: " + token;
		}
		return "isRegex";
	}

}

public class Parant{
/* Problem Parant
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

*/

	public static void main(String[] args){
		String s = args[0];
		if(isValid(s)){
			System.out.println("valid: " + s);
		} else {
			System.out.println("INVALID!");
		}
	}

	bool isValid(String s){
		// valid chars
		String[] validChars = {'(', ')', '[', ']', '{', '}'};

		// check for invalid chars
		for (int i = 0; i < s.length(); i++){
			boolean hasInvalid = false;
			for (int j = 0; j < 6; j++){
				if(s.charAt(i) != validChars[j]){
					hasInvalid = true;
					return false;
					break;
				}			
			}
		}

		// if the number of char is odd
		if(!(s.length() % 2 == 0)){
			return false;
		}
	}
}

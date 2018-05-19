package Homework3;

import java.util.Stack;

public class BracketsValidation {

    char[] string;
    Stack<Character> stack;

    public BracketsValidation() {
        stack = new Stack<>();
    }

    public void setString(char[] inputString) {
        this.string = inputString;
    }

    public String validator() {
        boolean parentheses = check('(', ')');
        boolean squareBrackets = check('[', ']');
        boolean braces = check('{', '}');
        boolean result = parentheses && squareBrackets && braces;

        return stack.isEmpty() && result
                ? "is correct" : "isn't correct";
    }

    private boolean check(char openBracket, char closeBracket) {
        boolean result = false;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == openBracket) {
                stack.push(string[i]);
            } else if (string[i] == closeBracket) {
                if(stack.isEmpty()) {
                    result = false;
                } else {
                    result = stack.pop() == openBracket ? true : false;
                }
            }
        }
        return result;
    }
}

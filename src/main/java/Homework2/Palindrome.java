package Homework2;

public class Palindrome {

    String string;

    public void setString(String string) {
        this.string = string;
    }


    public String palindromeDetector() {

        String temp = "";
        for(int i = string.length() - 1; i >= 0; i--) {
            temp += string.charAt(i);
        }

        return temp.equals(string)
                ? "is palindrome" : "isn't palindrome";
    }
}

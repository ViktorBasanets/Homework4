package Homework2;

import java.util.Arrays;

public class ReverseSubstring {

    char[] array;

    public ReverseSubstring(char[] array) {
        this.array = array;
    }

    public char get(int index) {
        return array[index];
    }

    public void reverse(int from, int to) {
        if(from < 0 || from > to || to >= array.length) {
            System.err.println("\nError: Outside the array!\n" +
                    "Array boundaries: (0, " + (array.length - 1) + ")");
            return;
        }

        for(int i = from, j = to; i < j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

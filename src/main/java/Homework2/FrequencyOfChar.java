package Homework2;

public class FrequencyOfChar {
    char[] string;

    public FrequencyOfChar(char[] string) {
        this.string = string;
    }


    public int charFrequency(char character) {
        int counter = 0;

        for(int i = 0; i < string.length; i++) {
            if(string[i] == character) {
                counter++;
            }
        }

        return counter;
    }
}

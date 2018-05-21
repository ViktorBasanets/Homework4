package Homework1;

public class Ranges {

    int[] array;

    public Ranges(int[] array) {
        this.array = array;
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public String rank() {
        if(!checkValidArray(array)) {
            System.err.println("Invalid Array!");
            return null;
        }

        String result = "[" + array[0];
        int i;
        for(i = 1; i < array.length - 1; i++) {
            if ((array[i] - array[i - 1] != 1) && (array[i + 1] - array[i] != 1)) {
                result += "[" + array[i] + "]";
            } else if (array[i] - array[i - 1] != 1) {
                result += "[" + array[i];
            } else if (array[i + 1] - array[i] != 1) {
                result += " " + array[i] + "]";
            }
        }
        result += " " + array[i] + "]";
        return result;
    }

    private boolean checkValidArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

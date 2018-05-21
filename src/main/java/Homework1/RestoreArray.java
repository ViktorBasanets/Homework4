package Homework1;

import java.util.Arrays;

public class RestoreArray {

    int [] array;

    public RestoreArray(int[] array) {
        this.array = array;
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int get(int index) {
        return array[index];
    }

    public void restoreArray() {

        if(!validationInputArray()) {
            System.err.println("Invalid array!!!");
            return;
        }

        for(int i = 0; i < array.length; i++) {

            if(array[i] < 0 ) {
                array[i] = array[i - 1] - array[i + 1] < 0
                        ? array[i - 1] + 1 : array[i - 1] - 1;
            }
        }
    }

    private boolean validationInputArray() {

        if (array[0] < 0 || array[array.length - 1] < 0 || array[array.length / 2 - 1] < 0) {
            return false;
        }

        if (array.length % 2 == 0) {

            if (array[array.length / 2] < 0) {
                return false;
            }
        } else {

            if (array[array.length / 2 + 1] < 0) {
                return false;
            }
        }

        return true;
    }


}

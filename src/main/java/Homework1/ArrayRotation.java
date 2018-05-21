package Homework1;

public class ArrayRotation {

    int[] array;

    public ArrayRotation(int[] array) {
        this.array = array;
    }

    public int get(int index) {
        return array[index];
    }

    public void rotate(int k) {

        if(k >= array.length || k < 0) {
            System.err.println("'k' bigger then length the main array!!!");
            return;
        }

        int [] temp = new int[k];

        for(int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }

        for(int i = 0; i < array.length - k; i++) {
            array[i] = array[i + k];
        }

        for(int i = 0; i < temp.length; i++) {
            array[array.length - k + i] = temp[i];
        }
    }
}

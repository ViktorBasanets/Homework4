package Homework3;

public class UnixPath {

    char[] path;

    public void setPath(char[] path) {
        this.path = path;
    }

    public char get(int index) {
        return path[index];
    }

    public void rightPath() {
        replace('/', 0);
        path = arrayMaker(path);

        riceTo("/../".toCharArray(), 0);
        path = arrayMaker(path);

        stayOn("/./".toCharArray(), 0);
        path = arrayMaker(path);
    }

     private void replace(char ch, int index) {

        if(index == path.length - 2) {
            return;
        }

        if(path[index] == ch) {
            path[index] = '\0';

            if(path[index + 1] != '/') {
                path[index] = '/';
            }
        }

        replace(ch, ++index);
    }

    private void stayOn(char[] seq, int index) {

        if(index == path.length - 1) {
            return;
        }

        boolean equally = false;

        for(int i = 0; i < seq.length; i++) {
            equally = path[i + index] == seq[i] ? true : false;
            if (!equally) {
                break;
            }
        }

        if(equally) {

            for (int i = 0; i < seq.length; i++) {
                path[i + index] = '\0';
            }

            path[index] = '/';
        }

        stayOn(seq, ++index);
    }


    private void riceTo(char[] seq, int index) {

        if(index == path.length - 1) {
            return;
        }

        boolean equally = false;

        for(int i = 0; i < seq.length; i++) {
            equally = path[i + index] == seq[i] ? true : false;
            if (!equally) {
                break;
            }
        }

        if(equally) {

            for (int i = 0; i < seq.length; i++) {
                path[i + index] = '\0';
            }

            path[index] = '/';

            for(int i = index; i > 0; i--) {
                path[i] = '\0';
            }
        }

        riceTo(seq, ++index);
    }

    private char[] arrayMaker(char[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter += array[i] != '\0' ? 1 : 0;
        }

        if (array[array.length - 1] == '/') {
            counter--;
        }

        char[] result = new char[counter];

        for (int i = 0, j = 0; i < array.length && j < result.length; i++) {

            if(array[i] != '\0') {
                result[j++] = array[i];
            }
        }

        return result;
    }
}

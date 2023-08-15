

public class Main {
    public static void main(String[] args) {
        //TODO add method min/max and add code there
        //TODO add method bubbleSort to sort this array
        int[] array = {5, 22, 49, 13, 31};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}

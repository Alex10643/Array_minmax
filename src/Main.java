
public class Main {

    public static void main(String[] args) {
        minMax();
    }

    public static void minMax() {

        int[] array = {5, 22, 49, 13, 31};
        min(array);
        max(array);
    }

    public static void min(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

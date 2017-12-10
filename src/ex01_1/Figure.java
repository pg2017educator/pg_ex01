package ex01_1;

public class Figure {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(toString(i));
        }
    }

    public static String toString(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "◆";
        }
        if (number % 3 == 0) {
            return "△";
        }
        if (number % 5 == 0) {
            return "□";
        }
        return "" + number;
    }

}

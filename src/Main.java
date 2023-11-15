import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();

    }

    public static void zad1() {

        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;
        double[] w = {1.57, 7.654, 9.986};
        int[] proizvol = new int[282];
    }

    public static void zad2() {

        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;

        double[] w = {1.57, 7.654, 9.986};
        int[] proizvol = new int[282];

        System.out.print(Arrays.toString(q));
        System.out.println();
        System.out.print(Arrays.toString(w));
        System.out.println();
        System.out.print(Arrays.toString(proizvol));
    }

    public static void zad3() {

        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;

        double[] w = {1.57, 7.654, 9.986};
        int[] proizvol = new int[282];

        for (int i = q.length - 1; i >= 0; i--) {
            System.out.print(q[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = w.length - 1; i >= 0; i--) {
            System.out.print(w[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = proizvol.length - 1; i >= 0; i--) {
            System.out.print(proizvol[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void zad4() {
        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;

        for (int i = 0; i < q.length; i++) {
            if (q[i] % 2 != 0) {
                q[i]++;
            }
        }
        System.out.println(Arrays.toString(q));
    }
}
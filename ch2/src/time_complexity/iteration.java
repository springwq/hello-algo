package time_complexity;

import java.sql.SQLOutput;

public class iteration {
    public static void main(String[] args) {
        int res;
        res = forLoop(7);

        System.out.println(res);

        System.out.println("----------");

        System.out.println(whileLoop(7));

        System.out.println("----------");

        System.out.println(whileLoop2(7));

        System.out.println("----------");

        System.out.println(nestedForLoop(7));
    }

    static int forLoop(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }

    static int whileLoop(int n) {
        int res = 0;
        int i = 1;
        while (i <= n) {
            res += i;
            i++;
        }

        return res;
    }

    static int whileLoop2(int n) {
        int res = 0;
        int i = 1;
        while (i <= n) {
            res += i;

            i++;
            i *= 2;
        }

        return res;
    }

    static String nestedForLoop(int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res.append("(" + i + ", " + j + "),");
            }
        }

        return res.toString();
    }
}

package com.t795.trpo.isakov.lab4;

public class Main {

    public static int while1(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }

    public static int while2(int a, int b) {
        int count = 0;
        while (a >= b) {
            a -= b;
            ++count;
        }
        return count;
    }

    public static int while3(int n, int k) {
        int count = 0;
        while (n >= k) {
            n -= k;
            ++count;
        }
        return count;
    }

    public static boolean while4(double n) {
        while (n > 0) {
            double v = Math.log(n) / Math.log(3);
            return (int) v == v;
        }
        return false;
    }

    static double while6(int n) {
        double mul = 1;
        while (n >= 2) {
            mul *= n;
            n -= 2;
        }
        return mul;
    }

    static int while7(int n) {
        int k = 1;
        while (k * k <= n) {
            ++k;
        }
        return k;
    }

    static int while8(int n) {
        int k = 1;
        while (k * k <= n) {
            ++k;
        }
        return k - 1;
    }


    static int while9(int n) {
        int k = 1;
        int number = 3;
        while (number <= n) {
            number *= 3;
            ++k;
        }
        return k;
    }

    static int while10(int n) {
        int k = 0;
        int number = 3;
        while (number < n) {
            number *= 3;
            ++k;
        }
        return k;
    }

    static int while11(int n) {
        int k = 0;
        int sum = 0;
        while (sum < n) {
            ++k;
            sum += 3;
        }
        return k;
    }

    static void while12(int n) {
        int k = 0;
        int sum = 0;
        while (!(sum + k + 1 > n)) {
            ++k;
            sum += k;
        }
        System.out.println(k);
        System.out.println(sum);
    }

    static void while13(int a) {
        int k = 0;
        double temp = 0;
        while (temp <= a) {
            ++k;
            temp += 1 / (double)k;
        }
        System.out.println(k);
        System.out.println(temp);
    }

    static void while14(int a) {
        int k = 0;
        double temp = 0;
        while (temp <= a) {
            ++k;
            temp += 1 / (double)k;
        }
        System.out.println(k - 1);
        System.out.println(temp - 1 / (double)k);
    }

    static void while15(int p) {
        int k = 1;
        double s = 1000;
        while (s <= 1100) {
            ++k;
            s += s * p / 100;
        }
        System.out.println(k);
        System.out.println(s);
    }

    static void while16(int p) {
        int k = 1;
        double d = 10,s = 10;
        while (s <= 200) {
            ++k;
            d += d * p / 100;
            s += d;
        }
        System.out.println(k);
        System.out.println(s);
    }

    static void while17(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /=10;
        }
    }

    static void while18(int n) {
        int sum = 0;
        int num = 0;
        while (n > 0) {
            ++num;
            sum += n % 10;
            n /= 10;
        }
        System.out.println(num);
        System.out.println(sum);
    }

    static int while19(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res;
    }

    static boolean while20(int n) {
        while((n > 0) & ((n % 10) != 2)) {
            n /= 10;
        }
        return (n > 0) & ((n % 10) == 2);
    }

    static boolean while21(int n) {
        while((n > 0) & ((n % 10) % 2 == 0)) {
            n /=10;
        }
        return (n % 10) % 2 != 0;
    }

    static boolean while22(int n) {
        int k = 2;
        while((k < n - 1) & ((n % k) != 0) ) {
            ++k;
        }
        return (n % k) != 0;
    }

    static int while23(int a, int b) {
        while ((a != 0) & (b != 0)) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return a + b;
    }

    static boolean while24(int n) {
        int f1 = 1;
        int f2 = 1;
        int f = 0;
        while (f < n) {
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        return f == n;
    }

    static int while25(int n) {
        int f = 0;
        int f1 = 1;
        int f2 = 1;
        while (f < n + 1) {
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        return f;
    }

    static void while26(int n) {
        int f = 0;
        int f1 = 1;
        int f2 = 1;
        while (f < n) {
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        System.out.println(f2);
        System.out.println(f1 + f2);
    }

    static int while27(int n) {
        int f1 = 1;
        int f2 = 1;
        int f = 0;
        int k = 2;
        while (f < n) {
            ++k;
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        return k;
    }

    static void while28(int e) {
        double ak1 = 0;
        double ak = 2;
        int k = 1;
        while (Math.abs(ak - ak1) >= e) {
            ++k;
            ak1 = ak;
            ak = 2 + 1 / ak1;
        }
        System.out.println(k);
        System.out.println(ak1);
        System.out.println(ak);
    }

    static void while29(int e) {
        double ak1 = 1;
        double ak = 2;
        double ak2;
        int k = 2;
        while (Math.abs(ak - ak1) >= e) {
            ak2 = ak1;
            ak1 = ak;
            ak = (ak2 + 2 * ak1) / 3;
            ++k;
        }
        System.out.println(k);
        System.out.println(ak1);
        System.out.println(ak);
    }

    static int while30(int a, int b, int c) {
        int k = 0;
        double temp;
        while ((a - c) >= 0) {
            a -= c;
            temp = b;
            while (temp - c >= 0) {
                temp -= c;
                ++k;
            }
        }
        return k;
    }

    public static void main(String[] args)
    {
        System.out.println(while1(2, 5));
        System.out.println(while2(3,6));
        System.out.println(while3(5, 10));
        System.out.println(while4(26));
        System.out.println(while6(8));
        System.out.println(while7(15));
        System.out.println(while8(14));
        System.out.println(while9(6));
        System.out.println(while10(9));
        System.out.println(while11(13));
        while12(8);
        while13(12);
        while14(6);
        while15(9);
        while16(21);
        while17(17);
        while18(20);
        System.out.println(while19(11));
        System.out.println(while20(15));
        System.out.println(while21(7));
        System.out.println(while22(4));
        System.out.println(while23(6, 9));
        System.out.println(while24(8));
        System.out.println(while25(12));
        while26(22);
        System.out.println(while27(16));
        while28(11);
        while29(8);
        System.out.println(while30(4,6,9));
    }
}

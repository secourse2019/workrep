package com.company;

public class Main {

    public static void for1 (int n, int k)
    {
        for ( int i = 0; i != n; ++i )
        {
            System.out.println(k);
        }
    }

    public static void for2(int a, int b)
    {
        int count = 0;
        for ( ; a <= b; ++a)
        {
            ++count;
            System.out.println(a);
        }
        System.out.println(count);
    }

    public static void for3(int a, int b)
    {
        --b;
        int count = 0;
        for ( ; a != b; --b)
        {
            ++count;
            System.out.println(b);
        }
        System.out.println(count);
    }

    public static void for4(int first, int last, int price)
    {
        for ( ; first < last; ++first)
        {
            System.out.println(first * price);
        }
    }

    public static void for5(double first, double last, double step, int price)
    {
        for ( ; first < last; first += step)
        {
            System.out.println(first * price);
        }
    }

    public static void for6(double first, double last, double step, int price)
    {
        for ( ; first < last; first += step)
        {
            System.out.println(first * price);
        }
    }

    public static int for7(int a, int b)
    {
        int sum = 0;
        for ( ; a <= b; ++a)
        {
            sum += a;
        }
        return sum;
    }

    public static int for8(int a, int b)
    {
        int mul = 1;
        for ( ; a <= b; ++a)
        {
            mul *= a;
        }
        return mul;
    }

    public static int for9(int a, int b)
    {
        int sum_2 = 0;
        for ( ; a <= b; ++a)
        {
            sum_2 += Math.pow(a, 2);
        }
        return sum_2;
    }

    public static double for10(int size)
    {
        double sum = 0;
        for (double i = 1.0; i <= size; ++i)
        {
            sum += 1.0/i;
        }
        return sum;
    }

    public static int for11(int size, int n)
    {
        int sum = 0;
        for (int i = 0; i <= size; ++i)
        {
            sum += Math.pow(n + i, 2);
        }
        return sum;
    }

    public static double for12(int size)
    {
        double mul = 1.0;
        for (double i = 1.1; i <= size; i += 0.1)
        {
            mul *= i;
        }
        return mul;
    }

    public static double for13(int size)
    {
        double temp = 0;
        for (double i = 1.0; i <= size; i += 0.1, temp *= -1)
        {
            temp += i;
        }
        return temp;
    }

    public static int for14(int size)
    {
        int sum = 0;
        for (int i = 1; i <= size; ++i)
        {
            sum += (2 * i - 1);
        }
        return sum;
    }

    public static double for15(int a, int size)
    {
        double result = 0;
        for (int n = 0; n <= size; ++n)
        {
            result = Math.pow(a, n);
        }
        return result;
    }

    public static void for16(int a, int size)
    {
        int count = 1;
        for (int n = 0; n <= size; ++n)
        {
            count *= a;
            System.out.println(count);
        }
    }

    public static int for17(int a, int size)
    {
        int sum = 1;
        for (int n = 0; n <= size; ++n)
        {
            sum += Math.pow(a, n);
        }
        return sum;
    }

    public static int for18(int a, int size)
    {
        int result = 1;
        for (int n = 1; n <= size; ++n, result *= -1)
        {
            result += Math.pow(a, n);
        }
        return result;
    }

    public static int for19(int size)
    {
        int mul = 1;
        for (int n = 2; n <= size; ++n)
        {
            mul *= n;
        }
        return mul;
    }

    public static int for20(int size)
    {
        int sum = 1;
        for (int n = 2; n <= size; ++n)
        {
            sum += n;
        }
        return sum;
    }

    public static double for21(int size)
    {
        double result = 1;
        for (int n = 2; n <= size; ++n)
        {
            result += 1 / (result * n);
        }
        return result;
    }

    public static double for22(int x, int size)
    {
        double result = 1;
        for (int n = 1; n <= size; ++n)
        {
            System.out.println(result);
            result += Math.pow(x, n) / n;
        }
        return result;
    }

    public static double for23(int x, int size)
    {
        double result = x;
        for (int n = 3; n <= size; n += 2, result *= -1)
        {
            result += Math.pow(x, n) / n;
        }
        return result;
    }

    public static double for24(int x, int size)
    {
        double result = 1;
        for (int n = 2; n <= size; n += 2, result *= -1)
        {
            result += Math.pow(x, n) / n;
        }
        return result;
    }

    public static double for25(int x, int size)
    {
        double result = x;
        for (int n = 2; n <= size; ++n, result *= -1)
        {
            result += Math.pow(x, n) / n;
        }
        return result;
    }

    public static double for26(int x, int size)
    {
        double result = x;
        for (int n = 3; n <= size; n += 2, result *= -1)
        {
            result += Math.pow(x, n) / n;
        }
        return result;
    }

    public static void for29(int a, int size, int h)
    {
        for (int n = 0; n <= size; ++n)
        {
            System.out.println(a + n * h);
        }
    }

    public static void for30(int a, int size, int h)
    {
        for (int n = 0; n <= size; ++n)
        {
            System.out.println(a + n * h);
            System.out.println(1 - Math.sin(a + n * h));
        }
    }

    public static void for31(int size)
    {
        int a = 2;
        for (int n = 1; n <= size; ++n)
        {
            a = 2 + 1 / a - 1;
            System.out.println(a);
        }
    }

    public static void for33(int size)
    {
        int f1 = 1;
        int f2 = 1;
        for (int n = 1; n <= size; ++n)
        {
            f1 += f2;
            f2 = f1 - f2;
            System.out.println(f2);
        }
    }

    /*public static void for34(int size)
    {
        int a1 = 1;
        int a2 = 2;
        for (int n = 1; n <= size; ++n)
        {
            a1 = (a1 + 2 * a2) / 3;
            System.out.println((a1);
        }
    }*/

    public static int for36(int size, int k)
    {
        int sum = 0;
        for (int n = 0; n <= size; ++n)
        {
            sum += Math.pow(n, k);
        }
        return sum;
    }

    public static int for37(int size)
    {
        int sum = 0;
        for (int n = 0; n <= size; ++n)
        {
            sum += Math.pow(n, n);
        }
        return sum;
    }

    public static int for38(int size)
    {
        int sum = 0;
        for (int n = 1, n1 = size; n <= size; ++n, --n1)
        {
            sum += Math.pow(n, n1);
        }
        return sum;
    }

    public static void for39(int size)
    {
        for (int i = 1; i <= size; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.println(i);
            }
        }
    }

    public static void for40(int a, int b)
    {
        for ( ; a <= b; ++a)
        {
            for (int j = 1; j <= a; ++j)
            {
                System.out.println(a);
            }
        }
    }

    public static int while1(int a, int b)
    {
        while (a >= b)
        {
            a -= b;
        }
        return a;
    }

    public static int while2(int a, int b)
    {
        int count = 0;
        while (a >= b)
        {
            a -= b;
            ++count;
        }
        return count;
    }

    public static int while3(int n, int k)
    {
        int count = 0;
        while (n >= k)
        {
            n -= k;
            ++count;
        }
        return count;
    }

    public static int while4(int n)
    {

    }

    public static void main(String[] args) {
        //System.out.println(int1(500));
        for1(5,7);
        for2(1, 10);
        for3(1,10);
        for4(1, 10, 50);
        for5(0.1, 1.0,0.1, 50);
        for6(0.1, 1.0,0.2, 50);
        System.out.println(for7(1, 10));
        System.out.println(for8(1, 10));
        System.out.println(for10(10));
        System.out.println(for11(10, 5));
        System.out.println(for12(2));
        System.out.println(for13(2));
        System.out.println(for14(5));
        System.out.println(for15(2, 5));
        for16(2, 6);
        System.out.println(for17(2, 3));
        System.out.println(for18(2, 3));
        System.out.println(for19(5));
        System.out.println(for20(5));
        System.out.println(for21(5));
        System.out.println(for22(2, 5));
        System.out.println(for23(2, 5));
        System.out.println(for24(2, 5));
        System.out.println(for25(2, 5));
        System.out.println(for26(2, 5));
        for29(2, 6, 3);
        for30(2, 10, 4);
        for31(10);
        for33(10);
        for36(10, 3);
        for39(5);
        for40(1, 4);
    }
}

package com.t795.trpo.Masylionis.lab3;

public class Main {
    public static void for_1(int n, int k) {

        for(int i = 0; i != n; ++i)
        {
            System.out.print(k);
        }
    }

    public static void for_2(int a, int b) {

        int n = 0;
        for(; a <= b; ++a)
        {
            System.out.print(a);
            ++n;
        }
        System.out.print(n);
    }


    public static void for_3(int a, int b) {

        int n = 0;
        for(; a != b; --b)
        {
            System.out.print(b);
            ++n;
        }
        System.out.print(n);

    }

    public static void for_4(double value) {

        for(int i = 1; i != 10; ++i)
        {
            System.out.print(i*value);
        }
    }

    public static void for_5(double value){

        for(double i = 0.1; i <= 1; i += 0.1)
        {
        System.out.print(i*value);
        }
    }

    public static void for_6(double value) {

        for(double i = 1.2; i <= 2; i += 0.2)
        {
        System.out.print(i*value);
        }
    }

    public static int for_7(int a, int b) {

        int temp = 0;
        for(; a <= b; ++a)
        {
        temp += a;
        }
        return temp;
    }

    public static int for_8(int a, int b) {

        int temp = 1;
        for(; a <= b; ++a)
        {
        temp *= a;
        }
        return temp;
    }

    public static int for_9(int a, int b) {

        int temp = 0;
        for(; a <= b; ++a)
        {
        temp += Math.pow(a,2);
        }
        return temp;
    }

    public static double for_10(int n) {

        double temp = 0;
        for(double i = 1; i <= n; ++i)
        {
        temp += 1/i;
        }
        return temp;
    }

    public static int for_11(int n ) {

        int temp = 0;
        for(int i = 0; i != n; ++i)
        {
        temp += Math.pow(n + i, 2);
        }
        return temp;
    }

    public static double for_12(double n) {

        double temp = 1;
        for(double i = 1.1; i <= n; i += 0.1)
        {
        temp *= i;
        }
        return temp;
    }

    public static double for_13(double n) {

        double temp = 0;
        for(double i = 1.0; i <= n; i += 0.1, temp *= -1)
        {
        temp = temp + i;

    }
        return temp;
    }

    public static void for_14(int n) {

        int temp = 0;
        for(int i = 1; i <= n; ++i)
        {
        temp += 2 * i - 1;
         System.out.print(temp);
        }
    }

    public static double for_15(double a, int n) {

        double temp = 1;
        for(int i = 1; i <= n; ++i)
        {
        temp *=a;
        }
        return temp;
    }

    public static void for_16(double a, int n) {

        double temp = 1;
        for(int i = 0; i != n; ++i)
        {
        temp *= a;
        System.out.print(temp);
        }
    }

    public static int for_17(double a, int n) {

        int temp = 0;
        for(int i = 0; i != n; ++i)
        {
        temp += Math.pow(a,i);
        }
        return temp;
    }

    public static double for_18(double a, int n) {

        double temp = 0;
        for(int i = 0; i != n; ++i, temp *= -1)
        {
        temp += Math.pow(a,i);
        }
        return temp;
    }

    public static double for_19(double value) {

        double temp = 1;
        for(int i = 2; i <= value; ++i)
        {
        temp *= i;
        }
        return temp;
    }

    public static double for_20(double value) {

        double temp = 1;
        for(int i = 2; i <= value; ++i)
        {
        temp += temp * i;
        }
        return temp;
    }

	public static double for_21(double n) {

		double temp = 1;
		double temp1 = 1;
		double temp3 = 0;
		for(double i = 0; i < n - 1; ++i, ++temp1)
		{
			temp += temp * temp1;
			temp3 += 1 / temp;
		}
		return temp3;
	}

	public static double for_22(double n, double x) {

		double temp = 1;
		double temp1 = 1;
		double temp3 = 0;
		for(double i = 1; i < n - 1; ++i, ++temp1)
		{
			temp += temp * temp1;
			temp3 += Math.pow(x, i) / temp;
		}
		return temp3;
	}

    public static double for_23(double x, double n) {

        double temp = 1;
        double temp1 = 1;
        double temp2 = 1;
        double temp3 = x;
        for(int j = 0; j < n; ++j, ++temp1)
        {
        temp += temp * temp1;
        }
        for(double i = 3;  i < n; i += 2, temp2 *= -1)
        {
        temp3 += Math.pow(x, i) / temp * temp2;
        }
        return temp3;
    }

    public static double for_24(double x, double n) {
		double temp = 1;
		double temp1 = 1;
		double temp2 = 1;
		double temp3 = 1;
		for(int j = 0; j < n; ++j, ++temp1)
		{
			temp += temp * temp1;
		}
		for(double i = 2;  i < n; i += 2, temp2 *= -1)
		{
			temp3 += Math.pow(x, i) / temp * temp2;
		}
		return temp3;
	}
    public static double for_25(double x, double n) {

        double temp = x;
        for(int i = 2; i <= n; ++i, temp *= -1)
        {
        temp += Math.pow(x, i) / i;
        }
        return temp;
    }

    public static double for_26(double x, double n) {

        double temp  = x;
        for(int i = 3; i <= n; i += 2, temp *= -1)
        {
        temp += Math.pow(x, i) / i;
        }
        return temp;
     }

    public static double for_27(double x, double n) {

        double temp = x;
        for(int i = 3; i <= n; ++i)
        {
        temp += (2 * i -1) * Math.pow(x, 2 * i -1) / (2 * i + 1);
        }
         return temp;
    }

    public static double for_28(double x, double n) {

        double temp = 1;
        for(int i = 1; i <= n; ++i)
        {
        temp += Math.pow(-1, i) * (2 * i - 3) * Math.pow(x, i) / (2 * i);
        }
        return temp;
    }

    public static void for_29 (double a, double h, int n) {

        for(int i = 0; i <= n; ++i)
        {
        System.out.print(a+i*h);
        }
    }

	public static void for_30 (double a, double h, int n) {

		for(int i = 0; i <= n; ++i)
		{
			System.out.print(1-Math.sin(a+i*h));
		}
	}
    public static void for_31(int n) {

        int a = 2;
        for(int i = 1; i <= n; ++i)
        {
        a = 2 + 1 / a - 1;
        System.out.print(a);
        }
    }


    public static void for_32(double k) {

        double temp0 = 1;
        double temp1 = 2;
        for(int i = 0; i < k; ++i)
        {
        temp1 = temp1 - temp0;
        temp1 = (temp1 + 1) / k;
        System.out.print(temp1);
        ++temp0;
        }
    }

    public static void for_33(int value) {

        int temp1 = 0;
        int temp2 = 1;
        for(int i = 2; i <= value; ++i)
        {
        temp1 += temp2;
        temp2 = temp1 - temp2;
        System.out.print(temp2);
        }
    }

    public static double for_34(int k) {

        double a1 = 1;
        double a2 = 2;
        double a = 0;
        for(int i = 0; i < k; ++i)
        {
        a1 = a1 + a2;
        a = (a1 + 2 * a2)/3;
        }
        return a;
    }

	public static double for_35(int k) {

		double a1 = 1;
		double a2 = 2;
		double a3 = 3;
		double a = 0;
		for(int i = 0; i < k; ++i)
		{
			a1 = a1 + a2;
			a = a1 +  a2 - 2 * a3;
		}
		return a;
	}

	public static double for_36(double n, double k) {

        double temp = 0;
        for(int i = 1; i <= n; ++i)
        {
        temp += Math.pow(i, k);
        }
        return temp;
    }

    public static double for_37(double n) {

        double temp = 0;
        for(int i = 1; i <= n; ++i)
        {
        temp += Math.pow(i, i);
     }
        return temp;
    }

    public static double for_38(double n, double k) {

        double temp = 0;
        for(int i = 1; i <= n; ++i, --k)
        {
        temp += Math.pow(n, k);
        }
        return temp;
    }

    public static void for_39(int n) {

        for(int i = 1; i <= n; ++i)
        {
        for(int j = 1; j <= i; ++j)
        {
        System.out.print(i);
        }
        }
    }

    public static void for_40(int a, int b) {

        for(int i = a; i < b; ++i)
        {
        for(int j = 1; j < i; ++j)
        {
        System.out.print(i);
        }
        }
    }
    public static void main(String[] args) {
        for_1(1,4);
        for_2(2,5);
        for_3(11,6);
        for_4(8);
        for_5(6);
        for_6(2);
        System.out.println(for_7(14,4));
		System.out.println(for_8(16,2));
		System.out.println(for_9(14,4));
		System.out.println(for_10(6));
		System.out.println(for_11(3));
		System.out.println(for_12(5));
		System.out.println(for_13(4));
        for_14(2);
		System.out.println(for_15(12,3));
		for_16(14,4);
		System.out.println(for_17(1,4));
		System.out.println(for_18(2,4));
		System.out.println(for_19(33));
		System.out.println(for_20(7));
		System.out.println(for_21(7));
		System.out.println(for_22(7.6,7.7));
		System.out.println(for_23(2.5,2.2));
		System.out.println(for_24(77.7,66.6));
		System.out.println(for_25(23.3,24.5));
		System.out.println(for_26(27.1,27.7));
        System.out.println(for_27(78.7,88.14));
        System.out.println(for_28(2.88,14.88));
        for_29(1,4,6);
        for_30(2,5,4);
        for_31(10);
        for_32(2);
		for_33(7);
		System.out.println(for_34(7));
		System.out.println(for_35(15));
		System.out.println(for_36(13.5,15.5));
		System.out.println(for_37(9));
        for_39(2);
        for_40(1488,228);


    }
}
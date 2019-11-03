import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int Series1(){
        int sum = 0;
        int num;
        final Random random = new Random();
        random.nextInt(100);
        for (int i = 1; i <= 10; ++i){
            num = random.nextInt(100);
            sum += num;
        }
        return sum;
    }

    public static int Series2(){
        int rez = 0;
        int num;
        final Random random = new Random();
        random.nextInt(100);
        for (int i = 1; i <= 10; ++i){
            num = random.nextInt(20);
            rez *= num;
        }
        return rez;
    }

    public static int Series3(){
        int rez = 0;
        int num;
        final Random random = new Random();
        random.nextInt(100);
        for (int i = 1; i <= 10; ++i){
            num = random.nextInt(20);
            rez += num;
        }
        return rez/10;
    }

    public static void Series4(int n){
        int sum = 0;
        int mul = 1;
        double num;
        final Random random = new Random();
        for (int i = 1; i <= n; ++i){
            num = random.nextInt();
            sum += num;
            mul *= num;
        }
        System.out.print("Сумма: " + sum + " ");
        System.out.println("Произведение: " + mul);
    }

    public static void Series5(int n){
        double  num;
        int sum = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  1.0 + (10.0 - 1.0) * random.nextDouble();
            System.out.print(((double)((int)num))+ " ");
            sum += (int)num;
        }
        System.out.println();
        System.out.println("Сумма: " + sum);
    }

    public static void Series6(int n){
        double  num;
        int sum = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  1.0 + (10.0 - 1.0) * random.nextDouble();
            System.out.print((num -(double)((int)num))+ " ");
            sum *= num -(double)((int)num);
        }
        System.out.println();
        System.out.println("Произведение: " + sum);
    }

    public static void Series7(int n){
        double num;
        int sum = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  1.0 + (10.0 - 1.0) * random.nextDouble();
            System.out.print(Math.round(num) + " ");
            sum += Math.round(num);
        }
        System.out.println();
        System.out.println("Сумма: " + sum);
    }

    public static void Series8(int n){
        int num;
        int k = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
           if(num %2 == 0){
               k++;
               System.out.print(num + " ");
           }
        }
        System.out.println();
        System.out.println("Количество: " + k);
    }

    public static void Series9(int n){
        int num;
        int k = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num %2 != 0){
                k++;
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Количество: " + k);
    }

    public static boolean Series10(int n){
        boolean positive = false;
        int num;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num > 0){
                positive = true;
            }
        }
        return positive;
    }
    public static boolean Series11(int n, int k){
        boolean positive = false;
        int num;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num < k){
                positive = true;
            }
        }
        return positive;
    }

    public static int Series12(int n, int k){
        int num;
        int counter = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(10);
            counter++;
            if(num == 0 ){
                return counter;
            }
        }
        return counter;
    }

    public static int Series13(int n){
        int num;
        int sum = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            if(num > 0 ){
                sum += num;
            }
            else{
                return sum;
            }
        }
        return sum;
    }

    public static int Series14(int n, int k){
        int num;
        int counter = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            if(num < k ){
                counter ++;
            }
            if(num == 0){
                return counter;
            }
        }
        return counter;
    }

    public static int Series15(int n, int k){
        int num;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            if(num > k ){
                return num;
            }
            if(num == 0){
                return 0;
            }
        }
        return 0;
    }

    public static int Series16(int n, int k){
        int num;
        int temp = 0;
        final Random random = new Random();
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            if(num > k ){
                temp = num ;
            }
            if(num == 0){
                return temp;
            }
        }
        return temp;
    }

    public static int[] generateIntIncreasingRandoms(int amount, int max) {
        int[] randomNumbers = new int[amount];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(max);
        }
        Arrays.sort(randomNumbers);
        return randomNumbers;
    }

    public static double[] generateDoubleIncreasingRandoms(int amount, double max) {
        double[] randomNumbers = new double[amount];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = 1.0 + (max - 1.0) * random.nextDouble();
        }
        Arrays.sort(randomNumbers);
        return randomNumbers;
    }
    public static void Series17(int n, int b){
        double[] randomNumbers;
        randomNumbers = generateDoubleIncreasingRandoms(n,10.0);

        boolean used = false;
        for (int i = 0; i < n; i++) {
            if (b <= randomNumbers[i] && !used)
            {
                System.out.print(b + " ");
                used = true;
            }
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
    }

    public static void Series18(int n, int b){
        double[] randomNumbers;
        randomNumbers = generateDoubleIncreasingRandoms(n, 10.0);

        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && randomNumbers[i - 1] != randomNumbers[i]) ;
            {
                System.out.print(randomNumbers[i]);
            }
        }
    }

    public static void Series19(int n){
        final Random random = new Random();
        int num;
        int temp = 0;
        int k = 0;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num < temp ){
                System.out.print(num + " ");
            }
            temp = num;
            k++;
        }
        System.out.println();
        System.out.println("Количество: " + k);
    }

    public static void Series20(int n){
        final Random random = new Random();
        int num;
        int temp = Integer.MAX_VALUE;
        int k = 0;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num > temp ){
                System.out.print(num + " ");
                k++;
            }
            temp = num;

        }
        System.out.println();
        System.out.println("Количество: " + k);
    }

    public static boolean Series21(int n){
        final Random random = new Random();
        int num;
        int temp = 0;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num < temp ){
                return false;
            }
            temp = num;
        }
        return true;
    }

    public static void Series22(int n){
        final Random random = new Random();
        int num;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(100);
            if(num > temp ){
                System.out.println("Номер нарушающего: " + num);
            }
            temp = num;
        }
        System.out.println(0);
    }

    public static boolean Series23(int n)
    {
        double[] mas;
        mas = generateDoubleIncreasingRandoms(n, 10.0);
        boolean checker = true;

        int index = 1;
        while ((index < n - 1) && (checker))
        {
            checker = (((mas[index] < mas[index - 1]) && (mas[index] < mas[index + 1])) ||
                    ((mas[index] > mas[index - 1]) && (mas[index] > mas[index + 1])));
            if (checker)
                index++;
        }
        return checker;
    }

    public static int Series24(int n)
    {
        final Random random = new Random();
        int temp = 0;
        int sum = 0;
        int num;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            temp += num;
            if (num == 0){
                sum = temp;
                temp = 0;
            }
        }
        return sum;
    }

    public static int Series25(int n)
    {
        final Random random = new Random();
        int temp = 0;
        int sum = 0;
        int num;
        boolean f = false;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            temp += num;
            if (num == 0){
                if (f) sum+=temp;
                else f = true;
                temp = 0;
            }
        }
        return sum;
    }

    public static void Series26(int k, int n)
    {
        final Random random = new Random();
        int num;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            for (int j = 0, pow = 1; j <= k; ++j) {
            pow *= num;
            System.out.print(pow + " ");
            }
        }
    }

    public static void Series27(int n)
    {
        final Random random = new Random();
        int num;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            for (int j = 0, pow = 1; j <= i; ++j) {
                pow *= num;
                System.out.print(pow + " ");
            }
        }
    }

    public static void Series28(int n)
    {
        final Random random = new Random();
        int num;
        for (int i = 0; i <= n; ++i){
            num =  random.nextInt(5);
            for (int j = 0, pow = 1; j <= n - i + 1; ++j) {
                pow *= num;
                System.out.print(pow + " ");
            }
        }
        System.out.println();
    }

    public static int Series29(int n, int k)
    {
        final Random random = new Random();
        int num;
        int sum = 0;
        for (int i = 0; i <= k; ++i){
            for (int j = 0; j <= n; ++j){
                num =  random.nextInt(5);
                sum += num;
            }
        }
        return sum;
    }

    public static void Series30(int n, int k)
    {
        final Random random = new Random();
        int num;
        int sum = 0;
        for (int i = 0; i <= k; ++i, sum = 0){
            for (int j = 0; j <= n; ++j){
                num =  random.nextInt(5);
                sum += num;
                System.out.print( sum + " ");
            }
        }
    }

    public static void Series31(int n, int k)
    {
        final Random random = new Random();
        int num;
        int f = 0;
        int counter = 0;
        for (int i = 0; i <= k; ++i, f = 0){
            for (int j = 0; j <= n; ++j){
                num =  random.nextInt(5);
                if(num == 2) f = 1;
            }
            counter += f;
        }
        System.out.println(counter);
    }

    public static void Series32(int n, int k)
    {
        final Random random = new Random();
        int num;
        int f = 0;
        for (int i = 0; i <= k; ++i, f = 0){
            for (int j = 0; j <= n; ++j){
                num =  random.nextInt(5);
                if ((num == 2)&&(f == 0)) f = j;
            }
            System.out.println(f);
        }
    }

    public static void Series33(int n, int k)
    {
        final Random random = new Random();
        int num;
        int f = 0;
        for (int i = 0; i <= k; ++i, f = 0){
            for (int j = 0; j <= n; ++j){
                num =  random.nextInt(5);
                if(num == 2) f = j;
            }
            System.out.println(f);
        }
    }

    public static void Series34(int n, int k)
    {
        final Random random = new Random();
        int num;
        int sum = 0;
        boolean f = false;
        for (int i = 0; i <= k; ++i, f = false, sum = 0){
            for (int j = 0; j <= n; ++j){
                num =  random.nextInt(5);
                sum += num;
                if ((num == 2)&&(f == false)) f = true;
            }
            System.out.println(f ? sum:0 );
        }
    }

    public static void Series35(int k)
    {
        final Random random = new Random();
        int num = 1;
        int sum = 0;
        int temp = -1;
        for (int i = 0; i <= k; ++i, temp =- 1){
            while(num != 0){
                num = random.nextInt(5);
                ++temp;
            }
            System.out.print(temp + " ");
            sum += temp;
        }
        System.out.println("Общее количество: " + sum);
    }

    public static void Series36(int k)
    {
        final Random random = new Random();
        int num = 1;
        int sum = 0;
        int temp = -1;
        for (int i = 0; i <= k; ++i){
            while(num != 0){
                num = random.nextInt(5);
                ++temp;
            }
            System.out.print(temp + " ");
            sum += temp;
        }
        System.out.println("Общее количество: " + sum);
    }

    public static int Series37(int k)
    {
        final Random random = new Random();
        int num = 1;
        int counter = 0;
        int temp = 0;
        for (int i = 0; i <= k; ++i) {
            num = random.nextInt(5);
            boolean checkup = true;
            boolean checkdown = true;
            while (num != 0) {
                temp = num;
                num = random.nextInt(5);
                if ((temp >= num) && (num != 0)) checkup = false;
                if ((temp <= num) && (num != 0)) checkdown = false;
            }
            if (checkup != checkdown) {
                counter += 1;
            }
        }
        return counter;
    }
    public static void Series38(int k)
    {
        final Random random = new Random();
        int num = 1;
        int counter = 0;
        int temp = 0;
        for (int i = 0; i <= k; ++i) {
            num = random.nextInt(5);
            boolean checkup = true;
            boolean checkdown = true;
            while (num != 0) {
                temp = num;
                num = random.nextInt(5);
                if ((temp >= num) && (num != 0)) checkup = false;
                if ((temp <= num) && (num != 0)) checkdown = false;
            }
            if (checkup&checkdown)  System.out.println(0);
            else if  (checkup) System.out.println(1);
            else if  (checkdown) System.out.println(-1);
            else {
                System.out.println(0);
            }
        }
    }
    public static int Series39(int k)
    {
        final Random random = new Random();
        int num = 1;
        int counter = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i <= k; ++i) {
            num = random.nextInt(5);
            temp1 = random.nextInt(5);
            boolean check = true;
            while (num != 0) {
                temp2 = temp1;
                temp1 = num;
                num = random.nextInt(5);
                if (!(((temp2 < temp1) && (temp1 > num)) || ((temp2 > temp1) && (temp1 < num))) && (num != 0)){
                    check = false;
                }
            }
            if (check){
                counter += 1;
            }
        }
        return counter;
    }
    public static void Series40(int k)
    {
        final Random random = new Random();
        int num = 1;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i <= k; ++i) {
            num = random.nextInt(5);
            temp1 = random.nextInt(5);
            boolean check = true;
            int counter = 1;
            while (num != 0) {
                temp2 = temp1;
                temp1 = num;
                num = random.nextInt(5);
                if (check){
                    counter += 1;
                    if (!(((temp2 < temp1) && (temp1 > num)) || ((temp2 > temp1) && (temp1 < num))) && (num != 0)){
                        check = false;
                    }
                }
            }
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        System.out.println(Series1());
        System.out.println(Series2());
        System.out.println(Series3());
        Series4(10);
        Series5(10);
        Series6(10);
        Series7(10);
        Series8(10);
        Series9(10);
        Series10(10);
        System.out.println(Series11(10 ,    4));
        System.out.println(Series12(10,4));
        System.out.println(Series13(10));
        System.out.println(Series14(10 ,4));
        System.out.println(Series15(10,5));
        System.out.println(Series16(10,5));
        Series17(10, 6);
        Series18(10,7);

    }
}

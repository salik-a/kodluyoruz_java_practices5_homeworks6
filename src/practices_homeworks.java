/**
 * @author salika
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class practices_homeworks {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }
    public static void display(int[][] matrix) {

        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println();
        System.out.println("---------------------------Practice1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Harmonic Average Calculator--------------------------------");
        System.out.println();


        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += (1/(double)(numbers[i]));
        }
        double result = (double)(numbers.length)/sum;
        System.out.println(result);





        /*


        System.out.println();
        System.out.println("---------------------------Practice2--------------------------------");
        System.out.println();
        System.out.println("---------------------------Program to Find Nearest Numbers to Entered Number--------------------------------");
        System.out.println();

        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);

        System.out.println("Enter number: ");
        int b= scan.nextInt();
        int small=0,big=0;

        for (int i = 0; i < list.length; i++) {
           if(list[i]<b)
               small=list[i];
        }
        for (int i = list.length-1; i >=0;  i--) {

            if(b<list[i])
                big=list[i];
        }

        System.out.println("The nearest number smaller than the entered number: " + small);
        System.out.println("The nearest number greater than the entered number: " + big);



         */
        /*
        System.out.println();
        System.out.println("---------------------------Practice3--------------------------------");
        System.out.println();
        System.out.println("---------------------------Program to Find Repeating Numbers in a Sequence--------------------------------");
        System.out.println();

        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }


         */
        /*


        System.out.println();
        System.out.println("---------------------------Practice4--------------------------------");
        System.out.println();
        System.out.println("---------------------------Program to Find Repeating Numbers in a Sequence--------------------------------");
        System.out.println();

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }

         */


        /*
        System.out.println();
        System.out.println("---------------------------Homework1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Sorting Array Numbers --------------------------------");
        System.out.println();

        System.out.println("Enter array size: ");
        int s= scan.nextInt();
        int[] arr = new int[s];
        for (int i=0; i<s;i++){
            System.out.print((i+1)+". element: ");
            arr[i]=scan.nextInt();
        }
        System.out.println("Array elements after sorting:");

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }



         */

        /*
        System.out.println();
        System.out.println("---------------------------Homework2--------------------------------");
        System.out.println();
        System.out.println("---------------------------Program to Find Repeating Numbers in a Sequence--------------------------------");
        System.out.println();

        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.print("Dizi : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        int count=0;

        Arrays.sort(arr); // Dizideki elemanları küçükten büyüğe sırala

        for(int i=0; i<arr.length; i++)
        {
            count=0;
            for (int j=0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;

                }
            }


            if(i==0 && arr[i+1]==arr[i])
            {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", arr[i], count));
            }

            if(i==0 && arr[i+1]!=arr[i])
            {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", arr[i], count));
            }


            if(i!=0 && arr[i-1]!=arr[i])
            {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", arr[i], count));
            }

        }



         */
        /*
        System.out.println();
        System.out.println("---------------------------Homework3--------------------------------");
        System.out.println();
        System.out.println("---------------------------Creating Methods by Pattern--------------------------------");
        System.out.println();

        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };

        System.out.println("The  matrix is: ");
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("The Transpoze matrix is: ");
        display(transpose);


         */

        /*
        System.out.println();
        System.out.println("---------------------------Practice5--------------------------------");
        System.out.println();
        System.out.println("---------------------------Number Guessing Game--------------------------------");
        System.out.println();

        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
        System.out.println("Gizli sayı : " + number);


         */
        /*
        System.out.println();
        System.out.println("---------------------------Practice5--------------------------------");
        System.out.println();
        System.out.println("---------------------------Find Palindromic Words--------------------------------");
        System.out.println();

        System.out.println(isPalindrome("abba"));



         */

    }
}

package array;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //점수를 4개 입력받기 배열 arr
        Scanner scanner = new Scanner(System.in);
        //배열 선언
        int[] arr = new int[4];
        System.out.println(" 점수 4개를 입력하세요 >> ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        //출력 for
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] );
            if( i < arr.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        //점수를 4개 입력받기 배열 arr
        Scanner Scanner = new Scanner(System.in);
        //배열 선언
        int[] Arr = new int[4];
        int sum = 0;
        double avg = 0.0;

        System.out.println(" 점수 4개를 입력하세요 >> ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        //출력 for
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            System.out.print(arr[i] );
            if( i < arr.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        avg  = (double) sum/arr.length;
        System.out.println("총점 : " + sum );
        System.out.println("평균 : " + avg );




    }
}
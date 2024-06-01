package loop;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0, sum = 0;
        System.out.print("정수 : ");
        max = scanner.nextInt();
        for( int i = 0 ; i <= max ; i++ ) {
            if( i % 2 == 0 ) {
                sum += i ;
            }
        }//end for
        System.out.println("총 짝수의 합은 : " +  sum );
    }
}

/*
정수 입력 받아서 해당 값까지 반복 짝수의 합계을 구하시오
for , if
 */

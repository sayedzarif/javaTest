package loop;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("정수값 입력 : ");
        num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("입력한 정수 :" + num + " 짝수");
        } else {
            System.out.println("입력한 정수 :" + num + " 홀수");
        }
    }
}
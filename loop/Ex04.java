package loop;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //정수 num1, num2 , 연산자선택 num3
        //결과 reuslt , op = + - * ..
        int num1=0, num2 = 0, num3 =0, result = 0;
        String op="";
        System.out.println("계산기 만들기");
        System.out.println("======================");

//    while( true ) {
        System.out.print("첫번째 정수 : ");
        num1 = scanner.nextInt();
        System.out.print("두번째 정수 : ");
        num2 = scanner.nextInt();
        System.out.println("-----------------------");
        System.out.print("연산자선택 0(종료) 1(+) 2(-) 3(*) 4(/) 5(%) ");
        num3 = scanner.nextInt();

        switch ( num3 ) {
            case 1:
                result = num1 + num2 ;
                op ="+";
                break;
            case 2:
                result = num1 - num2 ;
                op ="-";
                break;
            case 3:
                result = num1 * num2 ;
                op ="X";
                break;
            case 4:
                result = num1 / num2 ;
                op ="/";
                break;
            case 5:
                result = num1 % num2 ;
                op ="%";
                break;
            default:
                System.out.println("형식이 잘못");
        }
        System.out.println(num1 + op +num2 +"="+ result  );

//    }
    }
}

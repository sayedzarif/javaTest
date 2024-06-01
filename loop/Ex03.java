package loop;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name , hak ;
        int kor, eng, mat, age , total, avg ;

        System.out.print("이름 :");
        name = scanner.nextLine();
        System.out.print("나이 :");
        age = scanner.nextInt();
        System.out.print("국어 :");
        kor  = scanner.nextInt();
        System.out.print("영어 :");
        eng  = scanner.nextInt();
        System.out.print("수학 :");
        mat  = scanner.nextInt();

        total = kor + mat + eng ;
        avg  = total/3;
        System.out.println("평균점수 :" + avg );

        // 다중if문
        if( avg >= 90 ) {
            hak ="A";
        }else if( avg >= 80 ) {
            hak ="B";
        }else if( avg >= 70 ){
            hak ="C";
        }else if(avg >= 60) {
            hak ="D";
        }else {
            hak = "F";
        }

        System.out.println(name+"님의 나이는"+age+"살 이고");
        System.out.println("총점은 "+ total+"이며 평균은"+avg +"이고 학점은 "+ hak +"입니다.");

    }// end main

    }


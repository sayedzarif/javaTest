package array;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 국, 영, 수
        //[인원수][과목]
        int[][] scores = new int[4][3];
        //과목 타이틀
        String[] subject = {"국어","영어","수학"};
        int total = 0;
        double avg = 0.0;

        // 점수 입력
        for(int i = 0; i< 4 ; i++ ) {
            System.out.println((i+1)+"번 학생 입력");
            for(int j = 0 ; j < 3 ; j++ ) {
                //과목
                System.out.print( subject[j] +"점수입력 >>" );
                scores[i][j] = scanner.nextInt();
            }
        }//end i

        //반복문 출력
        System.out.println();
        System.out.println("국어\t영어\t수학");
        for( int i = 0 ;  i < scores.length ; i++ ) {
            for( int j = 0 ; j < scores[i].length ; j++ ) {
                System.out.print(scores[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < scores.length; i++){
            total = 0;
            for (int j = 0; j < scores[i].length; j++){
                total += scores[i][j];
            }
            avg = (double) total/3.0;
            System.out.println((i+i)+ "Student Ssore" + total + "Average" + avg);
            System.out.println();
        }
    }
}

/*
인원수의 외부(키보드) 입력
국어, 영어, 수학 : 입력받기
[인원수][국영수점수]
조회(출력)
전체합계:xx
전체평균:xx
 */
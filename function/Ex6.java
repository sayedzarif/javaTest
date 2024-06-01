package function;

import java.util.Scanner;

public class Ex6 {

    public static boolean checkStr(String text, String str) {
        // 단어가 포함되어 있는지 여부 , 영문은 대소문자 구별
        return text.toLowerCase().contains( str.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String chk =  checkStr("Hello Java",txt ) ? "찾음":"못찾음";
//      String chk =  checkStr("Hello Java","java") ? "찾음":"못찾음";
        //if  true 단어 찾음 , 단어를 찾을 없음
        System.out.println(chk);
    }
}



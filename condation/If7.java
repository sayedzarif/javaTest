package condation;

public class If7 {
    public static void main(String[] args) {
        //
        int age = 16;
        String addr = "인천";
        if (age >= 16 && addr.equals("인천")) {
            System.out.println("가입가능");
        }
        int num = 4;
        if( num == 1 ) {
            System.out.println("운동화");
        }else if( num == 3 ) {
            System.out.println("화장품");
        }else if( num == 5 ) {
            System.out.println("구두");
        }else if( num == 9 ) {
            System.out.println("상품권");
        }else {
            System.out.println("꽝 다음기회에");
        }

        }
}

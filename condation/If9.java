package condation;

public class If9 {
    public static void main(String[] args) {
        int age = 25;
        String result ;

        if( age <= 7) {
            result = "미취학";
        }else if( age >= 8 && age <= 13) {
            result = "초등학생";
        }else if( age >= 14 && age <= 16) {
            result = "중학생";
        }else if( age >= 17 && age <= 19) {
            result = "고등학생";
        }else if( age >= 20) {
            result = "성인";
            System.out.println("결과:" + result );
        }

    }
}

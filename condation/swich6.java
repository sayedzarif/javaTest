package condation;

public class swich6 {
    public static void main(String[] args) {
        int x = 3;
        String reuslt = switch (x) {
            case 1 -> "운동화";
            case 3, 4 -> "화장품";
            case 5 -> "구두";
            case 9 -> "상품권";
            default ->  "꽝";
        };
        System.out.println( reuslt );
    }
}

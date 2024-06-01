public class swich1 {
    public static void main(String[] args) {
        int x = 5;
        String result = ""; // "" , null
        switch ( x ) {
            case 1 : result = "운동화" ; break;
            case 3 : result = "화장품" ; break;
            case 5 : result = "구두" ; break ;
            case 9 : result = "상품권" ; break;
            default: result ="꽝 다음기회에";
        }
        System.out.println( result );
    }
}

package loop;

public class for03 {
    public static void main(String[] args) {
        int hap = 0;
        for( int i = 0 ; i<=10 ; i++ ){
            hap += i;  // hap = hap + i ;
            //System.out.println("i = " + i + "hap =" + hap );
        }
        System.out.println("0 ~ 10 합 : " + hap );
    }
}

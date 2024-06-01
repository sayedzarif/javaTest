package function;

// 재귀함수 -> 자기자신을 호출하는 방식
//
public class Ex13 {

    public static void make(int num) {
        System.out.println( num );
        if( num < 10 ) {
            make(++num); //자신의 메서드내에서 자신을 다시 호출
        }else {
            System.out.println("==end==");

        }
    }

    public static void main(String[] args) {
        make(5);
    }
}

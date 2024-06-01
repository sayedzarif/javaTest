package function;

// 메서드 return 반환값
public class Ex5 {
    public static int sum(int x, int y) {
        return x + y ;
    }
    public static int sub(int x, int y) {
        return x - y ;
    }

    static int mul(int x, int y) {
        return x * y ;
    }

    public static void main(String[] args) {
        int num1 = sum(10,20);
        System.out.println("두수의 합 : " + num1 );

        int num2 = sub(10,20);
        System.out.println("두수의 차 : " + num2 );

        int num3 = mul(10,20);
        System.out.println("두수의 곱 : " + num3 );


    }
}


/*
  public static 반환타입 함수명(매개변수, 매개변수) {
      return 값;
  }
  함수명( 값, 값 ) => 값을 반환한다 ( 값을 받는다 )
  반환타입 변수 = 함수명( 값, 값 ) => 값을 반환한다 ( 값을 받는다 )

 */
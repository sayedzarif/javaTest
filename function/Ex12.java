package function;

public class Ex12 {

    public static String make(String name, int age, String...strs) {
        String result = "이름:"+name+"나이:"+age+"좋아하는것:"+String.join(", " , strs );
        return result;
    }

    public static void main(String[] args) {
        String str1 = make("홍길동", 20, "라면","우동","김밥","치즈");
        System.out.println( str1 );
        String str2 = make("김고은", 22, "수영","헬스","걷기");
        System.out.println( str2 );
    }
}


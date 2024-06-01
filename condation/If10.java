package condation;

public class If10 {
    public static void main(String[] args) {
        double rating = 9.3;
        String result = ( rating >= 9 ) ? "파묘 추천":( rating >= 8 ) ? "아쿠아맨 추천" : ( rating >= 7 ) ? "범죄도시 추천" : "아무거나 추천";
        System.out.println( result );
    }
}

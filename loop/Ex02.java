package loop;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식이름 :");
        String foodName = scanner.nextLine();
        System.out.print("음식가격 :");
        int foodPrice = scanner.nextInt();
        System.out.print("음식수량  :");
        int foodQuantity = scanner.nextInt();

        int total = foodPrice * foodQuantity;
        System.out.println("주문이름 : " +  foodName);
        System.out.println("주문수량 : " + foodQuantity +"개" );
        System.out.println("주문 총금액 : " +total +"원");

    }
}

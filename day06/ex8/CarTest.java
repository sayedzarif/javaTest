
package day06.ex08;

public class CarTest {
    public static void main(String[] args) {
        day06.ex08.Car car1 = new day06.ex08.Car();
        car1.display();

        day06.ex08.Car car2 = new day06.ex08.Car("테슬라");
        car2.display();

        day06.ex08.Car car3 = new day06.ex08.Car("테슬라" ,"green");
        car3.display();

        day06.ex08.Car car4 = new day06.ex08.Car("테슬라" ,"green" , 100);
        car4.display();

    }
}




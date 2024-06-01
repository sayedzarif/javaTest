package day06.ex04;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name="Buddy";
        dog.age = 5;
        dog.address ="인천";
        dog.favFood ="개껌";

        Animal cat = new Animal();
        cat.name = "고양이";
        cat.age = 3;
        cat.address ="경기";
        cat.favFood ="사료";

        Animal[] animal = new Animal[]{dog, cat};

        for( Animal ani:animal) {
            System.out.println("-----------");
            System.out.println("이름 :" + ani.name);
            System.out.println("나이 :" + ani.age);
            System.out.println("주소 :" + ani.address);
            System.out.println("음식 :" + ani.favFood);
        }

    }
}


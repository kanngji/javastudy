package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();
        cow.sound();
    }
}

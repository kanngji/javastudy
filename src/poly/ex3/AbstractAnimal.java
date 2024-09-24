package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); // 위에도 abstract 넣어야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

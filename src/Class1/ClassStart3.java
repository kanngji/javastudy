package Class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 메모리에 넣는당 , 객체 생성
        student1.name = "학생1"; // 멤버 변수를 가자고 있다.
        student1.age = 19;
        student1.grade = 70;

        // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근 할 수 있는 참조값(주소)를 반환한다.

        Student student2;
        student2= new Student();
        student2.name = "학생2";
        student2.age= 15;
        student2.grade= 80;

        System.out.println(student1);
        System.out.println(student2);





        System.out.println("이름:"+ student1.name+"나이"+student1.age+"성적"+student1.grade);
        System.out.println("이름:"+ student2.name+"나이"+student2.age+"성적"+student2.grade);
    }
}

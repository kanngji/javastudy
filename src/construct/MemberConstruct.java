package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){ // 생성자 하나 더 생성 오버로딩
        this(name,age,50);
        //this.name = name;
        //this.age = age;
        //this.grade= 50;
    }

    MemberConstruct(String name, int age, int grade){ // 생성자 이름은 클래스이름과 같게 해야한다
        System.out.println("생성자 호출= "+name + ", age =" +age + ",grade = "+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

package Class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 메모리에 넣는당 , 객체 생성
        student1.name = "학생1"; // 멤버 변수를 가자고 있다.
        student1.age = 19;
        student1.grade = 70;

        student1.grade = 100;

        // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근 할 수 있는 참조값(주소)를 반환한다.

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age= 15;
        student2.grade= 80;

        Student [] students = new Student[] {student1, student2};



        for (int i = 0; i< students.length; i++){
            System.out.println("이름 "+students[i].name+"나이 "+students[i].age+"성적 "+students[i].grade);
        }

        for (int i = 0; i< students.length; i++){
            Student s = students[i];
            System.out.println("이름 "+s.name+"나이 "+s.age+"성적 "+s.grade);
        }
        for (Student s : students){
            System.out.println("이름 "+s.name+"나이 "+s.age+"성적 "+s.grade);
        }

        //System.out.println(student1);
        //System.out.println(student2);





        //System.out.println("이름:"+ students[0].name+"나이"+students[0].age+"성적"+students[0].grade);
        //System.out.println("이름:"+ students[1].name+"나이"+students[1].age+"성적"+students[1].grade);

        // 자바에서 대입은 변수에 있는 값을 복사해서 전달한다.
    }
}

package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit consturctInit1 = new ConstructInit(10);
        ConstructInit consturctInit2 = new ConstructInit(20);
        System.out.println(consturctInit1.value);
        System.out.println(consturctInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        // 이미 초기값이 들어가 버렸다.
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit1.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        System.out.println(Constant.PI);
    }
}

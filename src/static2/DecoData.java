package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        //instanceValue++; // 인스턴스 변수 접근 , 컴파일 에러
        //instanceMethod(); // 인스턴스 메서드 접근 , 컴파일 에러

        staticValue++; // ㅈㅓㅇ적 변수접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근
        //instanceMethod(); // 인스턴스 메서드 접근 ,

        staticValue++; // ㅈㅓㅇ적 변수접근
        staticMethod(); // 정적 메서드 접근
    }

    private void setInstanceMethod() {
        System.out.println("instaceValue="+instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue="+staticValue);

    }
}

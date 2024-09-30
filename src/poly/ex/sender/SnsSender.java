package poly.ex.sender;

public class SnsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SNS를 발송합니다: "+ message);
    }
}

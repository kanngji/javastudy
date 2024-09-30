package poly.ex.sender;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Facebook 메시지를 전송합니다: "+message);
    }
}

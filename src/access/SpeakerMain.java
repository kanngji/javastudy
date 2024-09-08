package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volumeUp();
        speaker.showVolume();
    }
}

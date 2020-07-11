package OOP_MOSH.Interfaces.MyTube;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("vinay@gmail.com"));

        var processor = new VideoProcessor(
            new XVideoEncoder(),
            new SqlVideoDatabase(),
            new EmailService()
        );
        processor.process(video);
    }
}

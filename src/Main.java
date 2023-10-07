public class Main {
    public static void main(String[] args) {

        System.out.println("- class Player:");
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.record();

        System.out.println("\n- class Recorder:");
        Recorder recorder = new Recorder();
        recorder.play();
        recorder.pause();
        recorder.stop();
        recorder.record();

    }
}
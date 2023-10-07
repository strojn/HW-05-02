public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("play from Playable");
    }

    @Override
    public void record() {
        System.out.println("record from Recordable");
    }

    @Override
    public void pause() {
        System.out.println("pause from Playable");
    }

    @Override
    public void stop() {
        System.out.println("stop from Playable");
    }
}

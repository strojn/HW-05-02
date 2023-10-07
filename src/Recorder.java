public class Recorder implements Recordable, Playable {
//    важлива послідовність імплементації в імплементуючтому класі
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
        System.out.println("pause from Recordable");
    }

    @Override
    public void stop() {
        System.out.println("stop from Recordable");
    }
}

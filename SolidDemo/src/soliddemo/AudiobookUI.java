package soliddemo;


public class AudiobookUI implements  AudioAction {

    @Override
    public void seeReviews() {
        System.out.println("Audio UI Reviews");
    }

    @Override
    public void listenSample() {
        System.out.println("Audio Sample Listen method");
    }
}

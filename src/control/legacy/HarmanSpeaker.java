package control.legacy;

import control.GenelecWoofer;
import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer;

    //HarmanSpeaker가 객체화 된다면 GenelecWoofer 를 사용할 수 있도록 해주세요.
    //HarmanSpeaker speaker = new HarmanSpeaker();

    public HarmanSpeaker() {
        this.woofer = new GenelecWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요.");
        woofer.baseSound();
    }
}

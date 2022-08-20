package structuralpatterns.adapter.exampletwo.adapter;

import structuralpatterns.adapter.exampletwo.typetwo.ThreePinSocket;
import structuralpatterns.adapter.exampletwo.typeone.TwoPinSocket;

public class SocketAdapter extends TwoPinSocket {

    private final ThreePinSocket threePinSocket;

    public SocketAdapter(final ThreePinSocket threePinSocket) {
        this.threePinSocket = threePinSocket;
    }

    @Override
    public void turnOn(){
        System.out.println("plugging in socket");
    }
}

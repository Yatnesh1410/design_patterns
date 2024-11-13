package Adaptor;

public class Iphone {

    private LighteningCharger appleCharger;

    public Iphone(LighteningCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargePhone(){
        appleCharger.chargeIPhone();
    }
}

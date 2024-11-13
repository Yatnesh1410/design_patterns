package Adaptor;

public class AppleCharger implements LighteningCharger {
    @Override
    public void chargeIPhone() {
        System.out.println("Iphone is being charged");
    }
}

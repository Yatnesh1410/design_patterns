package Adaptor;

public class AdapterCharger implements LighteningCharger{

    private CtypeCharger ctypeCharger;

    public AdapterCharger(CtypeCharger ctypeCharger) {
        this.ctypeCharger = ctypeCharger;
    }

    @Override
    public void chargeIPhone() {
        ctypeCharger.chargeAndroidPhone();
        System.out.println("Your iphone is charging via adapter.");
    }
}

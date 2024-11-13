package Adaptor;

public class Demo {
    public static void main(String[] args) {
        AdapterCharger charger = new AdapterCharger(new AndroidCharger());

        Iphone iphone = new Iphone(charger);

        iphone.chargePhone();
    }
}

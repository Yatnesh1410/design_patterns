package BuilderPattern.phone;

public class Shop {

    public static void main(String[] args){
        Phone phone = new Phone("Android", "Qualcomm", 5.5, 3000, 13);
        System.out.println(phone.toString());


        Phone phoneBuilder = new PhoneBuilder().setOs("Android").setBattery(3000).build();
        System.out.println(phoneBuilder);
    }
}

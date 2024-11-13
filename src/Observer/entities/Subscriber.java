package Observer.entities;

public class Subscriber implements Observer{
    private String name;

    public String getName() {
        return this.name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void getNotified(String videoTitle) {
        System.out.println("Hey " + this.name + " New video has been uploaded : " + videoTitle);
    }
}

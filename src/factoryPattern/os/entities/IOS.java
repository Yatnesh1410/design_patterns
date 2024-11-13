package factoryPattern.os.entities;

public class IOS implements OS{
    @Override
    public void giveSpecs() {
        System.out.println("Most secured OS");
    }
}

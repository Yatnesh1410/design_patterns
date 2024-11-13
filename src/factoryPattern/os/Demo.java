package factoryPattern.os;

import factoryPattern.os.entities.OS;
import factoryPattern.os.entities.OSType;
import factoryPattern.os.services.OSFactory;

public class Demo {
    public static void main(String[] args){
        OSFactory osFactory = new OSFactory();

        OS os1 = osFactory.getOS(OSType.OPEN);
        OS os2 = osFactory.getOS(OSType.SECURED);
        OS os3 = osFactory.getOS(OSType.OTHER);

        assert os1 != null;
        os1.giveSpecs();
        assert os2 != null;
        os2.giveSpecs();
        assert os3 != null;
        os3.giveSpecs();

    }
}

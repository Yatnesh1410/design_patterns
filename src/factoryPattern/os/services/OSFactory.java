package factoryPattern.os.services;

import factoryPattern.os.entities.*;

public class OSFactory {
    public OS getOS(OSType type){

        if(type == OSType.OPEN){
            return new Android();
        }

        else if(type == OSType.SECURED){
            return new IOS();
        }

        else if(type == OSType.OTHER){
            return new Windows();
        }

        else{
            return null;
        }
    }
}

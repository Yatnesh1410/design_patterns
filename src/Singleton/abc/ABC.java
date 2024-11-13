package Singleton.abc;

public class ABC {
    // private constructor
    private ABC(){

    }

    // variable
    private static ABC abc;

    // method to get the instance of class
    // Lazy initialization
    public static ABC  getInstance(){
        if(abc == null){
            synchronized (ABC.class){
                if(abc == null){
                    abc =new ABC();
                }
            }
        }

        return abc;
    }
}

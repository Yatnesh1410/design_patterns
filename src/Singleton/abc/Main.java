package Singleton.abc;

public class Main {
    public static void main(String[] args){
        ABC abc1 = ABC.getInstance();
        System.out.println(abc1.hashCode());

        ABC abc2 = ABC.getInstance();
        System.out.println(abc2.hashCode());
    }
}

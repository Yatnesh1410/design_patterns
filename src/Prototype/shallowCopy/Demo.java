package Prototype.shallowCopy;

// In this class nc1 is calling an expensive function that is loadData() and its getting executed but nc2 is not calling it but
// still has that data as it is cloned.
public class Demo {
    public static void main(String[] args) {
        NetworkConnection nc1 = new NetworkConnection();
        nc1.setId("1");
        try{
            nc1.loadData();
            System.out.println(nc1);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        try {
            NetworkConnection nc2 = (NetworkConnection) nc1.clone();
            nc2.setId("2");
            System.out.println(nc2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

package Prototype.deepCopy;

// In this class nc1 is calling an expensive function that is loadData() and its getting executed but nc2 is not calling it but
// still has that data as it is cloned.
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Server s1 = new Server();
        s1.setId("1");
        s1.loadData();

        try {
            Server s2 = (Server) s1.clone();
            s2.setId("2");

            System.out.println("Before Removal from s1" + s1);

            // removing some contents from impData
            s1.getImpData().remove(0);

            System.out.println("After Removal from s1" + s1);
            System.out.println(s2);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

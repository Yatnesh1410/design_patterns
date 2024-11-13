package Prototype.shallowCopy;

public class NetworkConnection implements Cloneable {

    public String id;
    public String impData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "id='" + id + '\'' +
                ", impData='" + impData + '\'' +
                '}';
    }

    public void loadData() throws InterruptedException {
        this.impData = "Very Imp data";
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

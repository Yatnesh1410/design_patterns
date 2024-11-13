package Prototype.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Server implements Cloneable {

    public String id;
    public List<String> impData = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getImpData() {
        return impData;
    }

    public void setImpData(List<String> impData) {
        this.impData = impData;
    }

    @Override
    public String toString() {
        return "Server{" +
                "id='" + id + '\'' +
                ", impData='" + impData + '\'' +
                '}';
    }

    public void loadData() throws InterruptedException {
        this.impData.add("abc");
        this.impData.add("xyz");
        this.impData.add("qwer");

        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Server s = new Server();
        s.setId(this.id);

        for(String temp : this.getImpData()){
            s.getImpData().add(temp);
        }

        return s;
    }
}

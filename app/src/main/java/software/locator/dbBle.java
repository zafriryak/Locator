package software.locator;

/**
 * Created by Zafrir on 12/20/2016.
 */

public class dbBle {

    private String mac;
    private String cordinate;

    public  dbBle(){

    }

    public dbBle(String mac,String cordinate){
        this.mac=mac;
        this.cordinate=cordinate;
    }

    public dbBle(dbBle d){
        mac=d.mac;
        cordinate=d.cordinate;
    }

    public String getMac()
    {
        return mac;
    }

    public String getCordinate()
    {
        return  cordinate;
    }

    public void setMac(String mac){
        this.mac=mac;
    }

    public void setCordinate(String cordinate){
        this.cordinate=cordinate;
    }

    public String toString(){
        return "mac: "+mac+"   cordinate: "+cordinate;
    }

}

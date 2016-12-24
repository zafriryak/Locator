package software.locator;

/**
 * Created by Zafrir on 12/20/2016.
 */

public class dbQR {
    private String key;
    private String cordinate;

    public  dbQR(){

    }

    public dbQR(String key,String cordinate){
        this.key=key;
        this.cordinate=cordinate;
    }

    public dbQR(dbQR d){
        key=d.key;
        cordinate=d.cordinate;
    }

    public String getKey()
    {
        return key;
    }

    public String getCordinate()
    {
        return  cordinate;
    }

    public void setKey(String key){
        this.key=key;
    }

    public void setCordinate(String cordinate){
        this.cordinate=cordinate;
    }

    public String toString(){
        return "key: "+key+"   cordinate: "+cordinate;
    }

}

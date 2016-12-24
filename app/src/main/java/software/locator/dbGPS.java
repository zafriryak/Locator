package software.locator;

/**
 * Created by Zafrir on 12/24/2016.
 */

public class dbGPS {

    private String name;
    private String cordinate;

    public  dbGPS(){

    }

    public dbGPS(String name,String cordinate){
        this.name=name;
        this.cordinate=cordinate;
    }

    public dbGPS(dbGPS d){
        name=d.name;
        cordinate=d.cordinate;
    }

    public String getName()
    {
        return name;
    }

    public String getCordinate()
    {
        return  cordinate;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCordinate(String cordinate){
        this.cordinate=cordinate;
    }

    public String toString(){
        return "name: "+name+"   cordinate: "+cordinate;
    }

}

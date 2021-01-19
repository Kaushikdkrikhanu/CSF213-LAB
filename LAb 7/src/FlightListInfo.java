import java.util.ArrayList;

public class FlightListInfo {
    private ArrayList<FlightInfo> list = new ArrayList<>();

    FlightListInfo(ArrayList<FlightInfo> list){
        this.list = list;
    }
    FlightListInfo(){

    }
    public void addFlightInfo(String fNo,String src, String dest, float Cost){
        FlightInfo info = new FlightInfo(fNo,src,dest,Cost);
        list.add(info);
    }

    public ArrayList<FlightInfo> getFlightsSrcDest(String src, String dest){
        ArrayList<FlightInfo> flightInfos  = new ArrayList<>();
        for(FlightInfo info: list){
            if(info.getSource().equals(src)&&info.getDestination().equals(dest)){
                flightInfos.add(info);
            }
        }
        return flightInfos;
    }
}

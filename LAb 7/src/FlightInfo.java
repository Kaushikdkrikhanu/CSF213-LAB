public class FlightInfo {
    private String flightNo;
    private String source;
    private String destination;
    private Float cost;

    FlightInfo(String flightNo,String source,String destination,float cost){
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }

    public String toString() {
        return flightNo + ' ' + source + ' ' + destination + ' ' + cost;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class FlightDestinationTester {
    public static void main(String[] args) {
        System.out.println("Pl. enter the flight No , src, dest and cost (flight no = “” to stop)");
        Scanner scanner = new Scanner(System.in);
        FlightListInfo flightListInfo = new FlightListInfo();
        while (scanner.hasNext()) {
            String x = scanner.nextLine();

            if(x.equals("\"\"")){
                break;
            }
            else {
                String[] y = x.split(" ");

                flightListInfo.addFlightInfo(y[0],y[1],y[2], Float.parseFloat(y[3]));
            }
            System.out.println("Pl. enter the flight No , src, dest and cost (flight no = “” to stop)");
        }
        System.out.println("Pl. enter the src, dest");
        String z = scanner.nextLine();
        String[] a = z.split(" ");
        ArrayList<FlightInfo> list = flightListInfo.getFlightsSrcDest(a[0],a[1]);
        for(FlightInfo flightInfo: list){
            System.out.println(flightInfo.toString());
        }
    }

}

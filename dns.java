import java.util.*;
import java.net.*;
public class dns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter domain name");
        String domain = sc.nextLine();
        try{
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            System.out.println("IP addresses for "+domain+" :");
            for(InetAddress i : addresses){
                System.out.println("-"+i.getHostAddress());
            }
        }catch(UnknownHostException e){
            System.out.println(e.getMessage( ));
        }
    }
}
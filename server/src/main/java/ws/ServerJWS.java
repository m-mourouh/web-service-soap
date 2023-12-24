package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        // 0.0.0.0 = any @IP
        String url = "http://0.0.0.0:8585/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service deployed on " + url);
    }
}

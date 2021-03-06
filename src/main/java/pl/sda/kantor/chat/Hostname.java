package pl.sda.kantor.chat;

import java.net.InetAddress;
import java.util.Map;

class Hostname {

    public static String getHostname() {
        try {
            Map<String, String> env = System.getenv();
            if (env.containsKey("COMPUTERNAME")) {
                return env.get("COMPUTERNAME");
            }
            if (env.containsKey("HOSTNAME")) {
                return env.get("HOSTNAME");
            }
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "unknown";
        }
    }
}
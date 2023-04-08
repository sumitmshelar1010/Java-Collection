package MainPackage.collection;

import java.util.Map;
import java.util.Properties;

public class PropertyClassMethod {
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("name","Sumit Shelar");
        p.setProperty("email","smshelar@1010gmail.com");
        p.setProperty("address","jalgaon");
        p.setProperty("email", "smshelar1010@gmail.com");
        p.getProperty("email");

        for (Map.Entry<Object, Object> pr:p.entrySet()) {
            System.out.println(pr);
        }
    }

}

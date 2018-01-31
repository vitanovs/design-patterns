package structural.proxy;

import structural.proxy.entities.FileManager;
import structural.proxy.entities.FileManagerProxy;

import java.io.IOException;

public class ProxyDesignPattern {
    public static void main(String[] args) {

        String packageName = "structural.proxy;";

        String url = System.getProperty("user.dir") + "/src/structural/proxy/";

        FileManager fileManager = new
                FileManagerProxy(url, "CustomClass", ".java");

        String data = "package "+ packageName + "\n\npublic class CustomClass {\n\n" +
                "}";

        try {
            fileManager.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

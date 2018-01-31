package structural.proxy.entities;

import java.io.IOException;

public interface FileManager {

    String readAllFile() throws IOException;

    boolean write(String data) throws IOException;

}

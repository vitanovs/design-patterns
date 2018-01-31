package structural.proxy.entities;

import java.io.*;

public class FileManagerProxy implements FileManager {

    private String url;
    private String fileName;
    private String extension;
    private File file;

    private BufferedReader reader;

    public FileManagerProxy(String url, String fileName, String extension) {
        this.url = url;
        this.extension = extension;
        this.fileName = fileName;

        this.loadFile();

    }

    private boolean loadFile() {
        String path = url + fileName + extension;

        this.file = new File(url + fileName + extension);

        if (!this.file.exists()) {
            this.file.getParentFile().mkdir();

            try {
                this.file.createNewFile();
                this.file = new File(path);
                return true;

            } catch (IOException e) {
                e.printStackTrace();
                return false;

            }
        }
        return this.file.exists();

    }


    @Override
    public String readAllFile() throws IOException {
        FileInputStream stream = new FileInputStream(this.file);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            StringBuilder result = new StringBuilder();
            while (reader.ready()) {
                result.append((char) reader.read());
            }
            return result.toString();
        } finally {
            stream.close();
        }

    }

    @Override
    public boolean write(String data) throws IOException {
        FileOutputStream stream = new FileOutputStream(this.file);

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream))) {
            writer.write(data);
        } finally {
            stream.close();
        }

        return true;
    }

}

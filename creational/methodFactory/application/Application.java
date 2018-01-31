package creational.methodFactory.application;

import creational.methodFactory.documents.Document;

public interface Application {

    Document createDocument();

    void openDocument(Document document);

}

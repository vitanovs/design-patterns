package creational.methodFactory.application;

import creational.methodFactory.documents.Document;
import creational.methodFactory.documents.PresentationDocument;

public class PresentationApplication implements Application {

    @Override
    public Document createDocument() {
        return new PresentationDocument();
    }

    @Override
    public void openDocument(Document document) {
        document.open();
    }
}

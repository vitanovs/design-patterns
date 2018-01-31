package creational.methodFactory.application;

import creational.methodFactory.documents.Document;
import creational.methodFactory.documents.TextDocument;

public class TextApplication implements Application{

    @Override
    public Document createDocument() {
        return new TextDocument();
    }

    @Override
    public void openDocument(Document document) {
        document.open();
    }
}

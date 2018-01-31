package creational.methodFactory;

import creational.methodFactory.application.Application;
import creational.methodFactory.application.PresentationApplication;
import creational.methodFactory.application.TextApplication;
import creational.methodFactory.documents.Document;

/**
 *  --- Method Factory Design Pattern ---
 *
 *  The Method Factory Design Pattern provides an interface of creating
 *  objects and lets its subclasses to decide the class type of the objects.
 *
 */
public class MethodFactoryDesignPattern {
    public static void main(String[] args) {

        Application textApplication = new TextApplication();
        Document document = textApplication.createDocument();
        textApplication.openDocument(document);

        Application presentationApplication = new PresentationApplication();
        Document document1 = presentationApplication.createDocument();
        presentationApplication.openDocument(document1);

    }
}

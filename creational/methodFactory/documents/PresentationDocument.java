package creational.methodFactory.documents;


public class PresentationDocument implements Document {

    @Override
    public boolean open() {
        System.out.println("PRESENTATION DOCUMENT: open()");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("PRESENTATION DOCUMENT: close()");
        return false;
    }

    @Override
    public boolean save() {
        System.out.println("PRESENTATION DOCUMENT: save()");
        return false;
    }

    @Override
    public boolean revert() {
        System.out.println("PRESENTATION DOCUMENT: revert()");
        return false;
    }
}

package creational.methodFactory.documents;

public class TextDocument implements Document {

    @Override
    public boolean open() {
        System.out.println("TEXT DOCUMENT: open()");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("TEXT DOCUMENT: close()");
        return false;
    }

    @Override
    public boolean save() {
        System.out.println("TEXT DOCUMENT: save()");
        return false;
    }

    @Override
    public boolean revert() {
        System.out.println("TEXT DOCUMENT: revert()");
        return false;
    }
}

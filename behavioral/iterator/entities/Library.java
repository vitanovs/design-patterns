package behavioral.iterator.entities;

import java.util.Iterator;

public class Library<E> {

    private CustomIterator<E>[] iterators;

    public Library(CustomIterator<E>... iterators) {
        this.iterators = iterators;
    }

    public void showContent() {
        for (CustomIterator<E> movieIterator : this.iterators) {
            Iterator<E> iterator = movieIterator.getIterator();
            while (iterator.hasNext()){
                E next = iterator.next();
                System.out.println(next);
            }
            System.out.println();
        }
    }
}

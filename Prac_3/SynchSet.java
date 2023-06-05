package Prac_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SynchSet implements Set {

    @Override
     synchronized public int size() {
        return 0;
    }

    @Override
    synchronized public boolean isEmpty() {
        return false;
    }

    @Override
    synchronized public boolean contains(Object o) {
        return false;
    }

    @Override
    synchronized public Iterator iterator() {
        return null;
    }

    @Override
    synchronized public Object[] toArray() {
        return new Object[0];
    }

    @Override
    synchronized public boolean add(Object o) {
        return false;
    }

    @Override
    synchronized public boolean remove(Object o) {
        return false;
    }

    @Override
    synchronized public boolean addAll(Collection c) {
        return false;
    }

    @Override
    synchronized public void clear() {

    }

    @Override
    synchronized public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    synchronized public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    synchronized public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    synchronized public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

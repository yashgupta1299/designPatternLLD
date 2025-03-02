package IteratorDesignPattern.Aggregate;

import IteratorDesignPattern.Iterator.MyIterator;

public interface Aggregate<T> {
    public MyIterator<T> createIterator();
}

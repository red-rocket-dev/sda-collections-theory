package pl.sda;

import java.util.Iterator;

public class MyIterator implements Iterator<String> {

    Node currentState;

    @Override
    public boolean hasNext() {
        return currentState != null;
    }

    @Override
    public String next() {
        String value = currentState.getValue();
        currentState = currentState.getNext();
        return value;
    }
}

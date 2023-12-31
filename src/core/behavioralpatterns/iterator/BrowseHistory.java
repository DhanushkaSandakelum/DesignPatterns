package core.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    // Nested class
    public class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public Object current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}

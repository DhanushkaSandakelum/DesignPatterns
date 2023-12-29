package examples.behavioralpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("First");
        document.setFontName("Font1");
        document.setFontSize(10);
        history.push(document.createState()); // Saving Previous state

        document.setContent("Second");
        document.setFontName("Font2");
        document.setFontSize(11);
        history.push(document.createState()); // Saving Previous state

        document.setContent("Third");
        document.setFontName("Font3");
        document.setFontSize(12);
        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document);
    }
}

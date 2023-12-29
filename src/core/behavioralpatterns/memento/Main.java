package core.behavioralpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState()); // Saving Previous state

        editor.setContent("b");
        history.push(editor.createState()); // Saving Previous state

        editor.setContent("c");
        editor.restore(history.pop()); // Undo to previous state
        editor.restore(history.pop()); // Undo to previous state

        System.out.println(editor.getContent());
    }
}

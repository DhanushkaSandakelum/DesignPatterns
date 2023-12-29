package core.behavioralpatterns.memento;

public class EditorState {
    // final - Specifies we can't modify it once initialized
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

package core.behavioralpatterns.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        // Using SelectionTool
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        // Using BrushTool
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        // Using EraserTool
        canvas.setCurrentTool(new EraserTool() );
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

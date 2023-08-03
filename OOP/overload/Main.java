package OOP.overload;

public class Main {
    public static void main(String[] args) {
        Button entrButton = new Button("Enter");
        ShutdownButton stdButton = new ShutdownButton();
        ToggleButton tgButton = new ToggleButton("toggle", true);

        entrButton.func();
        stdButton.func();
        tgButton.func();
        tgButton.func();
        tgButton.func();
    }
}

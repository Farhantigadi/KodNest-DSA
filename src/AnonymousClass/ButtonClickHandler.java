package AnonymousClass;

interface ClickListener {
    void onClick();
}

class Button {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void click() {
        System.out.println("Clicking button '" + label + "'");
    }

    public void setClickListener(ClickListener listener) {
        listener = new ClickListener() {
            public void onClick() {
                System.out.println("Button '" + label + "' was clicked!");
            }
        };
    }
}

public class ButtonClickHandler {
    public static void main(String[] args) {
        Button submitButton = new Button("Submit");

        submitButton.setClickListener(new ClickListener() {
            public void onClick() {
                System.out.println("Submit button clicked!");
            }
        });

        submitButton.click();
    }
}
import javax.swing.*;
import java.awt.*;

public class CalculatorGui extends JFrame {
    JButton[] buttons;
    private static final String[] BUTTON_LABELS = {"7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "/", "="};

    public CalculatorGui() {
        super("Calculator App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600); // Adjusted size of the application window
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(new BorderLayout()); // Set BorderLayout for the frame
        addGuiComponents();
    }

    public void addGuiComponents() {
        // Add input field with larger size and font
        JTextField inputField = createInputField();
        inputField.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Add margin
        inputField.setBackground(Color.DARK_GRAY); // Set background color
        inputField.setForeground(Color.WHITE); // Set text color to white
        add(inputField, BorderLayout.NORTH);

        // Create and add buttons in a grid to the CENTER
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10)); // Grid layout for buttons with gaps
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add margin
        buttonPanel.setBackground(Color.DARK_GRAY); // Set background color
        buttons = createButtons();
        for (JButton button : buttons) {
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            button.setForeground(Color.BLACK); // Set text color to black
            buttonPanel.add(button); // Add button to the panel
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    // Create input field with larger size and font
    private JTextField createInputField() {
        JTextField inputField = new JTextField();
        inputField.setFont(new Font("Dialog", Font.PLAIN, 80)); // Increased font size
        return inputField;
    }

    // Create buttons with labels from BUTTON_LABELS constant and adjust margin for text
    private JButton[] createButtons() {
        JButton[] buttons = new JButton[BUTTON_LABELS.length];
        for (int i = 0; i < BUTTON_LABELS.length; i++) {
            buttons[i] = new JButton(BUTTON_LABELS[i]);
            buttons[i].setHorizontalAlignment(SwingConstants.CENTER); // Center align text
            buttons[i].setMargin(new Insets(10, 10, 10, 10)); // Add margin to text
            buttons[i].setFont(new Font("Dialog", Font.PLAIN, 30)); //  Font size
            buttons[i].setBackground(Color.DARK_GRAY); // Set background color
        }
        return buttons;
    }
}

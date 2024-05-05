import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGui calculatorGui = new CalculatorGui();
            calculatorGui.setVisible(true);
        });
    }
}

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Use system look and feel
            } catch (Exception e) {
                e.printStackTrace();
            }
            CalculatorGui calculatorGui = new CalculatorGui();
            calculatorGui.setVisible(true);
        });
    }
}

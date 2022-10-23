import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

class Frame1 {
    public static void main(String args[]) {
        JFrame frame;
        JPanel contentPane;
        JLabel label;

        frame = new JFrame("HelloWorldGUIColor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = (JPanel) frame.getContentPane();
        label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        contentPane.add(label);

        frame.setSize(100,50);
        frame.setVisible(true);
    }
}

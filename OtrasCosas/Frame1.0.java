import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

class Frame1 {
    public static void main(String args[]) {
        JFrame frame;
        JPanel contentPane;
        JLabel label;

        frame = new JFrame("HelloWorldGUIUndecorated");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = (JPanel) frame.getContentPane();
        label = new JLabel("Hello World!");
        contentPane.add(label);

        frame.setSize(100,50);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
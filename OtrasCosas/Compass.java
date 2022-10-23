import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;

class Compass {
    public static void main(String args[]) {
        JFrame frame;
        JPanel contentPane;
        JLabel label;

        frame = new JFrame("CompassSimple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = (JPanel) frame.getContentPane();

        label = new JLabel("North");
        label.setOpaque(true);
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        contentPane.add(label, BorderLayout.NORTH);

        label = new JLabel("South");
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.BLACK);
        contentPane.add(label, BorderLayout.SOUTH);

        label = new JLabel("East");
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        label.setForeground(Color.RED);
        contentPane.add(label, BorderLayout.EAST);

        label = new JLabel("West");
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.setForeground(Color.BLUE);
        contentPane.add(label, BorderLayout.WEST);

        if (frame.getToolkit().isFrameStateSupported(Frame.MAXIMIZED_BOTH))
            frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        else
            frame.setSize(frame.getToolkit().getScreenSize());
        frame.setVisible(true);
    }
}
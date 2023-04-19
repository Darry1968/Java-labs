import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_handling {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b = new JButton("Button");
        b.setBounds(130, 130, 100, 50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

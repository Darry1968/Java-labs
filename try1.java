import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class try1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b = new JButton("Button");
        b.setBounds(130, 130, 100, 50);

        // Add ActionListener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Specify the action to be performed when the button is clicked
                System.out.println("Button clicked!"); // Example action, you can replace this with your desired action
            }
        });

        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

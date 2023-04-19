import java.awt.*;

public class AWT_Button_in_java {
    public AWT_Button_in_java() {
        Frame f = new Frame();
        Button btn = new Button("Hello World");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn);
        f.setSize(300, 250);
        f.setTitle("Sejal_Shinde_2213310");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AWT_Button_in_java awt = new AWT_Button_in_java();
    }
}

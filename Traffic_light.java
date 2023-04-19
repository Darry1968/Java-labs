package lab10.java;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator extends JFrame implements ItemListener
{
JLabel lbl1,lbl2;
JPanel nPanel, cPanel;
CheckboxGroup cbg;
public TrafficLightSimulator()
{
setTitle("Traffic Light Simulator");
setSize(600,400);
setLayout(new GridLayout(2,1));

nPanel = new JPanel(new FlowLayout());
cPanel = new JPanel(new FlowLayout());

lbl1 = new JLabel();
Font font = new Font("Verdana",Font.BOLD,70);
lbl1.setFont(font);
nPanel.add(lbl1);
add(nPanel);

Font fontR = new Font("Verdana",Font.BOLD,20);
lbl2 = new JLabel("Select Lights");
lbl2.setFont(fontR);
cPanel.add(lbl2);

cbg = new CheckboxGroup();
Checkbox rbn1 = new Checkbox("Red Light",cbg,false);
rbn1.setBackground(Color.RED);
rbn1.setFont(fontR);
cPanel.add(rbn1);
rbn1.addItemListener(this);

Checkbox rbn2 = new Checkbox("Orange Light",cbg,false);
rbn2.setBackground(Color.ORANGE);
rbn2.setFont(fontR);
cPanel.add(rbn2);
rbn2.addItemListener(this);

Checkbox rbn3 = new Checkbox("Green Light",cbg,false);
rbn3.setBackground(Color.GREEN);
rbn3.setFont(fontR);
cPanel.add(rbn3);
rbn3.addItemListener(this);

add(cPanel);

setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void itemStateChanged(ItemEvent i)
{
Checkbox chk = cbg.getSelectedCheckbox();

String str=chk.getLabel();
char choice=str.charAt(0);

switch (choice)
{
case 'R':lbl1.setText(" S T O P ");
lbl1.setForeground(Color.RED);
break;

case 'O':lbl1.setText("READY");
lbl1.setForeground(Color.ORANGE);
break;

case 'G':lbl1.setText("G O ");
lbl1.setForeground(Color.GREEN);
break;
}
}
public static void main(String[] args)
{
new TrafficLightSimulator();
}

}

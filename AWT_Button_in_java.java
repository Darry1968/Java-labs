import java.awt.*;  


public class AWTProgram 
{  
public AWTProgram()  
    {  
        Frame f = new Frame();  
        Button btn=new Button("Hello World");  
        btn.setBounds(80, 80, 100, 50);  
        f.add(btn);          
        f.setSize(300, 250);          
        f.setTitle("Sejal_Shinde_2213310");    
        f.setLayout(null);     
        f.setVisible(true);            
    }  
  
 public static void main(String[] args) 
 {
	 AWTProgram awt = new AWTProgram();
 }
}

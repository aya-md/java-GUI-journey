import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {  
    MyFrame frame = new MyFrame();
    MyLabel label = new MyLabel();
    frame.add(label);
    ImageIcon image = new ImageIcon("java-GUI-journey/label/src/icons8-heart-50.png");
    label.setIcon(image);
    Border border = BorderFactory.createLineBorder(Color.BLACK,4);
    label.setBorder(border);
    frame.pack();
    
    }
    
}

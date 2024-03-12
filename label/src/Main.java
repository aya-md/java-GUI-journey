import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {  
    MyFrame frame = new MyFrame();
    MyLabel label = new MyLabel();
    frame.add(label);
    ImageIcon image = new ImageIcon("src/icons8-heart-50.png");
    label.setIcon(image);
    
    }
    
}

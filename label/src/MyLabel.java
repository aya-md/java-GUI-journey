
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel extends JLabel {
    MyLabel(){
        this.setText("hello everyone");
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP );
        this.setForeground(new Color(0,54,0));
        this.setFont(new Font("MV Boli",Font.PLAIN,30));
        this.setIconTextGap(20);
    }
}

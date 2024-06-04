import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Gui_2 {
    public static void main(String[] args){
        ImageIcon image = new ImageIcon("hi.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // create a label
        label.setText("Hii"); // set the text of the label
        label.setIcon(image); // set the icon of the label
        label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal alignment of the label
        label.setVerticalAlignment(JLabel.CENTER); // set the vertical alignment of the label
        label.setForeground(new Color(0x00ff00)); // set the foreground color of the label
        label.setFont(new Font("Arial",Font.BOLD,20)); // set the font of the label
        label.setBackground(Color.black); // set background color
        label.setIconTextGap(-25); // set the icon
        label.setOpaque(true); // set the opacity of the label
        label.setBorder(border); // set the border of the label
        label.setVerticalAlignment(JLabel.CENTER); // set the vertical alignment of the label
        label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal alignment of the label
        label.setBounds(100,100,200,200); // set the x and y position within frame

        JFrame frame = new JFrame(); // create a frame
        frame.add(label); // add the label to the frame
        frame.setSize(400,400); // set the x and y dimension of the frame
        frame.setVisible(true); // make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit from application
        frame.setResizable(false); // prevent frame from being resized
        frame.getContentPane().setBackground(new Color(0x123456)); // set the background color of the frame
        frame.setIconImage(image.getImage()); // set the icon of the frame
        frame.setLocationRelativeTo(null); // set the location of the frame relative to the center of the screen
        frame.setTitle("Hello"); // set the title of the frame
        frame.setIconImage(image.getImage()); // set the icon of the frame


    }
}

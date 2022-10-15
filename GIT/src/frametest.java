import javax.swing.*;

public class frametest extends JFrame
{
    JFrame frame;
    frametest()
    {
        setTitle("this is also a title");
        JButton button = new JButton("click");
        button.setBounds(165, 135, 115, 55);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        System.out.println("Frame created");
    }
    public static void main(String[] args)
    {
        new frametest();
    }
}
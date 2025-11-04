// AWTApp.java
import java.awt.*;
import java.awt.event.*;

public class AWTApp extends Frame implements ActionListener {
    Label lbl;
    TextField tf;
    Button btn;

    public AWTApp() {
        // Frame title
        super("AWT Demo - Enter your name");

        // Use FlowLayout
        setLayout(new FlowLayout());

        lbl = new Label("Enter your name:");
        tf = new TextField(20);
        btn = new Button("Click Me");

        add(lbl);
        add(tf);
        add(btn);

        btn.addActionListener(this);

        // Frame settings
        setSize(350, 120);
        setVisible(true);

        // Window closing handler
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        new AWTApp();
    }
}

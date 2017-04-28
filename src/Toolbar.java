
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {

    //create Two Buttons 
    private JButton helloButton;
    private JButton goodByeButton;

    private TextPanel textPanel;

    public Toolbar() {
        //Instaintiate the buttons and give name
        helloButton = new JButton("Hello");
        goodByeButton = new JButton("Good Bye");

        //insert flow layout
        setLayout(new FlowLayout(FlowLayout.LEFT));

        //add boutton to the Panel
        add(helloButton);
        add(goodByeButton);

        //add action listner 
        helloButton.addActionListener(this);
        goodByeButton.addActionListener(this);
    }

    void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == helloButton) {

            textPanel.appendText("Hello \n");
        }
        if (clicked == goodByeButton) {
            textPanel.appendText("GoodBye \n");
        }

    }

}

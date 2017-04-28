
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

    private JTextArea textArea;//simple text area 

    public TextPanel() {
        textArea = new JTextArea();//Instaintiate text area 
        setLayout(new BorderLayout());//set layout to border layout
        add(new JScrollPane(textArea), BorderLayout.CENTER);//add textarea to the layout of panel
    }

    public void appendText(String text) {
        textArea.append(text);//append text to text area 
    }

}

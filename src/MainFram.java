import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFram extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFram() throws HeadlessException {
        
        super("Zia Ur Rehman ");//call the ctor of Fram class to create fram
        setLayout(new BorderLayout());//set layout to border layout 

        textPanel = new TextPanel();//Instaintiate textpanel 
        toolbar = new Toolbar();    //Instaintiate Toolbar
        toolbar.setTextPanel(textPanel);
      
        add(textPanel, BorderLayout.CENTER);//add textpanel to the frame
        add(toolbar, BorderLayout.NORTH);   //add the toolbar to the Frame
        
        setSize(400, 400);                  //set the width and height of Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set the Default CLose operation
        setVisible(true);                   //set the frame visible
    }

}

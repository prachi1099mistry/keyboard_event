import java.awt.*;  
import java.awt.event.*;  
public class Key extends Frame implements KeyListener{  
    Label l1,l2,l3;
	TextField t;
    Key(){ 
		super("Key Listener");
		t = new TextField();
		t.setBounds(50,50,700,50);
		t.addKeyListener(this);
		add(t);
        l1 = new Label();  
        l1.setBounds(50,100,700,40); 
        add(l1);
		l2 = new Label();  
        l2.setBounds(50,150,700,40); 
        add(l2);
		l3 = new Label();  
        l3.setBounds(50,200,700,40); 
        add(l3);		
        setSize(800,300);  
        setLayout(null);  
        setVisible(true);  
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){		
				dispose();
			}
		});
    }  
    public void keyTyped(KeyEvent e) {  
        l1.setText(t.getText() + " key Clicked");  
    }
    public void keyPressed(KeyEvent e) {  
        l2.setText(t.getText() + " key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
        l3.setText(t.getText() + " key Released");  
    }
	 
	public static void main(String[] args) {  
		new Key();  
	}  
}

import java.awt.*;
import java.awt.event.*;
public class NewAwtPg implements ActionListener{
    TextField tf;
    NewAwtPg(){
     Frame f=new Frame();
    TextField tf=new TextField();
    tf.setBounds(100,100,200,30);
    Button  b= new Button("Click me");
    b.setBounds(150,150,80,30);
    b.addActionListener(this);
    f.add(tf);
    f.add(b);
    f.setSize(500,500);
    f.setTitle("hello harendra");
    f.setVisible(true);
   
   }

   public void actionPerformed(ActionEvent e){
    tf.setText("Welcome By: Harendra");
   }

    public static void main(String[] args) {

        NewAwtPg pg=new NewAwtPg();
        
    }
    
}

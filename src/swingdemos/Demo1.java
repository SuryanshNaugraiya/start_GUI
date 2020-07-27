package swingdemos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 implements ActionListener {

    JFrame jf;//made frame an instance variable so that koi error na aaye actionPerformed() mai
    JButton jb1;//made button an instance variable so that koi error na aaye actionPerformed() mai
    JTextField jt;//made text feild an instance variable so that koi error na aaye actionPerformed() mai
    JLabel jl;

    Demo1(){

        jf = new JFrame("GUI");// create JFrame object
        jf.setSize(500,500);//to set size of frame
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//to close the running program after clicking on cross button
        jf.setLocationRelativeTo(null);//to open the frame in the center of screen
        jf.setLayout(null);//used so that jo default layout set hota hai wo na ho

        jl = new JLabel(" Enter name :-");//create Jlable object
        jl.setBounds(10,50,200,50);//to set the location, height and width of label
        jf.add(jl);//to add the label on frame

        jt =new JTextField();//create JTextFeild object
        jt.setBounds(100,50,200,50);//to set the location, height and width of text feild
        jf.add(jt);//to add the text feild on frame

        jb1 =new JButton("click");//create JButton object
        jb1.setBounds(150,250,200,50);//
        jf.add(jb1);//to add the button on frame
        jb1.addActionListener(this);//this keyword can be used to pass as an argument of current class object

        jf.setVisible(true);//so that we can see that frame , but islo end mai hi likhna bcos tabhi shi se kaam karega
    }

    public static void main(String[] args) {
        new Demo1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            String s = jt.getText();
            String empty = "";
            if(s.equals(empty)){
                JOptionPane.showMessageDialog(jf,"Please enter your name", "Error",JOptionPane.ERROR_MESSAGE);//System.out.println("Hi, "+s);  aise mt print krao bcos nhi to terminal pr print hoga wo
            }
            else{
                JOptionPane.showMessageDialog(jf,"Hi, "+s); //* hmne jf ko pass isliye kiya hai so that dialog box frame ke reference mai center mai open ho
            }
            jt.setText("");//if we want that on clicking ok text feild empty ho jae
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.vista;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
/**
 *
 * @author LENOVO
 */
public class s extends JFrame{

    static JComboBox<ArrayList> mycombo;

    s()
    {
        this.setSize(600,500);
        this.setTitle("My combo");
        this.setLayout(null);

        ArrayList<String> names=new ArrayList<String>();   
        names.add("jessy");
        names.add("albert");
        names.add("grace");
        mycombo=new JComboBox(names.toArray());
        mycombo.setBounds(60,32,200,50);
        this.add(mycombo);
        this.setVisible(true); // window visible
        System.out.println(mycombo);
    }   

    public static void main(String[] args) {

        s frame=new s();  

    }

}
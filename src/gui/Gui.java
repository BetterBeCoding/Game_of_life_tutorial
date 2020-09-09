package gui;

import javax.swing.*;
import draw.Draw;

public class Gui {
    JFrame jf ;
    public static Draw d ;

    public static final int WIDTH = 1024, HEIGHT = 1024, XOFF = 10 ,YOFF = 10;
    public void create(){
        jf = new JFrame("Game of Life") ;
        jf.setSize(1100,1140) ;
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        jf.setLocationRelativeTo(null) ;
        jf.setResizable(false) ;

        d = new  Draw();
        d.setBounds(0,0,1100,1140);
        d.setVisible(true);
        jf.add(d);

        jf.setVisible(true);


    }

}
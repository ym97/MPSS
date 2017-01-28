/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor.part;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author MUNNA-17
 */
public final class myframe extends JFrame{
    private final int y;
    private final int x;
    private String Name;
    
    /**
     *
     * @param x
     * @param y
     * @param s
     */
    public myframe(int x,int y,String s){    
        this.x = x;
        this.y = y; 
        setTitle(s);
       
        
        
}
    public myframe(String s){
     this.x=591;
     this.y=491;
     //super.setSize(x, y);
     setTitle(s);
    }
    public myframe(){
      this.x=591;
      this.y=491;  
      setTitle(Name);
    }
    /**
     *
     * @param s
     */
    @Override
   public void setTitle(String s){
       super.setTitle(s);       
       super.setResizable(true);
       super.setVisible(true);
       super.setSize(x, y);
       super.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public void Prog_Close() {
                WindowEvent Close = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(Close);
        }

    
}

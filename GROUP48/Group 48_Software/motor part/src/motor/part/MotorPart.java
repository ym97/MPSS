/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor.part;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MUNNA-17
 */
public class MotorPart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            myframe  mframe= new myframe(1500, 800,"Motor Part Suppliers");
            mframe.setLayout(new BorderLayout());
           JLabel    backgrnd=new JLabel(new ImageIcon(ImageIO.read(new File("./src/Icons/background1.png")).getScaledInstance(1500, 800, Image.SCALE_SMOOTH)));
          mframe.setContentPane(backgrnd);
            mframe.setLayout(new FlowLayout());
            mframe.add(new MainPanel());
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(MotorPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    


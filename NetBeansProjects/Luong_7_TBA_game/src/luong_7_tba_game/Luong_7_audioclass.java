/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_tba_game;
    import java.awt.Component;
    import java.io.*;
    import javax.swing.JFileChooser;
    import sun.audio.*;
/**
 *
 * @author mluong
 */
public class Luong_7_audioclass extends Luong_7_TBA_game{
    public Luong_7_audioclass() { //this is where the audio runs
        try {
            JFileChooser openf = new JFileChooser();//chooses the file on the computer
            Component j = null;
                openf.showOpenDialog(j);
                File fl = openf.getSelectedFile();//selected file will open
                String st = fl.getAbsolutePath();
                InputStream in = new FileInputStream(st);
                AudioStream au = new AudioStream(in);
                AudioPlayer.player.start(au);
        }
        
        catch(Exception e ){}//will run
    }

    public void soundsystem() {
        System.out.println("Enjoy the game and music...");
        System.out.println("\n");
    }
    
public static void main(String args[]) {
    
    
    Luong_7_audioclass pl = new Luong_7_audioclass();//audio class that will direct to the main java file
    pl.soundsystem();
    intro();
    
}

}



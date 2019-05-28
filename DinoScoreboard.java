import java.io.*;      //the File class
import java.util.Scanner; //scanner class             --     DO NOT DO JAVA.UTIL.*;
import javax.swing.*; //timer is in this package
import java.awt.*;      //
import java.awt.event.*;  //actionlistener class

   public class DinoScoreboard extends JPanel
   {
      public JLabel HiScore, time;
      String filename = "Highscore.txt";
      Timer t = new Timer(100, new Listener());
      
      public DinoScoreboard()
      {
      
         setLayout(new GridLayout(1, 2)); //2 rows 1 column
         
         
         Scanner infile = null;
         
         try
            {
               infile = new Scanner(new File(filename));
            }
         catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be found.");
               System.exit(0);
            }
            
         HiScore = new JLabel("HighScore:" + infile.nextInt());
         HiScore.setHorizontalAlignment(SwingConstants.RIGHT);
         HiScore.setVisible(true);
         add(HiScore);
         
         time = new JLabel("0");
         time.setHorizontalAlignment(SwingConstants.RIGHT);
         add(time);
               
       }
       
      public void ScoreStart()
      {
      
        t.start();
        HiScore.setVisible(true);
    
      }
      public void ScoreStop()
      {
      
         t.stop();
         HiScore.setVisible(true);
    
      }

      
      public void  findAndPrint()
      {
        //find
         Scanner infile = null;
         
         try
            {
               infile = new Scanner(new File(filename));
            }
         catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be found.");
               System.exit(0);
            }
            
          
            if(Integer.parseInt(time.getText()) > infile.nextInt()) //print
                            {
                            PrintStream outfile = null;
                           try{
                              outfile = new PrintStream(new FileOutputStream(filename));
                              }
                               catch(FileNotFoundException e)
                              {
                                 JOptionPane.showMessageDialog(null,"The file could not be created.");
                              }
                              System.setOut(outfile);
                              
                              
                              System.out.println(time.getText());
                           }
         }

    
   private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           time.setText(""+(Integer.parseInt(time.getText())+1));
           
         }
      }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clone;

 3   /**
 4      @version 1.01 2015-05-12
 5      @author Cay Horstmann
 6   */
 7
 8   import java.awt.*;
 9   import java.awt.event.*;
10   import java.util.*;
11   import javax.swing.*;
12   import javax.swing.Timer;
13   // to resolve conflict with java.util.Timer
14
15   public class TimerTest
16   {
17      public static void main(String[] args)
18      {
19         ActionListener listener = new TimePrinter();
20
21         // construct a timer that calls the listener
22         // once every 10 seconds
23         Timer t = new Timer(10000, listener);
24         t.start();
25
26         JOptionPane.showMessageDialog(null, "Quit program?");
27         System.exit(0);
28      }
29   }
30
31   class TimePrinter implements ActionListener
32   {
33      public void actionPerformed(ActionEvent event)
34      {
35         System.out.println("At the tone, the time is " + new Date());
36         Toolkit.getDefaultToolkit().beep();
37      }
38   }
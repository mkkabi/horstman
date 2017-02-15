
package interfaces;

import java.awt.*;
 import java.awt.event.*;
 import java.util.*;
 import javax.swing.*;
 import javax.swing.Timer;
/*
* Эта программа демонстрирует использование вложенных классов.
*@version 1.10 2004-02-27
* @author Cay Horstmann
*/

public class InnerClassTest
{
 public static void main (String[] args) {
  TalkingClock clock = new TalkingClock(1000, true);
  clock.start();
 //Программа выполняется до тех пор г пока 
 // пользователь не щелкнет на кнопке ОК.
     
 JOptionPane.showMessageDialog(null, "Завершить программу?");
 System.exit(0);
   }
 }


// Часы, выводящие информацию о времени через заданный интервал.

class TalkingClock {
 /*
 * @param interval Интервал в миллисекундах между сообщениями
 * @param beep Значение true включает звуковой сигнал
 */
private int interval;
private boolean beep;

public TalkingClock(int interval, boolean beep) {
 this.interval = interval;
 this.beep = beep;
}
public static void echoCho (){
    System.out.println("asdf asdf asdf asdf asdfasdf ");
}
// Запускает часы.
public void start(){
//ActionListener listener = new MyClassTest();
  
Timer t = new Timer (interval, new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Звонок, время: " + new Date()) ;
            if (beep) Toolkit.getDefaultToolkit().beep();   
    }
    });
t.start();
}

//private class TimePrinter implements ActionListener {
// public void actionPerformed (ActionEvent event)
// {
// System.out.println("Звонок, время: " + new Date()) ;
// if (beep) Toolkit.getDefaultToolkit().beep();
//    }
//  }
}
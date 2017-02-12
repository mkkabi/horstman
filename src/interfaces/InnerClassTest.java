/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 //Программа выполняется до тех пор г пока .........
 // пользователь нещелкнет на кнопке ОК.
 JOptionPane.showMessageDialog(null, "Завершить программу?");
 System.exit(0);
   }
 }

/*
 * Часы, выводящие информацию о времени через
 * заданный интервал.
 */
class TalkingClock {
 /*
 * Конструирует "говорящие часы11
 * @param interval Интервал в миллисекундах между сообщениями
 * @param beep Значение true включает звуковой сигнал
 */
private int interval;
private boolean beep;
 public TalkingClock(int interval, boolean beep) {
 this.interval = interval;
 this.beep = beep;
}
// Запускает часы.
public void start(){
ActionListener listener = new TimePrinter();
Timer t = new Timer (interval, listener);
t.start();
}

private class TimePrinter implements ActionListener {
 public void actionPerformed (ActionEvent event)
 {
 Date now = new Date() ;
 System.out.println("Звонок, время: " + now) ;
 if (beep) Toolkit.getDefaultToolkit().beep();
    }
  }
}
import java.applet.Applet;
import java.awt.*;
/* <applet code=Animate3 height=300 width=300>
</applet> */


public class Animate3 extends Applet implements Runnable {
  Thread Xeq;
  int StartAngle;
  int Delay;
  Color[] Colors;

  public void start () {
    if (Xeq == null) {
      Xeq = new Thread(this);
      Xeq.start();
    }
  }

  public void init () {
    Colors = new Color[12];
    StartAngle = 0;
    Delay = 40;
    int Blade = 0;
    while (Blade < 12) {
      Colors[Blade] = Color.white;
      Blade = Blade + 2;
    }
    Blade = 1;
    while (Blade < 12) {
      Colors[Blade] = Color.black;
      Blade = Blade + 2;
    }
    Colors[1] = Color.red;
    setBackground (Color.white);
  }

  public void run () {
    while (true) {
      ++StartAngle;
      repaint ();
      try {
        Xeq.sleep(Delay);
      } 
      catch (InterruptedException ex) {
      }
    }
  }

  public void update (Graphics g) {
    paint(g);
  }

  public void paint (Graphics g) {
    int Blade = 0;
    while (Blade < 12) {
      g.setColor (Colors[Blade]);
      g.fillArc (20, 20, 180, 180, 
         StartAngle + Blade * 30, 30);
      ++Blade;
    }
  }

}
 
   

import java.applet.Applet;
import java.awt.*;
/* <applet code=Animate2 height=300 width=300>
</applet> */
public class Animate2 extends Applet implements Runnable {
  Thread Xeq;
  int StartAngle;
  int Delay;

  public void init () {
    StartAngle = 0;
    Delay = 40;
  
  }

  public void start () {
    if (Xeq == null) {
      Xeq = new Thread(this);
      Xeq.start();
    }
  }

  public void run () {
    while (true) {
      StartAngle = StartAngle + 1;
      repaint ();
      try {
        Xeq.sleep(Delay);
      } 
      catch (InterruptedException ex) {
      }
    }
  }

  public void paint (Graphics g) {
    int Blade = 0;
    while (Blade < 6) {
      g.fillArc (20, 20, 180, 180, 
         StartAngle + Blade * 60, 30);
      ++Blade;
    }
  }

  public void update (Graphics g) {
    paint(g);
  }

}

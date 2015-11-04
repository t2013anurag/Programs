import java.applet.Applet;
import java.awt.*;

/*<applet code=Flow1 height=200  width=200>
</applet> */

public class Flow1 extends Applet {

  Button [] b = new Button[16];

  public void init     () {
    int i;
    
  //  setLayout(new FlowLayout (FlowLayout.TRAILING, 10,10));
  setLayout(new FlowLayout());
   
    for (i = 0; i < 15; ++i) {
      b[i] = new Button ();
      b[i].setLabel ("Button " + (i + 1));
      add (b[i]);
    }
  }

}


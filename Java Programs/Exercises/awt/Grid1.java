import java.applet.Applet;
import java.awt.*;

/* <applet code=Grid1 height=200 width=200>
</applet> */

public class Grid1 extends Applet {

  Button[] b=new Button [16];

  public void init() {
      int i;
    
      setLayout(new GridLayout (3, 6));

      for (i = 0; i <= 15; ++i) {
      b[i] = new Button ();
      b[i].setLabel ("Button " + (i + 1));
      add (b[i]);
    }
  }

}

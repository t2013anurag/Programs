import java.applet.Applet;
import java.awt.*;

/* <applet code=Border1 height=200 width=200>
</applet> */

public class Border1 extends Applet {
  BorderLayout Layout = new BorderLayout (10, 10);
  Button b = new Button("EAST");
  Label l = new Label ("Just Checking West");
  Button b1 = new Button("North");
  Label l1 = new Label ("In South");

  TextArea t = new TextArea("WElcome - Demo of border layout");  

  public void init() {
    int i;

    setLayout (Layout);

      add (b,BorderLayout.EAST);
      add (b1,BorderLayout.NORTH);
      add(l, BorderLayout.WEST);
      add(l1, BorderLayout.SOUTH);
      add(t , BorderLayout.CENTER);	 		
     }
  }



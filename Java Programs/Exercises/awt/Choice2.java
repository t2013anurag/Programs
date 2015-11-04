import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code=Choice2 height=200 width=300>
</applet> */

public class Choice2 extends Applet implements ItemListener {


    Choice ch = new Choice();
    String ColorList[] = {"Red","Meganta","Blue","Cyan","Green","Yellow","White","Gray","Black"} ;
    int i;

    	public void init()
	{
	    for (i = 0; i < ColorList.length; ++i)
    	    {ch.addItem (ColorList [i]);}


            ch.setBackground (Color.yellow);
	    ch.setForeground (Color.red);

            add (ch);
	    ch.addItemListener (this);
	    ch.select (5);
	    setBackground (Color.yellow);
  	}

  public void itemStateChanged(ItemEvent e) {
    int Selection;
    Selection = ch.getSelectedIndex();
    if (Selection == 0) {
      setBackground (Color.red);
    } else if (Selection == 1) {
      setBackground (Color.magenta);
    } else if (Selection == 2) {
      setBackground (Color.blue);
    } else if (Selection == 3) {
      setBackground (Color.cyan);
    } else if (Selection == 4) {
      setBackground (Color.green);
    } else if (Selection == 5) {
      setBackground (Color.yellow);
    } else if (Selection == 6) {
      setBackground (Color.white);
    } else if (Selection == 7) {
      setBackground (Color.gray);
    } else if (Selection == 8) {
      setBackground (Color.black);
    } 
  } 

}


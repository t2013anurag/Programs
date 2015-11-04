import java.applet.Applet;
import java.awt.*;

public class drawing extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.drawRoundRect(160, 160, 150, 130,100,100);
        g.setColor(Color.RED);
        g.fillRect(50, 30, 50, 30);
	showStatus("My first applet .. Wish me good luck");
        }
        }

/*
<applet code=drawing width=300 height=300>
</applet>
*/
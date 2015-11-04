import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
/*<applet code="codedb.class" height=650 width=1000>
</applet>*/
public class codedb extends Applet implements ItemListener,ActionListener
{
String F = "DES.txt",F1="LS.txt";
   StringBuffer strBuff;
   TextArea t;
static int i=0,j=0;
//Image img1,img2;
//URL base;
Panel p1,p2;
Font f1,f2;
GridBagLayout gb;
GridBagConstraints c;
//List lt1;
Label lx,ly,l1,l2,l3;
Choice ch,ch1,ch2,ch3;
CheckboxGroup cb;
Checkbox r1,r2,r3;
public void readFile(String x){
      String line;
      URL url = null;
      try{
         url = new URL(getCodeBase(),x);
      }
      catch(MalformedURLException e){}
      try{
         InputStream in = url.openStream();
         BufferedReader bf = new BufferedReader
         (new InputStreamReader(in));
         strBuff = new StringBuffer();
		 t.append("File Name : " + x + "\n");
         while((line = bf.readLine()) != null){
            strBuff.append(line + "\n");
         }
         t.append(strBuff.toString());
      }
      catch(IOException e){
      e.printStackTrace();
	  }
}

public void init()
{
setBackground(Color.lightGray);
t = new TextArea(40, 50);
t.setEditable(false);  
readFile(F);
/*base=getDocumentBase();
img1=getImage(base,"1.jpg");
img2=getImage(base,"2.jpg");*/
p1=new Panel();
p2=new Panel();
f1=new Font("Arial",Font.BOLD,35);
f2=new Font("Century",Font.ITALIC,25);
gb=new GridBagLayout();
p1.setLayout(gb);
c=new GridBagConstraints();
lx=new Label("CODE");
c.gridx=0;
c.gridy=0;
c.anchor=GridBagConstraints.EAST;
lx.setFont(f1);
lx.setForeground(Color.blue);
p1.add(lx,c);
ly=new Label("DB");
c.gridx=1;
c.gridy=0;
c.anchor=GridBagConstraints.WEST;
ly.setFont(f1);
ly.setForeground(Color.blue);
p1.add(ly,c);
l1=new Label("Select your platform : ");
c.gridx=0;
c.gridy=1;
l1.setFont(f2);
gb.setConstraints(l1,c);
p1.add(l1,c);
ch=new Choice();
ch.add("  -None-");
ch.add("C");
ch.add("C++                         ");
c.gridx=1;
c.gridy=1;
gb.setConstraints(ch,c);
p1.add(ch,c);
ch.addItemListener(this); 
/*lt1=new List(2,false);
lt1.add("C");
lt1.add("C++");
lt1.add("Java");
c.gridx=1;
c.gridy=1;
gb.setConstraints(lt1,c);
p1.add(lt1,c);*/
l2=new Label("Select your category : ");
c.gridx=0;
c.gridy=2;
l2.setFont(f2);
gb.setConstraints(l2,c);
p1.add(l2,c);
cb=new CheckboxGroup();
r1=new Checkbox("Sort",cb,true);
c.gridx=1;
c.gridy=2;
c.anchor=GridBagConstraints.WEST;
gb.setConstraints(r1,c);
p1.add(r1);
r1.addItemListener(this);
r2=new Checkbox("Search",cb,false);
c.gridx=1;
c.gridy=3;
gb.setConstraints(r2,c);
p1.add(r2,c);
r2.addItemListener(this);
r3=new Checkbox("Basic Codes",cb,false);
c.gridx=1;
c.gridy=4;
gb.setConstraints(r3,c);
p1.add(r3,c);
r3.addItemListener(this);
l3=new Label("Select your program : ");
c.gridx=0;
c.gridy=5;
c.anchor=GridBagConstraints.WEST;
l3.setFont(f2); 
gb.setConstraints(l3,c);
p1.add(l3,c);
ch1=new Choice();
c.gridx=1;
c.gridy=5;
ch1.add("  -None-");
ch1.add("Bubble sort");
ch1.add("Selection sort         ");
ch1.add("Insertion sort");
ch1.add("Quick sort");
ch1.add("Heap sort");
ch1.add("Merge sort");
ch1.add("Quick sort");
gb.setConstraints(ch1,c);
p1.add(ch1,c);
ch1.addItemListener(this);
ch2=new Choice();
c.gridx=1;
c.gridy=5;
ch2.add("  -None-");
ch2.add("Linear search        ");
ch2.add("Binary search");
gb.setConstraints(ch2,c);
p1.add(ch2,c);
ch2.addItemListener(this);
ch2.setVisible(false);
ch3=new Choice();
c.gridx=1;
c.gridy=5;
ch3.add("  -None-");
ch3.add("Factorial");
ch3.add("Reversing number");
ch3.add("Strong number");
ch3.add("Check prime");
ch3.add("Fibonacci series");
ch3.setVisible(false);
gb.setConstraints(ch3,c);
p1.add(ch3,c);
ch3.addItemListener(this);
ch3.setVisible(false);
Button b1=new Button("Get Code");
c.gridx=1;
c.gridy=6;
gb.setConstraints(b1,c);
p1.add(b1,c);
b1.addActionListener(this);
Button b2=new Button("Reset");
c.anchor=GridBagConstraints.LAST_LINE_END;
gb.setConstraints(b2,c);
//p1.add(b2,c);
p2.add(t,"EAST");
add(p1);
add(p2);
}
public void paint(Graphics g)
{
if(i==1&&j==1)
{
t.setText("");
readFile(F1);
}
//g.drawImage(img1,500,300,326,244,this);
/*if(i==1&&j==2)
g.drawImage(img2,500,300,326,244,this);*/
}
public void itemStateChanged(ItemEvent e)
{
if(e.getItem().equals("C")&&e.getStateChange()==ItemEvent.SELECTED)
{
i=1;
}
if(e.getItem().equals("C++                         ")&&e.getStateChange()==ItemEvent.SELECTED)
{
i=2;
}
if(e.getItem().equals("Linear search        ")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=1;
}
if(e.getItem().equals("Binary search")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=2;
}
if(e.getItem().equals("Sort")&&e.getStateChange()==ItemEvent.SELECTED)
{
ch3.setVisible(false);
ch2.setVisible(false);
ch1.setVisible(true);
//revalidate();
}
if(e.getItem().equals("Search")&&e.getStateChange()==ItemEvent.SELECTED)
{
ch3.setVisible(false);
ch1.setVisible(false);
ch2.setVisible(true);
//revalidate();
}
if(e.getItem().equals("Basic Codes")&&e.getStateChange()==ItemEvent.SELECTED)
{
ch2.setVisible(false);
ch1.setVisible(false);
ch3.setVisible(true);
//revalidate();
}
//if(e.getItem().equals("Bubble Sort")&&e.getStateChange()==ItemEvent.SELECTED){}
}
public void actionPerformed(ActionEvent e)
{
repaint();
}
}  
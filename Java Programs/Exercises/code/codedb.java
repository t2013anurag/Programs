import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
/*<applet code="codedb.class" height=650 width=1000>
</applet>*/
public class codedb extends Applet implements ItemListener,ActionListener
{
String F="des.txt",F1="bubble.txt",F2="selection.txt",F3="insertion.txt",F4="quick.txt",F5="heap.txt",F6="merge.txt",F7="ls.txt",F8="bs.txt";
String F9="fact.txt",F10="rev.txt",F11="strong.txt",F12="prime.txt",F13="fibonacci.txt";
String F21="bubblec++.txt",F22="selectionc++.txt",F23="insertionc++.txt",F24="quickc++.txt",F25="heapc++.txt",F26="mergec++.txt",F27="lsc++.txt";
String F28="bsc++.txt",F29="factc++.txt",F30="revc++.txt",F31="strongc++.txt",F32="primec++.txt",F33="fibonaccic++.txt";
FileDialog fd;
StringBuffer strBuff;
TextArea t;
static int i=0,j=0;
Panel p1,p2;
Font f1,f2;
GridBagLayout gb;
GridBagConstraints c;
Label lx,ly,l1,l2,l3,myLabel;
Choice ch,ch1,ch2,ch3;
CheckboxGroup cb;
Checkbox r1,r2,r3;
public void readFile(String x){
      String line;
      URL url = null;
      try{
         url = new URL(getClass().getProtectionDomain().getCodeSource().getLocation(),x);
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
ch.add("C++                               ");
c.gridx=1;
c.gridy=1;
gb.setConstraints(ch,c);
p1.add(ch,c);
ch.addItemListener(this); 
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
ch1.add("Selection sort               ");
ch1.add("Insertion sort");
ch1.add("Quick sort");
ch1.add("Heap sort");
ch1.add("Merge sort");
gb.setConstraints(ch1,c);
p1.add(ch1,c);
ch1.addItemListener(this);
ch2=new Choice();
c.gridx=1;
c.gridy=5;
ch2.add("  -None-");
ch2.add("Linear search              ");
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
ch3.add("Reversing number      ");
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
Button b2=new Button("Save Code");
c.anchor=GridBagConstraints.LAST_LINE_END;
gb.setConstraints(b2,c);
p1.add(b2,c);
b2.addActionListener(this);
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
if(i==1&&j==2)
{
t.setText("");
readFile(F2);
}
if(i==1&&j==3)
{
t.setText("");
readFile(F3);
}
if(i==1&&j==4)
{
t.setText("");
readFile(F4);
}
if(i==1&&j==5)
{
t.setText("");
readFile(F5);
}
if(i==1&&j==6)
{
t.setText("");
readFile(F6);
}
if(i==1&&j==7)
{
t.setText("");
readFile(F7);
}
if(i==1&&j==8)
{
t.setText("");
readFile(F8);
}
if(i==1&&j==9)
{
t.setText("");
readFile(F9);
}
if(i==1&&j==10)
{
t.setText("");
readFile(F10);
}
if(i==1&&j==11)
{
t.setText("");
readFile(F11);
}
if(i==1&&j==12)
{
t.setText("");
readFile(F12);
}
if(i==1&&j==13)
{
t.setText("");
readFile(F13);
}
if(i==2&&j==1)
{
t.setText("");
readFile(F21);
}
if(i==2&&j==2)
{
t.setText("");
readFile(F22);
}
if(i==2&&j==3)
{
t.setText("");
readFile(F23);
}
if(i==2&&j==4)
{
t.setText("");
readFile(F24);
}
if(i==2&&j==5)
{
t.setText("");
readFile(F25);
}
if(i==2&&j==6)
{
t.setText("");
readFile(F26);
}
if(i==2&&j==7)
{
t.setText("");
readFile(F27);
}
if(i==2&&j==8)
{
t.setText("");
readFile(F28);
}
if(i==2&&j==9)
{
t.setText("");
readFile(F29);
}
if(i==2&&j==10)
{
t.setText("");
readFile(F30);
}
if(i==2&&j==11)
{
t.setText("");
readFile(F31);
}
if(i==2&&j==12)
{
t.setText("");
readFile(F32);
}
if(i==2&&j==13)
{
t.setText("");
readFile(F33);
}
}
public void itemStateChanged(ItemEvent e)
{
if(e.getItem().equals("C")&&e.getStateChange()==ItemEvent.SELECTED)
{
i=1;
}
if(e.getItem().equals("C++                               ")&&e.getStateChange()==ItemEvent.SELECTED)
{
i=2;
}
if(e.getItem().equals("Bubble sort")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=1;
}
if(e.getItem().equals("Selection sort               ")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=2;
}
if(e.getItem().equals("Insertion sort")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=3;
}
if(e.getItem().equals("Quick sort")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=4;
}
if(e.getItem().equals("Heap sort")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=5;
}
if(e.getItem().equals("Merge sort")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=6;
}
if(e.getItem().equals("Linear search              ")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=7;
}
if(e.getItem().equals("Binary search")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=8;
}
if(e.getItem().equals("Factorial")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=9;
}      
if(e.getItem().equals("Reversing number      ")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=10;
}      
if(e.getItem().equals("Strong number")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=11;
}      
if(e.getItem().equals("Check prime")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=12;
}      
if(e.getItem().equals("Fibonacci series")&&e.getStateChange()==ItemEvent.SELECTED)
{
j=13;
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
}
/*public String saveFile
      (Frame f, String title, String defDir, String fileType) {
    FileDialog fd = new FileDialog(f, title,    FileDialog.SAVE);
    fd.setFile(fileType);
    fd.setDirectory(defDir);
    fd.setLocation(50, 50);
    fd.show();
    return fd.getFile();
    }*/
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("Get Code"))
repaint();
if(s.equals("Save Code"))
{
//saveFile(new Frame(),"Save",".\\","*.txt");
fd=new FileDialog(new Frame(),"Save File",FileDialog.SAVE);
fd.setFile("*.txt");
fd.show();
int state=FileDialog.SAVE;
String curFile;
            if ((curFile = fd.getFile()) != null) 
			{
                String filename = fd.getDirectory() + curFile;
                // curFile ends in .*.* if file does not exist
				byte[] data=new byte[1];
                //setCursor (Frame.WAIT_CURSOR);s
				if(state==FileDialog.SAVE)
				{
                 if (filename.indexOf (".*.*") != -1) {
                        filename = filename.substring (0, filename.length()-4);
                    }
                    File f = new File (filename);
                    try {
			//RandomAccessReader fon=new RandomAccessReader(f,"rw");
                        FileOutputStream fon = new FileOutputStream (f);
                        String text = t.getText();
                        int textsize = text.length();
                        data = new byte[textsize];
                        text.getBytes (0, textsize, data, 0);
                        fon.write (data);
                        fon.close ();
                    } catch (IOException exc) {
                        String errorString = "IOException: " + filename;
                        data = new byte[errorString.length()];
                        errorString.getBytes (0, errorString.length(), data, 0);
                    }
                    myLabel.setText ("Save: " + filename);
					}
					t.setText (new String (data, 0));
                
             }   // Note - on successful save, text is redisplayed
            }    //setCursor (Frame.DEFAULT_CURSOR);

}
}  
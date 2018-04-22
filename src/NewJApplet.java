import javax.swing.JApplet;
import javax.swing.JTextArea; 
import java.awt.Container;

public class NewJApplet extends JApplet {

    public void init() {
        
        JTextArea ta=new JTextArea(); 
 Container con=getContentPane(); 
 con.add(ta); 
 ta.setText("ΤΕΛΕΙΟΙ ΑΡΙΘΜΟΙ\n"); 
 for (int i=2;i<100000;i++) 
 { 
     String s; 
 String r=perfect(i); showStatus("Checking number: " + i); 
 if (r.equals("")==false) 
 {s="Αριθμός: " + i + "\tΠαράγοντες: " + r+"\n"; 
 ta.append(s);}
 }
     
    }
public String perfect(int x) 

        
{
int sum=0; 
 String fs=""; 
 for (int i=1;i<x-1;i++) 
if (x%i==0) {sum+=i; fs=fs + i+ " ";} 
 if (x==sum) 
 return fs; 
 else 
 return ""; 


}
   
}

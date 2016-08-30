package iadt.creative;
/*
 * Keyboard input library
 * v0.4
 * Andrew Errity 1/10/15
 */
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Inputs{

  public static String readString(String textLabel){
    JTextField field  = new JTextField(20);
    JLabel label = new JLabel(textLabel);
    JPanel p = new JPanel(new BorderLayout(5, 2));
    p.add(label, BorderLayout.WEST);
    p.add(field);
    field.addAncestorListener( new RequestFocusListener() );
    JOptionPane.showMessageDialog(null, p, "Input required.", JOptionPane.PLAIN_MESSAGE, null);
   
    String in = field.getText();
    return in; 
  }
  
   public static byte readByte(String label){
    String in = readString(label);
    if (in == null) {
      //exit();
      return 0;
    }
    else
      return Byte.parseByte(in);
  }
  
   public static short readShort(String label){
    String in = readString(label);
    if (in == null) {
      //exit();
      return 0;
    }
    else
      return Short.parseShort(in);
  }
  
   public static int readInt(String label){
    String in = readString(label);
    if (in == null) {
      //exit();
      return 0;
    }
    else
      return Integer.parseInt(in);
  }
  
   public static long readLong(String label){
    String in = readString(label);
    if (in == null) {
      //exit();
      return 0;
    }
    else
      return Long.parseLong(in);
  }
  
   public static float readFloat(String label){
    String in = readString(label);
    if (in == null) {
      //exit();
      return 0;
    }
    else
      return Float.parseFloat(in);
  }
  
   public static double readDouble(String label){
    String in = readString(label);
    if (in == null) {
      //exit();
      return 0;
    }
    else
      return Double.parseDouble(in);
  }
  
   public static boolean readBoolean(String label){
    int in = JOptionPane.showConfirmDialog(null,label, "choose one", JOptionPane.YES_NO_OPTION);
    if (in == JOptionPane.YES_OPTION) 
      return true;
    else 
      return false;
  }
}

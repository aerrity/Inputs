/*
 * Keyboard Input Library
 * Andrew Errity v0.2 (2015-Oct-01)
 * GoToLoop v1.0 (2015-oct-22)
 */

//package iadt.creative;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Inputs {
  public static final String TITLE = "Input required!", CHOOSE = "Choose one:";
  public static final int CHARS = 25;

  public static final JTextField field = new JTextField(CHARS);
  public static final JLabel label = new JLabel();
  public static final JPanel panel = new JPanel(new BorderLayout(5, 2));

  static {
    panel.add(label, BorderLayout.WEST);
    panel.add(field);
  }

  public static final JDialog dialog = new JOptionPane(panel, QUESTION_MESSAGE) {
    @Override public void selectInitialValue() {
      field.requestFocusInWindow();
    }
  }
  .createDialog(null, TITLE);

  public static String readString(String txt) {
    label.setText(txt);
    field.setText("");

    dialog.setVisible(true);
    return field.getText();
  }

  public static boolean readBoolean(String label) {
    return showConfirmDialog(null, label, CHOOSE, YES_NO_OPTION) == YES_OPTION;
  }

  public static byte readByte(String label) {
    return readByte(label, Byte.MIN_VALUE);
  }

  public static byte readByte(String label, int failValue) {
    try {
      return Byte.parseByte(readString(label));
    }
    catch (NumberFormatException ex) {
      return (byte) failValue;
    }
  }

  public static short readShort(String label) {
    return readShort(label, Short.MIN_VALUE);
  }

  public static short readShort(String label, int failValue) {
    try {
      return Short.parseShort(readString(label));
    }
    catch (NumberFormatException ex) {
      return (short) failValue;
    }
  }

  public static int readInt(String label) {
    return readInt(label, Integer.MIN_VALUE);
  }

  public static int readInt(String label, int failValue) {
    try {
      return Integer.parseInt(readString(label));
    }
    catch (NumberFormatException ex) {
      return failValue;
    }
  }

  public static long readLong(String label) {
    return readLong(label, Long.MIN_VALUE);
  }

  public static long readLong(String label, long failValue) {
    try {
      return Long.parseLong(readString(label));
    }
    catch (NumberFormatException ex) {
      return failValue;
    }
  }

  public static float readFloat(String label) {
    return readFloat(label, Float.MIN_VALUE);
  }

  public static float readFloat(String label, float failValue) {
    try {
      return Float.parseFloat(readString(label));
    }
    catch (NumberFormatException ex) {
      return failValue;
    }
  }

  public static double readDouble(String label) {
    return readDouble(label, Double.MIN_VALUE);
  }

  public static double readDouble(String label, double failValue) {
    try {
      return Double.parseDouble(readString(label));
    }
    catch (NumberFormatException ex) {
      return failValue;
    }
  }
}

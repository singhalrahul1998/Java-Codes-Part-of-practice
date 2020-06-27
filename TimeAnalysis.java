import javax.swing.*;
class TimeAnalysis
{
  public static void main(String ahxasbj[])
  {
     String sec;
     int hours,min,seconds;
     int SEC;
     sec = JOptionPane.showInputDialog("Enter the no. of seconds");
     SEC=Integer.parseInt(sec);
     hours=SEC/3600;
     min=(SEC%3600)/60;
     seconds=((SEC%3600)%60);
     JOptionPane.showMessageDialog(null,"Click OK to get number of Hours");
     JOptionPane.showMessageDialog(null,String.valueOf(hours));
     JOptionPane.showMessageDialog(null,"Click OK to get number of minutes");
     JOptionPane.showMessageDialog(null,String.valueOf(min));
     JOptionPane.showMessageDialog(null,"Click OK to get number of seconds ");
     JOptionPane.showMessageDialog(null,String.valueOf(seconds));
     
  }
}
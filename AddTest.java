import javax.swing.*;
class AddTest
{
   public static void main(String cascwe[])
   {
        String a,b;
        int answer;
        a=JOptionPane.showInputDialog("Enter the first value");
        b=JOptionPane.showInputDialog("Enter the second value");
        answer=Integer.parseInt(a)+Integer.parseInt(b);
        //JoptionPane.showMessageDialog(null,"the sum is");
        JOptionPane.showMessageDialog(null,String.valueOf(answer));
   }
}
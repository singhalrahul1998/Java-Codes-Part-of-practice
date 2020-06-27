import java.util.*;
class Vowels
{
  public static void main(String vsb[])
  {
     Scanner obj = new Scanner(System.in);
     char ch=obj.next().charAt(0);
     switch(ch)
     {
        case 'A':System.out.println("Vowel");
        break;
        case 'E':System.out.println("Vowel");
        break;
        case 'I':System.out.println("Vowel");
        break;
        case 'O':System.out.println("Vowel");
        break;
        case 'U':System.out.println("Vowel");
        break;
        default: System.out.println("Consonant");
        break;
     }
  }
}
import java.util.Scanner;
import java.util.Stack;

public class BalncedParentheses
{

    public static void main(String[] args)
    {
        Stack <Character> s=new Stack<Character>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        int a=0;
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)=='(')||(str.charAt(i)=='{')||(str.charAt(i)=='['))
            {
                s.push(str.charAt(i));
            }
            else if((str.charAt(i)==')'))
            {
                char p=s.pop();
                if(p!='(')
                {
                    a++;
                    break;
                }
            }
             else if((str.charAt(i)=='}'))
            {
                char p=s.pop();
                if(p!='{')
                {
                    a++;
                    break;
                }
            }
             else if((str.charAt(i)==']'))
            {
                char p=s.pop();
                if(p!='[')
                {
                    a++;
                    break;
                }
            }
        }
        if(a==0 && s.isEmpty())
        {
            System.out.println("Balanced Parantheses");
        }
        else
        {
            System.out.println("Unbalanced Parantheses");
        }
    }
}

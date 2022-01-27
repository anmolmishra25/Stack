import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String []anmol) throws FileNotFoundException
    {
        Scanner s=new Scanner(System.in);
        int decision,element;
        System.out.println("enter the size of the stack");
        element=s.nextInt();
        Stack st=new Stack(element);
        while(true)
        {
            System.out.println("");
            System.out.println("press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for peek element");
            System.out.println("press 4 for search");
            System.out.println("press 5 for traverse");
            System.out.println("press 6 for exit");
            decision=s.nextInt();
            switch (decision)
            {
                case 1:
                    System.out.println("enter the element");
                    element=s.nextInt();
                    st.push(element);
                    break;
                case 2:
                    element=st.pop();
                    System.out.println("the deleted element is " + element);
                    break;
                case 3:
                    element=st.peek();
                    System.out.println("the peek element is " + element);
                    break;
                case 4:
                    System.out.println("enter the element to find");
                    element=s.nextInt();
                    System.out.println("the element is at " + st.search(element));
                    break;
                case 5:
                    st.traverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}

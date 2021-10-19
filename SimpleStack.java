import java.util.Scanner;

/* Lab 07- Data Structures- This class shows one form of code for Stacks
 * @author: Nashiha Ahmed
 * @version: 05/ 05/ 15
 */

public class SimpleStack extends SimpleLinkedList //a Stack is a Single-Linked List
{
    //properties 
    SimpleLinkedList list;
    
    //constructor
    public  SimpleStack()
    {
        list = new SimpleLinkedList();
    }
    
    //methods
    //isEmpty method uses list's isEmpty method
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    //push method uses list's addToHead method
    public void push( String item)
    {
        list.addToHead( item);
    }
    //pop method uses list's removeFromHead method
    public String pop()
    {
        return list.removeFromHead();
    }
    
    //postFix static method
    public static int postFix( String s, SimpleStack stack )
    {
        //variables
        int a;
        int b;
        int c;
        String tmp;
        //code
        for( int i = 0; i < s.length(); i++)
        {
            //1. if it is a number push it on the stack
            if( Character.isDigit( s.charAt(i)))
            {
                stack.push( Character.toString( s.charAt(i)));
            }
            //2.Pop the top two numbers from the stack, apply the operator to them and
            // push the result back onto the stack
            else if( s.charAt(i) == '+')
            {
                a = Integer.parseInt( stack.pop());
                b = Integer.parseInt( stack.pop());
                c = a + b;
                tmp = Integer.toString(c);
                stack.push( tmp);
            }
            else if( s.charAt(i) == '-')
            {
                a = Integer.parseInt( stack.pop());
                b = Integer.parseInt( stack.pop());
                c = b - a;
                tmp = Integer.toString(c);
                stack.push( tmp);
            }
            else if( s.charAt(i) == '*')
            {
                a = Integer.parseInt( stack.pop());
                b = Integer.parseInt( stack.pop());
                c = a * b;
                tmp = Integer.toString(c);
                stack.push( tmp);
            }
            else if( s.charAt(i) == '/')
            {
                a = Integer.parseInt( stack.pop());
                b = Integer.parseInt( stack.pop());
                c = (int) a / b;
                tmp = Integer.toString(c);
                stack.push( tmp);
            }
        } 
        //After all tokens have been processed, pop the result from the stack.
        return Integer.parseInt( stack.pop());
    }
    
    
    //main method- trial method
    public static void main( String[] args)
    {
        //variables
        SimpleStack stack;
        String s;
        Scanner scan;
        //1. Create a stack
        stack = new SimpleStack();
        //2. Ask user for string
        scan = new Scanner( System.in);
        s = scan.nextLine();
        //3. Print answer for postFix
        System.out.println( "Answer: " + postFix( s, stack));
    }
}

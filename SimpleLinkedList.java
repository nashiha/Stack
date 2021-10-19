/* Lab 07- Data Structures- This class shows one form of code for Singly Linked Lists
 * @author: Nashiha Ahmed
 * @version: 05/ 05/ 15
 */

public class SimpleLinkedList
{
    //inner class- Node class
    public class Node
    {
        String item;
        Node next;
        
        public Node( String item, Node next)
        {
            this.item = item;
            this.next = next;
        }
    }
    
    //properties
    Node head;
    
    //constructor
    public SimpleLinkedList()
    {
        //1. Create an empty list
        head = null;
    }
    
    //methods
    //adds to the beginning of the SimpleLinkedList
    public void addToHead( String item)
    {
        Node tmp;
        tmp = new Node( item, head);
        head = tmp;
    }  
    //removes from beginning of list
    public String removeFromHead()
    {
        Node tmp;
        tmp = head;
        head = head.next; 
        return tmp.item;
    }
    //returns true if list isEmpty and false if it is not
    public boolean isEmpty()
    {
        return ( head == null);

    }
    //gets the data at the index given 
    public String get( int index)
    {
        Node tmp;
        tmp = head;
        for( int i = 0; i < index; i++)
        {
            if( tmp.next == null)
                return null;
            tmp = tmp.next;
        }
        return tmp.item;
    }
    //prints the information in the list
    public String toString()
    {
        Node tmp;
        String s;
        tmp = head;
        s = "";
        while( tmp != null)
        {
            if( tmp.next == null)
            {
                s = s + tmp.item + ".";
            }
            else
            {
                s = s + tmp.item + ", ";
            }
            tmp = tmp.next;
        }
        return s;
    }
   
    
    //main method
    public static void main( String[] args)
    {
        //objects
        SimpleLinkedList list;
        SimpleLinkedList list2;
        SimpleLinkedList list3;
        
        //code
        //1. Create lists
        list = new SimpleLinkedList();
        list2 = new SimpleLinkedList();
        list3 = new SimpleLinkedList();
        //2. Add to list 1
        list.addToHead( "Mantis Shrimp");
        list.addToHead( "Pink Fairy Armadillo");
        list.addToHead( "Pleasing Fungus Beetle");
        list.addToHead( "Satanic Leaf-Tailed Gecko");
        list.addToHead( "Tasseled Wobbegong");
        list.addToHead( "Chicken Turtle");
        //2.1 Print list1
        System.out.println( "List of Animals: " + list.toString());
        //3. Add to list2
        list2.addToHead( "Percy");
        list2.addToHead( "Annabeth");
        list2.addToHead( "Jason");
        list2.addToHead( "Piper");
        list2.addToHead( "Leo");
        list2.addToHead( "Frank");      
        list2.addToHead( "Hazel");
        //3.1 Print list2
        System.out.println( "The 7 of Percy Jackson: " + list2.toString());
        //4. Try isEmpty method with lists 2 and 3
        System.out.println( "List2 is empty: " + list2.isEmpty());
        System.out.println( "List3 is empty: " + list3.isEmpty());
        //5. Try remove method with list 2
        //5.1 Print removed item
        System.out.println( "Removed item:" + list2.removeFromHead());
        //5.2 Print list
        System.out.println( "The 6 of Percy Jackson: " + list2.toString());
        //6 Try get method with list2 
        System.out.println( list2.get( 3));
        System.out.println( list2.get( 5));     
        System.out.println( list2.get( 6));   
    }
}

/**
 *
 * @author savannah
 */
public class LinkedString implements project3Interface {
    
    private static class Node{
        char data;
        Node next;
        
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int length;
    
    public LinkedString(char[] value){
        if(value == null || value.length == 0){
            head = null;
            length = 0;
            return;
        }
       head = new Node(value[0]);
       Node current = head;
       length = 1;
       
       for(int i = 1; i < value.length; i++){
           current.next = new Node(value[i]);
           current = current.next;
           length++;
       }
    }
   
    public LinkedString(String original){
        this(original.toCharArray());
    }
    @Override
    public char charAt(int index){
    if(index < 0 || index >= length) {
        throw new IllegalArgumentException("Index out of bounds");
    }
    
    Node current = head;
    for(int i = 0; i < index; i++){
        current = current.next;
    }
    return current.data;
}
    @Override
    public LinkedString concat(LinkedString str){
        if(str == null){
            return this;
        }
        char[] combined = new char[this.length + str.length];
        Node current = this.head;
        int i = 0;
        while(current != null){
            combined[i++] = current.data;
            current = current.next;
        }

        current = str.head;
        while (current != null) {
            combined[i++] = current.data;
            current = current.next;
        }

        return new LinkedString(combined);
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public int length() {
        return length;
    }


    @Override
    public LinkedString substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > length || beginIndex > endIndex) {
            throw new IllegalArgumentException("Invalid");
        }

        char[] subChars = new char[endIndex - beginIndex];
        Node current = head;

        for (int i = 0; i < beginIndex; i++) {
            current = current.next;
        }

        for (int i = 0; i < subChars.length; i++) {
            subChars[i] = current.data;
            current = current.next;
        }

        return new LinkedString(subChars);
    }

        
}

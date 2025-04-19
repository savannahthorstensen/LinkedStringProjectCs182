/**
 *
 * @author savannah
 */
public class project3tester {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        char[] happyArray = {'H', 'a', 'p', 'p', 'y'};
        LinkedString happy = new LinkedString(happyArray);

        LinkedString space = new LinkedString(" ");
        LinkedString birthday = new LinkedString("Birthday");
        LinkedString message = happy.concat(space).concat(birthday);
        System.out.println("Message length: " + message.length()); 
        System.out.print("Message characters: ");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
        }
        System.out.println(); 
        
        LinkedString sub1 = message.substring(0, 5);
        System.out.print("Substring (0, 5): ");
        for (int i = 0; i < sub1.length(); i++) {
            System.out.print(sub1.charAt(i));
        }
        System.out.println(); 

        LinkedString sub2 = message.substring(6, message.length());
        System.out.print("Substring (6, length): ");
        for (int i = 0; i < sub2.length(); i++) {
            System.out.print(sub2.charAt(i));
        }
        System.out.println(); 

        LinkedString empty = new LinkedString(new char[0]);
        System.out.println("Empty list actually empty? " + empty.isEmpty()); 
        System.out.println("Empty list length: " + empty.length()); 
    }
    }

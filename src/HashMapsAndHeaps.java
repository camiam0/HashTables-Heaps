import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HashMapsAndHeaps {

    Scanner console = new Scanner(System.in); // scanner for user input

    public static void main(String[] args) {

        HashMapsAndHeaps calculator = new HashMapsAndHeaps(); // calculator for commands
        calculator.mainMenu();
        calculator.closeConsole();

    }

    // method for user interface
    public void mainMenu() {

        // values for main menu
        boolean menuFlag = false;
        char menuInput = ' ';

        System.out.println("Welcome to the Hash Maps and Heaps user interface.");

        do {

            // terminal menu
            System.out.printf("Please type a command: %n" +
                              "   \"w\" to access the Hash Map.%n" +
                              "   \"e\" to access the Min-Heap.%n" +
                              "   \"q\" to quit the program.%n");
            
            // ensure a valid command is entered
            boolean validCommand = false;
            while (!validCommand) {

                if (console.hasNext()) {

                    menuInput = console.next().charAt(0);
                    validCommand = true;
                    
                } else {

                    System.err.println("Invalid input. Please enter a command.");
                    console.nextLine(); // clear buffer and reprompt

                }
            }
            
            // switch case for navigating program functions
            switch (menuInput) {
                
                case 'w': // access hash map
                    
                    hashMapMenu();
                    break;
                
                case 'e': // access min heap
                    
                    minHeapMenu();
                    break;

                case 'q': // quit the program
                    
                    System.out.println("Goodbye.");
                    menuFlag = true;
                    break;
                
                default:
                    
                    System.err.println("Invalid command. Please enter a valid option.");
                    break;
            
            }
        
        } while (!menuFlag);
    }

    public void hashMapMenu() {

        // create a hash map
        System.out.println("Initializing Hash Map...");
        Map<Integer, String> hashMap = new HashMap<>();
        
        // add some key-value pairs to the hash map
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Grape");

        System.out.println("Hash Map contents: " + hashMap); // print all entries in the hash map

        // values for hash map menu
        boolean menuFlag = false;
        char menuInput = ' ';

        do {

            // hash map terminal menu
            System.out.printf("Please type a command: %n" +
                              "   \"w\" to search for a key.%n" +
                              "   \"e\" to add a key.%n" +
                              "   \"r\" to remove a key.%n" +
                              "   \"q\" to exit to main menu.%n");
            
            // ensure a valid command is entered
            boolean validCommand = false;
            while (!validCommand) {

                if (console.hasNext()) {

                    menuInput = console.next().charAt(0);
                    validCommand = true;
                    
                } else {

                    System.err.println("Invalid input. Please enter a command.");
                    console.nextLine(); // clear buffer and reprompt

                }
            }
            
            // switch case for navigating hash map functions
            switch (menuInput) {
                
                case 'w': // search for a key
                    
                    // ask user for a key to search
                    System.out.print("Enter a key to search: ");
                    int key = console.nextInt();

                    // search for the key
                    if (hashMap.containsKey(key)) {
                        
                        System.out.println("Key " + key + " found with value: " + hashMap.get(key));
                    
                    } else {
                        
                        System.out.println("Key " + key + " not found.");
                    
                    }
                    break;
                
                case 'e': // add a key
                    
                    // ask user for a new key
                    System.out.print("Enter a key to add: ");
                    int newKey = console.nextInt();

                    // consume the newline left by nextInt()
                    console.nextLine();

                    // ask user for a value
                    System.out.print("Enter a value to associate with this key: ");
                    String newValue = console.nextLine();

                    // add the key-value pair
                    hashMap.put(newKey, newValue);
                    System.out.println("Added: Key " + newKey + " -> " + newValue);
                    System.out.println("Updated HashMap: " + hashMap);
                    break;

                case 'r': // remove a key
                    
                    // ask user for a key to remove
                    System.out.print("Enter a key to remove: ");
                    int keyToRemove = console.nextInt();

                    // remove key
                    if (hashMap.containsKey(keyToRemove)) {
                        
                        hashMap.remove(keyToRemove);
                        System.out.println("Key " + keyToRemove + " removed.");
                    
                    } else {
                    
                        System.out.println("Key not found.");
                    
                    }
            
                    System.out.println("Updated HashMap: " + hashMap);
                    break;

                case 'q': // return to main menu
                    
                    System.out.println("Returning to main menu.");
                    menuFlag = true;
                    break;
                
                default:
                    
                    System.err.println("Invalid command. Please enter a valid option.");
                    break;
            
            }
        
        } while (!menuFlag);
    }

    public void minHeapMenu() {

        // create a min heap
        System.out.println("Initializing Min-Heap...");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // insert some elements
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(1);

        System.out.println("Min-Heap contents: " + minHeap); // print all entries in the min heap

        // values for min heap menu
        boolean menuFlag = false;
        char menuInput = ' ';

        do {

            // min heap terminal menu
            System.out.printf("Please type a command: %n" +
                              "   \"w\" to print all heap elements.%n" +
                              "   \"e\" to view the root (smallest element).%n" +
                              "   \"r\" to add an element.%n" +
                              "   \"t\" to remove an element.%n" +
                              "   \"q\" to exit to main menu.%n");
            
            // ensure a valid command is entered
            boolean validCommand = false;
            while (!validCommand) {

                if (console.hasNext()) {

                    menuInput = console.next().charAt(0);
                    validCommand = true;
                    
                } else {

                    System.err.println("Invalid input. Please enter a command.");
                    console.nextLine(); // clear buffer and reprompt

                }
            }
            
            // switch case for navigating min heap functions
            switch (menuInput) {
                
                case 'w': // print all elements
                    
                    System.out.println("Min-Heap contents: " + minHeap);
                    break;
                
                case 'e': // view the root (smallest element)
                    
                    if (!minHeap.isEmpty()) {
                    
                        System.out.println("The smallest element is: " + minHeap.peek());
                    
                    } else {
                    
                        System.out.println("The heap is empty.");
                    
                    }
                    break;

                case 'r': // insert an element
                    
                    System.out.print("Enter a number to insert into the heap: ");
                    while (!console.hasNextInt()) {
                    
                        System.err.println("Invalid input. Please enter an integer.");
                        console.next(); // Discard invalid input
                    
                    }
                    
                    int num = console.nextInt();
                    minHeap.add(num);
                    System.out.println("Inserted " + num + " into the heap.");
                    break;
                
                case 't': // remove an element
                    
                    if (!minHeap.isEmpty()) {

                        int removed = minHeap.poll();
                        System.out.println("Removed " + removed + " from the heap.");

                    } else {

                        System.out.println("The heap is empty, nothing to remove.");

                    }
                    break;
                
                case 'q': // return to main menu
                    
                    System.out.println("Returning to main menu.");
                    menuFlag = true;
                    break;
                
                default:
                    
                    System.err.println("Invalid command. Please enter a valid option.");
                    break;
            
            }
        
        } while (!menuFlag);
    }

    // scanner closing method
    public void closeConsole() {console.close();}
}
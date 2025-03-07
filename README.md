# Hash Maps and Heaps in Java by Cameron Bartlett

## Overview
This Java program demonstrates the use of **HashMaps** and **Heaps** using Java's built-in `HashMap` and `PriorityQueue` classes. The program allows users to interact with both data structures via a **menu-driven interface**, performing key operations like insertion, retrieval, and deletion.

## Features
### **HashMap Functionality**
- **Search for a key** (`O(1)` average time complexity)
- **Insert a key-value pair**
- **Remove a key**
- **Display the entire HashMap**

### **Heap Functionality (Min-Heap)**
- **Insert elements into the heap** (`O(log n)`)
- **View the smallest element** (`O(1)`)
- **Remove the smallest element** (`O(log n)`)
- **Display all elements in the heap**

## Installation & Execution
### **Prerequisites**
- Java **JDK 8+** installed
- A terminal or IDE to compile and run the program

### **How to Run**
1. **Compile the program.**
2. **Run the program.**
3. **Follow the on-screen menu instructions.**

## Usage
### **Main Menu Options**
| Command | Description |
|---------|-------------|
| `w` | Access the HashMap operations |
| `e` | Access the Min-Heap operations |
| `q` | Quit the program |

### **HashMap Menu Options**
| Command | Description |
|---------|-------------|
| `w` | Search for a key |
| `e` | Add a key-value pair |
| `r` | Remove a key |
| `q` | Return to the main menu |

### **Min-Heap Menu Options**
| Command | Description |
|---------|-------------|
| `w` | Print all heap elements |
| `e` | View the smallest element |
| `r` | Insert an element into the heap |
| `t` | Remove the smallest element |
| `q` | Return to the main menu |

## Notes
- The program **ensures persistent data** for the heap, meaning inserted elements remain available throughout the session.
- Error handling is included to prevent crashes due to invalid input.

## Future Improvements
- **Exception Handling Enhancements** (e.g., handling duplicate keys in HashMap)
- **Adding a Max-Heap Option** using a custom comparator
- **Saving Data to a File** for persistence beyond program execution
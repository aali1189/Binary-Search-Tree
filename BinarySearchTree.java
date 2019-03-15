
import java.util.*;
public class BinarySearchTree {
    private static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> nodes = new ArrayList<Integer>();

   
    static void display() {
    	 for(int i =0; i<nodes.size();i++) {
         	if(i==nodes.size()-1) {
         		System.out.print(nodes.get(i));
         	}else {
         		System.out.print(nodes.get(i) + ",");
         	}
         	
         }	
    	 System.out.println();
    	option();
    }
    
    static void insert() {
    	System.out.println("\nInsert a node: ");
        nodes.add(sc.nextInt());
        System.out.println("THE ELEMENTS IN THE BINARY TREE ARE: ");
        display();	
    }
    
    static void delete() {
    	 System.out.println("Delete a node: ");
         int target = sc.nextInt();
         for(int i =0; i<nodes.size();i++) {
         	if(target == nodes.get(i)) {
         		nodes.remove(i);
         		break;
         	}
         } 
         System.out.println("THE ELEMENTS IN THE BINARY TREE ARE: ");
         display();
    }
    
    
    static void search() {
    	
    	 System.out.println("Search a node: ");
         int target = sc.nextInt();
         for(int i =0; i<nodes.size();i++) {
         	if(target == nodes.get(i)) {
         		 System.out.print("\nTHE ELEMENT IN THE BINARY TREE IS: " + nodes.get(i));
         	}else {
        		 System.out.print("THE ELEMENT IN THE BINARY TREE IS NOT FOUND\n");
             break;
         	}
         }
         System.out.println("THE ELEMENTS IN THE BINARY TREE ARE: ");
         display();
    	
    }
    
    
    static void option() {
        System.out.println("INSERT[1], DELETE[2], SEARCH[3], EXIT[4]");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    insert();
                    break;
                case 2:
                   delete();
                    break;
                case 3:
                	search();
                   break;
                   
                case 4:
                	break;
                	
                	
                	default:
                		option();
                		break;
            }
        }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("BINARY SEARCH TREE \n" +
                "Enter a series of nodes: ");
        
       
       for(int i =0; i<8; i++) {
    	   System.out.print((i+1)+" : ");
    	   nodes.add(sc.nextInt());
       }
        System.out.println("The nodes in the binary Search tree are: ");
        display();
        option();
        System.out.println();

     
        }
    }

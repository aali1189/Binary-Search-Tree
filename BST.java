
import java.util.*;
public class BST {
	static Scanner sc = new Scanner(System.in);
   
    void display(ArrayList<Integer> nodes) {
        System.out.println("\nTHE ELEMENTS IN THE BINARY TREE ARE: ");
    	 for(int i =0; i<nodes.size();i++) {
         	if(i==nodes.size()-1) {
         		System.out.print(nodes.get(i));
         	}else {
         		System.out.print(nodes.get(i) + ",");
         	}
         	
         }	
    	option(nodes);
    }
    
     void insert(ArrayList<Integer> nodes) {
    	System.out.println("\nInsert a node: ");
        nodes.add(sc.nextInt());
        display(nodes);	
    }
    
     void delete(ArrayList<Integer> nodes) {
    	 System.out.println("\nDelete a node: ");
         int key = sc.nextInt();
         for(int i =0; i<nodes.size();i++) {
         	if(key == nodes.get(i)) {
         		 System.out.print("\nTHE ELEMENT IN THE BINARY TREE IS DELETED : ");
         		nodes.remove(i);
         		
         		break;
         	}
         } 
         display(nodes);
    }
    
    
    void search(ArrayList<Integer> nodes) {
    	
    	 System.out.println("\nSearch a node: ");
        int key = sc.nextInt();
         for(int i =0; i<nodes.size();i++) {
         	if(key == nodes.get(i)) {
         		 System.out.print("\nTHE ELEMENT IN THE BINARY TREE IS: " + nodes.get(i) + "\n");
         		 break;
         	}else {
        		 System.out.print("THE ELEMENT IN THE BINARY TREE IS NOT FOUND\n");
             break;
         	}
         }
         display(nodes);
    	
    }
    
    
     void option(ArrayList<Integer> nodes) {
        System.out.println("\nInsert[1] Delete[2], Seach[3], Exit[4]");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    insert(nodes);
                    break;
                case 2:
                   delete(nodes);
                    break;
                case 3:
                	search(nodes);
                   break;
                   
                case 4:
                	System.exit(0);
                	break;
                	
                	
                	default:
                		option(nodes);
                		break;
            }
        }
     
     void series(ArrayList<Integer> nodes) {
    	 System.out.println("BINARY SEARCH TREE \nEnter a series of nodes: ");
        for(int i =0; i<8; i++) {
     	   System.out.print((i+1)+" : ");
     	   nodes.add(sc.nextInt());
        } 
        display(nodes); 
     }
     BST(ArrayList<Integer> nodes){
    	 series(nodes);
     }
     
    public static void main(String[] args) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        
        new BST(nodes);
     
   
     
        }
    }

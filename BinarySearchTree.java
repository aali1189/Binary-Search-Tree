import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author USER
 */
public class BinarySearchTree {
    static List<String> BTS = new ArrayList<>();
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static int[] ard;//Array for DATA
    static int s = 0;
    static Scanner scan = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    
    static void level(int lvl) { 
        int l = (int) Math.pow(2, lvl);
        for (int i = 1; i <= l; i++) {
            BTS.add(null);
        }
    }
   
    
    static int newnd(int nd, int inc){
        
        int nod = (nd*2) + inc;
        return nod;
        
    }
    
    
    static void insertion() {
    	BTS.clear();
    	int size = ard.length+1;
    	s= size;
    	ard = new int[size];    	
for(int i =0; i<arr.size();i++) {
    		ard[i] = arr.get(i);
    	}
    	System.out.print("\nEnter the element : ");
    	ard[(ard.length-1)]= scan.nextInt();
    	
    	process();
    	
    	
    
    }
    
    
    static void deletion() {
    	BTS.clear();
    	int size = ard.length-1;
    	s= size;
    	System.out.print("\nEnter the element : ");
    	int num = scan.nextInt();
for(int i =0; i<arr.size();i++) {
    		if(num == arr.get(i)) {
    			arr.remove(i);
    			break;
    		}
    	    	}
    	
    	ard = new int[size];
    	
for(int i =0; i<arr.size();i++) {
    		ard[i] = arr.get(i);
    	}
        
    	process();
    	
    	
    
    }
    
    
    
    public static void main(String[] args) {
        //declaration of variables
       
        
        //Number of input
        System.out.print("Enter Array Size : ");
        s = scan.nextInt();
        
        //Reinitialization of array for DATA
        ard = new int[s];
        
        //Input for the data
        
        for (int i = 0; i < s; i++) {
        	System.out.print("Enter Array Element "+(i+1)+" : ");  
        	int num = scan.nextInt();
           ard[i] = num;
          arr.add(num);
        }
        
        //Display of INPUT
       System.out.print("\n The inputs are: [");
        
        for(int i = 0; i < s; i++){
            if(i == s-1) {
           System.out.print(ard[i]);
            }else {
            	System.out.print(ard[i] + ", ");
            }
           
       }
        System.out.print("]");
        //Insertion of DATA to BTS
       
       
       
       process();        
    }
    
    
    static void options() {
        System.out.println("\nInsert[1] Delete[2] Exit[3]");
    	int op = scan.nextInt();
    	switch(op) {
    	
    	case 1:
    		insertion();
    		break;
    		
    	case 2:
    		deletion();
    		break;
    		
    	case 3:
    		System.exit(0);
    		break;
    		
    		default:
    			break;
    	
    	}
    }
    
    
    static void process() {
    	 int lvl,nd;
         String el;
         lvl = 0;
    	 for (int i = 0; i < s; i++) {
             el = String.valueOf(ard[i]);
             nd = 0;
             
             //Checking if BTS is Empty
             
             if (BTS.isEmpty()){
                 //If it is empty put the first value in the first node(Root Node)
                 BTS.add(el);
                 
                 
             }else{
                 
                 //Infinite loop for comparing
                 while(true){
                     
                     //Comparing
                     if (ard[i] <= Integer.parseInt(BTS.get(nd))) {//Value is LESS THAN the node
                         
                         nd = newnd(nd,1);//Getting new node
                         
                         if (nd >= BTS.size()) {
                             //Adding new levels for the tree
                             lvl ++;
                             level(lvl);
                             
                         
                         }
                         
                         if (BTS.get(nd) == null) {//If the node is a null then put the value else continue to compare
                             
                             BTS.set(nd, el);
                             break;
                             
                         }
                         
                     }else {//value is GREATER THAN the node
                         
                         nd = newnd(nd,2);
                         
                         if (nd >= BTS.size()) {   
                             lvl ++;
                             level(lvl);     
                         }
                         
                         if (BTS.get(nd) == null) {
                             
                             BTS.set(nd, el);
                             break;
                             
                         }
                     }
                     
                 } //  End comparing
                 
             }
                  
         }
    	 display();
    }
    
    
    static void display() {
    	 
        //Display of the BTS
        System.out.print("\n This is the array: \n");
        for (int i = 0; i < BTS.size(); i++) {
        	if(i==BTS.size()-1) {
                System.out.print(BTS.get(i) + "(" + i +")\n");

        	}else {
            System.out.print(BTS.get(i) + "(" + i +")" + ", ");
        	}
        }
        
        options();
    }
    
    
}
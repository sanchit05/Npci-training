import java.util.*;
public class SortAsc {    
    public static void main(String[] args) {  
    
    	Scanner sc = new Scanner(System.in);      
            
        //Initialize array     
        int [] arr = new int [] {5, 5, 2, 8, 7, 1};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }  
        
        System.out.println("Enter Element you want to Search");
        int n = sc.nextInt();  
        
        System.out.println("Choose case 1 or 2: ");
        int choose = sc.nextInt();
        
        
        switch(choose){
        	case 1:
        		for (int i = 0; i < arr.length; i++) {     
            			if(arr[i] == n){
            				System.out.print(i+", ");
            				break;
            			}
        		}
        		break;
        	case 2: 
        		for (int i = 0; i < arr.length; i++) {     
            			if(arr[i] == n){
            				System.out.print(i+", ");
            			}
        		}
        		break;
        	
        
         
     }   
    }    
}    

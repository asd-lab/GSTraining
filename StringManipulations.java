package misc;

import java.util.*;
import java.util.Map.Entry;
 
public class StringManipulations{
    
    public static void getFirstNonRepeated(String str){
        
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        
        for(char ch : str.toCharArray()){
            
            counts.put(ch,counts.containsKey(ch)?counts.get(ch)+1 :1);
        }
        
        for(Map.Entry<Character,Integer> entry : counts.entrySet()){
            
            if(entry.getValue()==1){
                System.out.println("First non repeated character in given string is : "+entry.getKey());
                break;
            }
        }
    }
    
    public static void getFirstRepeated(String str){
        
        
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        
        for(Character ch : str.toCharArray()){
            
            counts.put(ch,counts.containsKey(ch)?counts.get(ch)+1 :1);
        }
        
        for(Entry<Character, Integer> entry : counts.entrySet()){
            
            if(entry.getValue()>1){
            	System.out.println("First repeated character in given string is : "+entry.getKey());
            	break;
            }
        }
    }
    
    public static void getLastRepeated(String str){
        
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        char rptChar=' ';
        
        for(char ch : str.toCharArray()){
            
            counts.put(ch,counts.containsKey(ch)?counts.get(ch)+1 :1);
        }
        
        for (int i = str.length()-1; i >=0 ; i--) {
            
            if(counts.get(str.charAt(i))>1){
                rptChar = str.charAt(i);
                break;
            }
        
        }
        System.out.println("Last repeated character in given string is : "+rptChar);
    }
    
    public static void getLastNonRepeated(String str){
        
        
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        char rptChar=' ';
        
        for(char ch : str.toCharArray()){
            
            counts.put(ch,counts.containsKey(ch)?counts.get(ch)+1 :1);
        }
        
        for (int i = str.length()-1; i >=0 ; i--) {
            
            if(counts.get(str.charAt(i))==1){
                rptChar = str.charAt(i);
                break;
            }
        
        }
        System.out.println("Last non repeated character in given string is : "+rptChar);
    }
    
    public static char getMostRepeated (String str){
    
        final int ASCII_SIZE = 256; 
        int count[] = new int[ASCII_SIZE]; 
       
        int len = str.length(); 
        for (int i=0; i<len; i++) 
            count[str.charAt(i)]++; 
       
        int max = -1;  
        char result = ' ';
       
        for (int i = 0; i < len; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
       
        return result; 
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String\n");
        
        String st = sc.next();
        
        System.out.println("\nselect option\n\n 1.Get First non repeated character\n\n 2.Get first repeated character\n\n 3. Get last repeated character\n\n 4. Get last non repeated character:\n\n 5. Get most repeated charatcer:\n ");
        int n = sc.nextInt();
        
        switch(n){
            
            case 1 : getFirstNonRepeated(st);
                    
                    break;
            case 2 :  getFirstRepeated(st);
                    
                    break;
            case 3 : getLastRepeated(st);
                    
                    break;
            case 4 : getLastNonRepeated(st);
                    
                    break;
            case 5 : char ch =  getMostRepeated(st);
            		System.out.println("Most repeated character in given string is : "+ch);
                    
                    break;
            default : System.out.println("Please choose correct option!!");
            
        }
        sc.close();
        
    }
    
    
    
}

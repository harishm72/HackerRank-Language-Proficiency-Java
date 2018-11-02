import java.util.Scanner;

public class Solution {
static boolean isAnagram(String a, String b) { 
            // returns directly not anagrams if two strings are of variable length
            if(a.length() != b.length())
                        return false;
          char[] ar = a.toLowerCase().toCharArray();
          char[] br = b.toLowerCase().toCharArray();
          java.util.HashMap<Character,Integer> amap = new java.util.HashMap<Character,Integer>();
          java.util.HashMap<Character,Integer> bmap = new java.util.HashMap<Character,Integer>();
        
          for(char i:ar){
              // if map doesn't contains the key, we insert key now and set its value to be 1
              if(!amap.containsKey(i)){
                  amap.put(i, 1);
              }
              // if map already contains the key, we just increase the value of 
            //that particular key by 1   
              else if(amap.containsKey(i)){
                  amap.put(i, amap.get(i)+1);
              }
          }  // first for close
          for(char i:br){
              if(!bmap.containsKey(i)){   
                  bmap.put(i, 1);
              }           
              else if(amap.containsKey(i)){
                  bmap.put(i, bmap.get(i)+1);
              }
          }  // second for close
          if (amap.equals(bmap))
              return true;
          return false;
    }
      public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

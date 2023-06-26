// Ques 2 : Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1
// language : java 
public class learning {

    public static void main(String[] args)
    {
      // Example string 
      String s = "aaqgdfhrtqfagbdghrgggzbbx"; // ans for this -> 8
       int result = -1 ; // result 
       char letter = 'A'; // repeated letter
     one:  for(int j = 0 ; j < s.length() ; j++){
       two: for(int k = j +1 ; k< s.length() ; k++){
           if(letter == s.charAt(j)){
            break two;
           }
        if(s.charAt(j) == s.charAt(k)){
                letter = s.charAt(j);
                result = -1 ;
                break two;
            }else{
                result = j;
            }
        }
        if(result != -1){
            break one ;
        }
      }
      
    System.out.println(result);
    }
}	   

// Note :  This is a solution that I have done in vs code and tested for several strings 




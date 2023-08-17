public class Solution{
    
    public static int countWords(String str) {	
		
        int n = str.length();
        if(n==0){
            return 0;
        }
        int count = 1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
    return count;
	}
   
    public static void main(String[] args) {
        String str = "hi saksham";
        int noOfWords = countWords(str);
        System.out.println(noOfWords); //output 2
    }
}
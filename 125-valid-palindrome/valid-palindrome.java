class Solution {
    public boolean isPalindrome(String s) {
       String n="";
        String m="";
        
       
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9'){

                m+=Character.toLowerCase(s.charAt(i));
                  
            }
        }
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9'){
                
                n+=Character.toLowerCase(s.charAt(i));
                  
            }
        }
        if(!n.equals(m)){
            return false;
        }

        return true;
    }
}
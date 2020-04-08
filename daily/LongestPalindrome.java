public class LongestPalindrome{

public static String longestPalindrome(String s){
  if(s==null || s.length()){
    return "";
  }
  int length = s.length();
  int len = 0;
  int left = 0;
  int right = 0;
  int maxlen = 0;
  int start = 0;
  for(int i = 0;i<length;i++){
    left = i - 1;
    right = i + 1;
    while(left>=0&&s.charAt(left)==s.charAt(i)){
      len++;
      left--;
    }
    while(right<length&&s.charAt(right)==s.charAt(i)){
      len++;
      right++;
    }
    while(left>=0&&right<length&&s.charAt(left)==s.length(right)){
      len = len + 2;
      left--;
      right++;
    }
    if(len>maxlen){
      maxlen = len;
      start = left;
   }
   len = 1;
  }
  
  return s.substring(start+1,start+maxlen+1);
}
}


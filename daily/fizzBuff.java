class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>();
        
       
        
        for(int i = 1;i <= n;i++){
             String tempStr = "";
            if(i%3 == 0){
                tempStr += "Fizz";
            }
            if(i%5 == 0){
                tempStr += "Buzz";
            }
            if(tempStr.equals("")){
                tempStr += Integer.toString(i);
            }
            array.add(tempStr);
        }
        
        return array;
    }
}


class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>();
        
        LinkedHashMap<Integer,String> FizzBuzz = new LinkedHashMap<Integer,String>(){
            {
                put(3,"Fizz");
                put(5,"Buzz");
            }  
        };
        
        for(int num = 1;num<=n;num++){
            String temp = "";
            
            for(Integer key : FizzBuzz.keySet()){
                if(num % key == 0){
                    temp += FizzBuzz.get(key);
                }
               
            }
            
            if(temp.equals("")){
                    temp += Integer.toString(num);
                }
            
            array.add(temp);
        }
        
        return array;
    }
}

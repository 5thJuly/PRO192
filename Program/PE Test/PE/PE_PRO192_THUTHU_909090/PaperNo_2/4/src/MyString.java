

public class MyString implements IString{

    @Override
    public int f1(String string) {
        int count = 0;
        String words[] = string.split("\\s") ;
        for (String o : words) {
            //neu gia tri duoc nhap la 1 3 5 7 9 thi count++
            if(o.contains("1") || o.contains("3") || o.contains("5") || o.contains("7") || o.contains("9")) {
                count++ ;
            }
            
        }
        return count ;
    }

    @Override
    public String f2(String str) {
        
        int pos=-1;
        String[] s=str.split("\\s");
        for (int i=0; i<s.length; i++){
            if(check(s[i])){
               pos = i;
               break;
            }  
        }
        s[pos]="XX";
        String output="";
        for(int i=0; i<s.length; i++){
            output += s[i]+" ";
        }
        return output.trim();
       }
        public boolean check(String s){
            StringBuffer stringBuffer = new StringBuffer(s);
                if(stringBuffer.reverse().toString().equals(s)){
                    return true;
                }
        
                return false;
    }
}
    
    


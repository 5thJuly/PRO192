public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
        String split[] = str.split(" ");
        for (String o : split) {
            if(Character.isDigit(o.charAt(2))){
                count++;
            }
            
        }
        return count;
    }

    @Override
    public String f2(String str) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

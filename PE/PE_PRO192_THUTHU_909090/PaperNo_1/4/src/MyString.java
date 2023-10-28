
public class MyString implements IString{

    @Override
    public int f1(String string) {
        int count = 0;
        String words[] = string.split("\\s") ;
        for (String o : words) {
            if(o.contains("2") ||o.contains("4") ||o.contains("6")|| o.contains("8")) {
                count++;
            }
            
        }
        return count;
    }

    @Override
    public String f2(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

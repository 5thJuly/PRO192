
import java.util.*;



public class Store extends ArrayList<Product>{
    public void printAll(){
        if(this.isEmpty())System.out.println("Empty list!");
        else{
            System.out.println("Product  list:");
            for(Product Pr: this)System.out.println(Pr);
            System.out.println("Total:"+this.size()+"Product(s).");
        }
    }
    public Store() {
        super();
    }
    public Product search(String ID) {
        ID=ID.trim().toUpperCase();
        for(int i=0;i<this.size();i++)
            if(this.get(i).getID().equals(ID)) return this.get(i);
        return null;
    }
       private boolean isCodeDupplicated (String code) {
        code = code.trim().toUpperCase();
        return search(code)!=null;
    }
    public void addProduct() {
        String newID, newName;
        int number;
        double price;
        boolean codeDuplicated =false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("The ID of product ");
            newID = sc.nextLine();
          
      
            newID = newID.trim().toUpperCase();
            codeDuplicated = isCodeDupplicated(newID);
            if(codeDuplicated)System.out.print("The new ID is Duplicated!");
        }
        while(codeDuplicated==true);
        System.out.print("The name of product:");
        newName = sc.nextLine();
        newName = newName.toUpperCase();
        System.out.print("The number of product ");
        number = sc.nextInt();
        System.out.print("The price of product:");
        price = sc.nextInt();
        Product Pr  = new Product(newID, newName,price,number);
        this.add(Pr);
        System.out.println("\nThe Product " + newID +" has been added");
    }
    public void updateProduct(){
        if (this.isEmpty())
            System.out.println("Empty list. No update can be performed!");
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Input ID of updated product: ");
            String uID = sc.nextLine();
            Product pr = this.search(uID);
            if (pr == null)
                System.out.println("Product " + uID + " doesn't exist!");
            else{
                double oldPrice = pr.getValue();
                System.out.println("Old price: " + oldPrice + ", new price: ");
                double newPrice = sc.nextDouble();
                pr.setValue(newPrice);
                System.out.println("Product " + uID + " has been updated.");         
            }
        }
    }
    public void printList(){
        if(this.isEmpty())System.out.println("Empty list!");
        else{
            System.out.print("Product  list:");
            for(Product Pr: this) {
                if(Pr.getNumber()!=0)
                System.out.println(Pr);
           
            }
        }
            
    }
   
    public void SortAscending(ArrayList<Product> list) {
	Collections.sort(list, new Comparator<Product>() {
        @Override
	public int compare(Product o1, Product o2) {
            if (o1.getValue()- o2.getValue()> 0) {
                return 1;
            } 
            else if (o1.getValue() == o2.getValue()) {  
                return 0;
            } 
            else {
                return -1;
            }
        }
        });
	print(list);
    }
     public void print(ArrayList<Product> list) {
        if (this.isEmpty())
            System.out.println("Empty list!");
        else{
	    for (Product product : list) System.out.println(product);
        }
    }
        
    
}

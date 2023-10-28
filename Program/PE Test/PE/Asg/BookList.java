


import java.util.ArrayList;
import java.util.*;
public class BookList extends ArrayList<Book>{
    public BookList(){
        super();
    }
    public Book search(String code){
        code = code.trim().toUpperCase();
        for (int i=0; i<this.size(); i++)
            if (this.get(i).getCode().equals(code)) return this.get(i);
        return null;
    }
    public void searchBook(){
        if (this.isEmpty())
            System.out.println("Empty list. No search can be performed!");
        else{
            String sCode = Inputter.inputStr("Input book code for search: ");
            Book st = this.search(sCode);
            if (st == null)
                System.out.println("Not found!");
            else System.out.println("Found!");
        }
    }
    private boolean isCodeDupplicated(String code){
        code = code.trim().toUpperCase();
        return search(code)!=null;
    }
    public void addBook(){
        String newCode, newTitle;
        float newPrice;
        int newQuantity;
        boolean codeDupplicated = false;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                
                System.out.print("Code of new book: ");
                newCode = sc.nextLine();
                newCode = newCode.trim().toUpperCase();
                codeDupplicated = isCodeDupplicated(newCode);
                if (codeDupplicated) System.out.println("Code is dupplicated!");
            }
            while (codeDupplicated == true);
            newTitle = Inputter.inputNonBlankStr("Title of new book: ");
            newTitle = newTitle.toUpperCase();
            System.out.print("Price of new book: ");
            newPrice = sc.nextFloat();
            System.out.print("Quantity of new book: ");
            newQuantity = sc.nextInt();
        }
        Book bk = new Book(newCode, newTitle, newPrice, newQuantity);
        this.add(bk);
        System.out.println("Book " + newTitle + " has been added.");
    }
   
    public void print(ArrayList<Book> list) {
        if (this.isEmpty())
            System.out.println("Empty list!");
        else{
	    for (Book book : list) System.out.println(book);
        }
    }
    public void SortDescending(ArrayList<Book> list) {
	Collections.sort(list, new Comparator<Book>() {
        @Override
	public int compare(Book o1, Book o2) {
	    return o2.getQuantity() - o1.getQuantity();
	}
	});
	print(list);
    }
}
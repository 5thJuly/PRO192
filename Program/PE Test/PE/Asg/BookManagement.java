


public class BookManagement {
    public static void main(String[] args) {
        String[] options = {"Print book list", "Add a new book", "Find a book", "Quit"};
        int choice = 0;
        BookList list = new BookList();
        Book b1 = new Book("101", "Conan", 23, 5);
        list.add(b1);
        Book b2 = new Book("102", "Doraemon", 21, 3);
        list.add(b2);
        Book b3 = new Book("104", "The gioi", 12, 7);
        list.add(b3);
        Book b4 = new Book("124", "Gau gau ", 55, 1);
        list.add(b4);
        Book b5 = new Book("125", "Song cho", 43, 4);
        list.add(b5);
        do{
            System.out.println("\nBook Management");
            choice = Menu.getChoice(options);
            switch(choice){
                case 1: list.SortDescending(list); break;
                case 2: list.addBook(); break;
                case 3: list.searchBook(); break;
                default: System.out.println("Bye!");
            }
        }
        while (choice>0 && choice<4);
    }
}
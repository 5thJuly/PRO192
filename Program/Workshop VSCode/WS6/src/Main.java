
public class Main {

    public static void main(String[] args) {
        String[] options = {
                "1.Add new product", "2.Update price for a particular product",
                "3.A list of all available products in the Store",
                "4.Sort all products by product price as ascending ", "5.Print information of all products.", "Quit"
        };
        int choice = 0;
        Store list = new Store();
        do {
            System.out.println("The product in store:");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    list.addProduct();
                    break;
                case 2:
                    list.updateProduct();
                    break;
                case 3:
                    list.printList();
                    break;
                case 4:
                    list.SortAscending(list);
                    break;
                case 5:
                    list.printAll();
                    break;
            }
        } while (choice > 0 && choice < 6);

    }

}

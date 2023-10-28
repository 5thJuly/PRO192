package Practice;

import java.util.List;
import java.util.Scanner;

public class Validate implements Vali  {

    @Override
    public void add(List<Student> list) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Input name : ");
        String name = sc.nextLine();
        System.out.print("Input age : ");
        int age = Integer.parseInt(sc.nextLine()) ;
        System.out.print("Input mark : ");
        double mark = Double.parseDouble(sc.nextLine()) ;

        Student s = new Student(name, age, mark) ;
        list.add(s) ;
        
    }

    @Override
    public void display(List<Student> list) {
        for (Student o : list) {
            System.out.println(o);
            
        }
        
    }

    @Override
    public void remove(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j ==i) { // neu j bang vi tri minh nhap vao
                list.remove(j) ;
                break; // khong break se remove nhung object dang sau
            }
            
        }
        
    }

    @Override
    // chinh sua thong tin theo vi tri nhap vao
    public void edit(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if(j==i) {
                Scanner sc = new Scanner(System.in) ;
                System.out.print("Input name : ");
                String name = sc.nextLine();
                System.out.print("Input age : ");
                int age = Integer.parseInt(sc.nextLine()) ;
                System.out.print("Input mark : ");
                double mark = Double.parseDouble(sc.nextLine()) ;

                list.get(j).setName(name);
                list.get(j).setAge(age);
                list.get(j).setMark(mark);
                break;
            }
        }
        
        
    }

   

}

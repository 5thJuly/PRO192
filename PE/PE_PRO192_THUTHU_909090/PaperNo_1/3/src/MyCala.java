import java.util.*;

public class MyCala implements ICala {

    // dem so phan tu ma o do phan tu thu 2 la ki tu
    @Override
    public int f1(List<Cala> list) {
        int count = 0;
        for (Cala o : list) {
            if (Character.isLetter(o.getOwner().charAt(1))) {
                count++;
            }

        }
        return count;
    }

    // xoa ki tu co gia tri thap thu 2
    @Override
    public void f2(List<Cala> list) {
        int min = list.get(0).getPrice();
        int position;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < min) {
                min = list.get(i).getPrice();
            }

        }
        // tim vi tri thap thu 2
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() == min) {
                count++;
                if (count == 2) {
                    position = i;
                    list.remove(list.get(position));
                }
            }

        }

    }

    // sap xep theo thu tu giam dan
    @Override
    public void f3(List<Cala> list) {
        Collections.sort(list, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                return o2.getOwner().charAt(1) - o1.getOwner().charAt(1);
            }
        });

    }

}

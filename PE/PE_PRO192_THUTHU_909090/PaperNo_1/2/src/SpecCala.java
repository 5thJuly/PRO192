
public class SpecCala extends Cala {
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

    public void setData() {
        super.setOwner(owner.substring(0, 2) + owner.replace(owner.substring(0, 3), "XX"));
    }

    public int getValue() {
        if (color % 2 == 1) {
            return price + 7;
        } else {
            return price + 3;
        }
    }

}

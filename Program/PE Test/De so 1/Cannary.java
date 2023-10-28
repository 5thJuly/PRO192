// chuyển 3 kí tự đầu tiên trong chuỗi về chữ thường// Main trường tự cho
public class Cannary {
    private String place ;
    private int song ;

    public Cannary() {

    }

    public Cannary(String place, int song) {
        this.place = place;
        this.song = song;
    }

    public String getPlace() {
        int n = place.length() ;
        return place.substring(0, 3).toLowerCase() + place.substring(3, n) ;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
    
}
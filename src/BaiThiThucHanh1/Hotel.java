package BaiThiThucHanh1;

public class Hotel {
    private int day;
    private String typeRoom;
    private double priceRoom;

    public Hotel(){}

    public Hotel(String typeRoom, int day, double priceRoom) {
        this.day = day;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    @Override
    public String toString() {
        return ", day=" + day +
                ", typeRoom = " + typeRoom +
                ", priceRoom = " + priceRoom ;
    }

}

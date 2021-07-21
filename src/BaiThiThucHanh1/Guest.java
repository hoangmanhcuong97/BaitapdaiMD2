package BaiThiThucHanh1;

public class Guest extends Hotel {
    private String name;
    private String dateOfBirth;
    private int cmnd;

    public Guest(){}
    public Guest(String name,String dateOfBirth, int cmnd, String typeRoom, int day, double price){
        super(typeRoom, day, price);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBrith(String dateOfBrith) {
        this.dateOfBirth = dateOfBrith;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "\nGuest{" +
                "\tname = " + name +
                ", dateOfBirth = " + dateOfBirth  +
                ", cmnd = " + cmnd +
                super.toString() +
                '}';
    }
}
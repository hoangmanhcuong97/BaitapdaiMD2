package BaithiThuchanhSo3;

public class ElectricBill extends Customer{
    private int oldNumber;
    private int newNumber;
    private double electricPrice;

    public ElectricBill(){}

    public ElectricBill(int oldNumber, int newNumber, double electricPrice) {
        this.electricPrice = electricPrice;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public ElectricBill(String customerName, int apartmentNumber, String meterCode, int oldNumber, int newNumber, double electricPrice) {
        super(customerName, apartmentNumber, meterCode);
        this.electricPrice = electricPrice;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public double getElectricPrice() {
        return  electricPrice;
    }

    public void setElectricPrice(int electricPrice) {
        this.electricPrice = electricPrice;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    @Override
    public String toString() {
        return "\nElectricBill{" + super.toString() +
                ", oldNumber = " + oldNumber +
                ", newNumber = " + newNumber +
                ", electricPrice=" + electricPrice +
                '}';
    }
}

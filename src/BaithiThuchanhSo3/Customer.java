package BaithiThuchanhSo3;

public class Customer {
    private String customerName;
    private int apartmentNumber;
    private String meterCode;

    public Customer(){}

    public Customer(String customerName, int apartmentNumber, String meterCode) {
        this.customerName = customerName;
        this.apartmentNumber = apartmentNumber;
        this.meterCode = meterCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    @Override
    public String toString() {
        return ", customerName = " + customerName +
                ", apartmentNumber = " + apartmentNumber +
                ", meterCode = " + meterCode ;
    }
}

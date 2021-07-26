package BaithiThuchanhSo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer implements MethodCrud {
    public ManagerCustomer() {
        super();
    }
    private List<Customer> quanly = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);

    @Override
    public Customer CreatCustomer() {
        sc.nextLine();
        System.out.println("Nhập họ và tên khách hàng:");
        String nameCustom = sc.nextLine();
        System.out.println("Nhập số nhà:");
        int numberHouse = scanner.nextInt();
        System.out.println("Nhập mã số công tơ:");
        String meterCode = sc.nextLine();
        System.out.println("Nhập số công tơ cũ:");
        int oldNumber = scanner.nextInt();
        System.out.println("Nhập số công tơ mới:");
        int newNumber = scanner.nextInt();
        double price = (newNumber - oldNumber)*750;

        Customer customer = new ElectricBill(nameCustom, numberHouse,meterCode, oldNumber, newNumber, price);
        return customer;
    }

    @Override
    public void addCustomer() {
        System.out.println("Nhập số khách hàng muốn thêm:");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            quanly.add(CreatCustomer());
        }
        System.out.println(quanly);
    }

    @Override
    public int findMeterCode(String meterCode) {
        int index = -1;
        for (int i = 0; i < quanly.size(); i++) {
            if(quanly.get(i).getMeterCode().equals(meterCode)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void deleteCustomer() {
        System.out.println("Nhập mã công tơ bạn muốn xoá:");
        String code = sc.nextLine();
        quanly.remove(findMeterCode(code));
        System.out.println(quanly);
    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập mã công tơ bạn muốn sửa:");
        String code = sc.nextLine();
        int index = findMeterCode(code);
        for (int i = 0; i < quanly.size(); i++) {
            if(i == index){
                quanly.set(index,CreatCustomer());
                break;
            }
        }
    }
}

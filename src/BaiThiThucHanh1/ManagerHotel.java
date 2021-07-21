package BaiThiThucHanh1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerHotel {
    Scanner sc = new Scanner(System.in);
    private List<Guest> manager = new ArrayList<>();

    public Guest creatGuest(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập họ và tên khách hàng:");
        String enterName = sc.nextLine();
        System.out.println("Nhập ngày sinh khách hàng:");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập số chứng minh thư nhân dân:");
        int cmnn = sc.nextInt();
        System.out.println("Nhập tên loại phòng thuê:");
        String typeRoom = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập số ngày thuê:");
        int day = sc1.nextInt();
        double price = day * 200000;
        Guest list = new Guest(enterName,dateOfBirth,cmnn,typeRoom,day, price);
        return list;
    }

    public void addGuest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng khách hàng bạn muốn thêm:");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            manager.add(creatGuest());
        }
        System.out.println(manager);
    }
    public int findCmnn(int findCmnnGuest){
        int index = -1;
        for (int i = 0; i < manager.size(); i++) {
                if(manager.get(i).getCmnd() == findCmnnGuest){
                    index = i;
                    break;
                }
        }
        return index;
    }

    public void deleteGuest(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap số chứng minh thư khach hang can xoa:");
        int nameCustomer = sc2.nextInt();
        int index = findCmnn(nameCustomer);
        manager.remove(index);
        System.out.println(manager);
    }
}

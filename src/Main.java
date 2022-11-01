import NhanVien.NhanVien;

import java.util.Scanner;
import java.util.Vector;

import NhanVien.*;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner CMDInput = new Scanner(System.in);


        Vector<NhanVien> List = new Vector<NhanVien>();
        List.add(new NhanVienSanXuat("1", "Nguyen Van A", "01239212", 2000, 5));
        List.add(new NhanVienSanXuat("2", "Nguyen Van B", "09832122", 4000, 8));
        List.add(new NhanVienVanPhong("1", "Nguyen Van C", "0732322", 14000.0));
        List.add(new NhanVienVanPhong("2", "Nguyen Van D", "0632122", 20000.0));

        while (true) {
            System.out.println("Quan li nhan vien: ");
            System.out.println("1. Hien thi danh sach nhan vien");
            System.out.println("2. Them 1 nhan vien vao danh sach");
            System.out.println("3. Hien thi danh sach nhan vien van phong");
            System.out.println("4. Hien thi danh sach nhan vien san xuat");
            System.out.println("5. Hien thi danh sach nhan vien co ten chua x");
            System.out.println("6. Hien thi bang luong nhan vien");
            System.out.println("7. Hien danh sach nhan vien co luong cao nhat");
            System.out.println("q. Thoat chuong trinh quan li");
            System.out.print("Nhap lua chon: ");
            String input = CMDInput.nextLine();
            if (input.equals("Q") || input.equals("q")) break;
            switch (input) {
                case "1" -> {
                    System.out.println("Danh sach nhan vien:");
                    for (NhanVien i : List) System.out.println(i);
                }
                case "2" -> {
                    System.out.println("Loai nhan vien:");
                    System.out.println("1. Nhan vien van phong");
                    System.out.println("2. Nhan vien san xuat");
                    System.out.print("Loai nhan vien muon them la: ");
                    String TypeInput = CMDInput.nextLine();
                    switch (TypeInput) {
                        case "1" -> {
                            System.out.println("Nhap Id: ");
                            String id = CMDInput.nextLine();
                            System.out.println("Nhap ten: ");
                            String Name = CMDInput.nextLine();
                            System.out.println("Nhap so dien thoai: ");
                            String Phone = CMDInput.nextLine();
                            System.out.println("Nhap luong: ");
                            Double Salary = CMDInput.nextDouble();
                            CMDInput.nextLine();
                            List.add(new NhanVienVanPhong(id, Name, Phone, Salary));
                        }
                        case "2" -> {
                            System.out.println("Nhap Id: ");
                            String id = CMDInput.nextLine();
                            System.out.println("Nhap ten: ");
                            String Name = CMDInput.nextLine();
                            System.out.println("Nhap so dien thoai: ");
                            String Phone = CMDInput.nextLine();
                            System.out.println("Nhap luong theo gio: ");
                            double Salary = CMDInput.nextDouble();
                            CMDInput.nextLine();
                            System.out.println("Nhap so gio lam viec: ");
                            double Hour = CMDInput.nextDouble();
                            CMDInput.nextLine();
                            List.add(new NhanVienSanXuat(id, Name, Phone, Salary, Hour));
                    }
                        default -> System.out.println("Nhap sai!!! Moi nhap lai...");
                    }
                }
                case "3" -> {
                    System.out.println("Danh sach nhan vien van phong la: ");
                    for (NhanVien i:List)
                        if (i.typeOf().equals("NhanVienVanPhong")) System.out.println(i);
                }
                case "4" ->{
                    System.out.println("Danh sach nhan vien san xuat la: ");
                    for (NhanVien i:List)
                        if (i.typeOf().equals("NhanVienSanXuat")) System.out.println(i);
                }
                case "5" ->{
                    System.out.println("Nhap chuoi muon tim trong ten nhan vien: ");
                    String UserInput = CMDInput.nextLine();
                    for (NhanVien i: List){
                        if (i.getName().contains(UserInput)) System.out.println(i);
                    }
                }
                default -> System.out.println("Nhap sai, moi nhap lai");
            }
            System.out.print("\nAn Enter de tiep tuc...");
            CMDInput.nextLine();
        }
    }
}
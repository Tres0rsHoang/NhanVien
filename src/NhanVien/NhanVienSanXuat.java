package NhanVien;

public class NhanVienSanXuat extends NhanVien{
    private double Salary;
    private double Hour;

    public NhanVienSanXuat(String ID, String Name, String Phone, double Salary, double Hour){
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Hour = Hour;
    }
    @Override
    public String typeOf(){
        return "NhanVienSanXuat";
    }
    @Override
    public String toString(){
        String res = "Ma: " + this.ID + "\n";
        res += "Ten: "+ this.Name + "\n";
        res += "So dien thoat: " + this.Phone + "\n";
        res += "Luong theo gio: " + String.valueOf(this.Salary) +"\n";
        res += "So gio lam trong thang: " + String.valueOf(this.Hour) + "\n";
        return res;
    }
}

package NhanVien;

public class NhanVienVanPhong extends NhanVien{
    private double Salary;

    public NhanVienVanPhong(String ID, String Name, String Phone, Double Salary){
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Salary = Salary;
    }


    @Override
    public String toString(){
        String res = "Ma: " + this.ID + "\n";
        res += "Ten: "+ this.Name + "\n";
        res += "So dien thoat: " + this.Phone + "\n";
        res += "Luong " + String.valueOf(this.Salary) +"\n";
        return res;
    }
    @Override
    public String typeOf() {
        return "NhanVienVanPhong";
    }
}

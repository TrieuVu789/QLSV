public class test {
    public static void main(String[] args) {
        /*NgaySinh ngay1 = new NgaySinh(11,07,2004);
        NgaySinh ngay2 = new NgaySinh(11,07,2004);
        NgaySinh ngay3 = new NgaySinh(31,02,2009);

        Lop lop1 = new Lop("Th27.14","CNTT");
        Lop lop2 = new Lop("Th27.13","CNTT1");
        Lop lop3 = new Lop("Th27.15","CNTT2");

        SinhVien sv1 = new SinhVien(2,"DuongTrieuVu",ngay1,7.7,lop1);*/

        //cach trinh bay ngan hon phia tren
        SinhVien sv1 = new SinhVien(2,"Vu",new NgaySinh(11,07,2004),7.7,new Lop("TH27.14","CNTT"));
        SinhVien sv2 = new SinhVien(21,"Tu",new NgaySinh(11,07,2004),3.8,new Lop("TH27.12","CNTT1"));
        SinhVien sv3 = new SinhVien(2722,"Pu",new NgaySinh(13,07,2004),7.7,new Lop("TH27.13","CNTT2"));

        System.out.println("tk:" +sv1.inRaTenKhoa());
        System.out.println("tk2:" +sv2.inRaTenKhoa());
        System.out.println("tk3:" +sv3.inRaTenKhoa());

        System.out.println("Kiem Tra Thi Dat");
        System.out.println("Ket qua thi sv1: " +sv1.kiemTraDiemTB() );
        System.out.println("Ket qua thi sv2: "+sv2.kiemTraDiemTB());
        System.out.println("Ket qua thi sv3: "+sv3.kiemTraDiemTB());

        System.out.println("Kiem tra ngay sinh trung nhau");
        System.out.println("sv1 vs sv 2: "+ sv1.kiemTraNgaySinhTrungNhau(sv2));
        System.out.println("sv1 vs sv 3: "+ sv1.kiemTraNgaySinhTrungNhau(sv3));

    }
}

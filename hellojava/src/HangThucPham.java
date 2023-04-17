import java.util.Scanner;

public class HangThucPham extends HangHoa{
	protected int ngaySanXuat,ngayHetHan;

	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, int ngaySanXuat, int ngayHetHan) {
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}

	public HangThucPham() {
	}

	public int getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(int ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public int getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(int ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public void Nhap() {
		Scanner sc= new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap ngay san xuat: ");
		ngaySanXuat=sc.nextInt();
		System.out.println("Nhap ngay het han: ");
		ngayHetHan=sc.nextInt();
		
	}

	@Override
	public String toString() {
		
		return "HangThucPham [ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + "]"+super.toString();
	}
	

	
}
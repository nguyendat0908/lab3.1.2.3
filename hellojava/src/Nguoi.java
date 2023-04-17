import java.util.Scanner;

public class Nguoi {
	protected int ngay,thang,nam;

	public Nguoi(int ngay, int thang, int nam) {
		ngay = ngay;
		thang = thang;
		nam = nam;
	}

	public Nguoi() {
	}

	
	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay: ");
		this.ngay=sc.nextInt();
		System.out.println("Nhap thang: ");
		this.thang=sc.nextInt();
		System.out.println("Nhap nam: ");
		this.nam=sc.nextInt();
	}

	public String Xuat() {
		return "Nguoi [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}
	
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int chon, chon1;
		ArrayList<HangHoa> list = new ArrayList<>();
		HangHoa hanghoa;
		do {
			System.out.println("1. Nhap thong tin hang hoa");
			System.out.println("2. Hien thi thong tin hang hoa");
			System.out.println("0. Thoat.");
			System.out.println("Moi ban chon : ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				do {
					System.out.println("1.Nhap thong tin hang thuc pham. ");
					System.out.println("2.Nhap thong tin hang sanh su. ");
					System.out.println("2.Nhap thong tin hang dien may. ");
					System.out.println("0.Thoat.");
					System.out.println("Moi ban chon : ");
					chon1 = sc.nextInt();
					switch (chon1) {
					case 1: {
						hanghoa = new HangThucPham();
						hanghoa.Nhap();
						list.add(hanghoa);
						break;
						
					}
					case 2: {
						hanghoa = new HangSanhSu();
						hanghoa.Nhap();
						list.add(hanghoa);
						break;
					}
					case 3 : {
						hanghoa = new HangDienMay();
						hanghoa.Nhap();
						list.add(hanghoa);
						break;					}
					default:
						break;
					}
				} while (chon1 != 0);
				break;
			}
			case 2:{
				System.out.println("Mang vua nhap la: ");
				for (HangHoa hangHoa : list) {
					System.out.println(hangHoa);
				}
					
			}
			default:
				break;
			}
		} while (chon!=0 );
		

		
	}
}
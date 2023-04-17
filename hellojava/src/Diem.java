import java.util.Scanner;

public class Diem {
    protected int x, y;
    public Diem(int x, int y) {
	    this.x = x;
	    this.y = y;
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x=sc.nextInt();
		System.out.print("Nhap y: ");
		y=sc.nextInt();

	}
	public void inDiem() {
		System.out.println("("+x+","+y+")");
	}
}

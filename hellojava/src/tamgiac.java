public class tamgiac extends Diem {
    protected Diem A, B, C;
    public double AB,BC, AC, P,S,p;
    Tamgiac(int x, int y){
        super(x, y);
        A = new Diem(0, 0);
        B = new Diem(0,0);
        C = new Diem(0,0);
    }
    public void nhapTG() {
		System.out.println("Nhap diem A: ");
		A.nhapDiem();
		System.out.println("Nhap diem B: ");
		B.nhapDiem();
		System.out.println("Nhap diem C: ");
		C.nhapDiem();
	}
	public void inTG() {
		System.out.print("DiEM A: ");
		A.inDiem();
		System.out.print("DIEM B: ");
		B.inDiem();
		System.out.print("DIEM C: ");
		C.inDiem();
	}
        
	public void KiemTra() {
		AB=(float)Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
		BC=(float)Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
		AC=(float)Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));

      
       if(AB+AC>BC&&AB+BC>AC&&AC+BC>AB) {
    	   System.out.println("3 diem tren tao thanh tam giac");
       }else {
    	   System.out.println("3 diem tren khong tao thanh tam giac");
       }
	}
	
	public void tinhChuVi() {
		
		P= AB+BC+AC;
		System.out.println("Chu vi cua tam giac la: "+P);
	}
	
	public void tinhDienTich() {
		p=P/2;
		S=Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
		System.out.println("Dien tich cua tam giac la: "+S);
	}
    
}
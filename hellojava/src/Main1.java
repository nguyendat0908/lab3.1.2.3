
import java.util.Scanner;

public class Main1 {
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int n;
            System.out.println("Nhap vao so luong sach muon quan ly thong tin : ");
            n = scn.nextInt();
            sach sach[] = new sach[n];
            for(int i=0; i<n ; i++) {
                    System.out.println("Nhap vao thong tin cuon sach thu : "+(i+1));
                    sach[i] = new sach();
                    sach[i].nhapSach();
            }
            for(int i=0; i<n ; i++) {
                System.out.println("Thong tin cuon sach thu : "+(i+1));
                sach[i].inSach();
            }
        }
        }
import java.util.Scanner;

public class Mang {
public static void main(String[] args) {
	float []mangs=NhapMang();
	System.out.println("Mang vua nhap la: ");
	XuatMang(mangs);
	System.out.println("Tong Mang la: ");
	System.out.print(TongMang(mangs));
	System.out.println("\nMin Max Avg la: ");
	float kq[]=MinMaxAvgMang(mangs);
	System.out.println(kq[0]+"\t"+kq[1]+"\t"+kq[2]);
    float[][] matrix1 = NhapMaTran();
    System.out.println("Ma tran 1 vua nhap la:");
    XuatMaTran(matrix1);
    float[][] matrix2 = NhapMaTran();
    System.out.println("Ma tran 2 vua nhap la:");
    XuatMaTran(matrix2);
    System.out.println("Tong Hai Ma Tran La: ");
    XuatMaTran(CongMaTran(matrix1, matrix2));
    
}
	public static float[] NhapMang() {
		Scanner nhap=new Scanner(System.in);
		int n;
		n=nhap.nextInt();
		float m[]=new float[n];
		for(int i=0;i<n;i++) {
			m[i]=nhap.nextInt();
		}
		return m;
	}
	public static void  XuatMang(float m[]) {
		for(int i=0;i<m.length ;i++) {
			System.out.println(m[i]+"\t");
		}
		
	}
	public static float  TongMang(float m[]) {
		float tong=0;
		for(int i=0;i<m.length;i++) {
			tong+=m[i];
		}
		return tong;
	}
	public static float[]  MinMaxAvgMang(float m[]) {
		float min=m[0];
		float max=m[0];
		float avg=0,sum=0;
		for(int i=0;i<m.length;i++) {
			if(m[i]>max) {
				max=m[i];
			}
			if(m[i]<min) {
				min=m[i];
			}
			sum+=m[i];
			
		}
		avg=(float)sum/m.length;
		float s[]=new float [3];
		s[0]=max;s[1]=min;s[2]=avg;
		return s;
	}
	public static float[][] NhapMaTran() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap So Hang: ");
	        int m = scanner.nextInt();
	        System.out.print("Nhap So Cot: ");
	        int n = scanner.nextInt();

	        float[][] matrix = new float[m][n];

	        System.out.println("Nhap Phan Tu: ");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("A [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextFloat();
	            }
	        }

	        return matrix;
	    }

	    public static void XuatMaTran(float[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static float[][] CongMaTran(float[][] matrix1, float[][] matrix2) {
	        int m = matrix1.length;
	        int n = matrix1[0].length;
	        float[][] result = new float[m][n];

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return result;
	    }

	    
}
	



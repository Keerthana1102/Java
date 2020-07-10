package javaMyCaptain;

public class MatrixFunction {

	static void matrixMultiply(int a[][], int b[][], int c[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = 0;
				for(int k=0;k<3;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}	
	}
	
	static void matrixAddition(int a[][], int b[][], int c[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
		int b[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
		
		int c[][] = new int[3][3];
		int d[][] = new int[3][3];
		
		matrixMultiply(a, b, d);
		matrixAddition(a, b, c);
		
		System.out.println("Resultant matrix after addition is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Resultant matrix after multiplication is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

}

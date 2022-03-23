package newpackage;

//package newpackage;

public class SetMatrixZeroes {
	
	
	public static void setZeroes(int[][] arr) {
		int rows=arr.length;
		int cols=arr[0].length;
		int[] dummy1=new int[rows];
		int[] dummy2=new int[cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==0) {
					dummy1[i]=0;
					dummy2[j]=0;				
					}
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(dummy1[i]==0 || dummy2[j]==0) {
					arr[i][j]=0;
				}
			}
		
	}
	}
public static void main(String args[]) {
    int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
setZeroes(arr);
//displaying the array
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		System.out.print(arr[i][j]);
	}
	System.out.println();
}
}
}

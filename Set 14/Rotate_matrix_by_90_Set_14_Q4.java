package Set_1;

public class Rotate_matrix_by_90_Set_14_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix={{1,2,3},
						{4,5,6},
						{7,8,9}};
		int n=3;
		rotate_matrix(n,matrix);
		displayMatrix(n, matrix);
		}
	public static void rotate_matrix(int n,int[][] matrix){
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n-1-i;j++){
				int temp=matrix[i][j];
				//right to left
				matrix[i][j]=matrix[j][n-1-i];
				//bottom-r to right
				matrix[j][n-1-i]=matrix[n-1-i][n-1-j];
				//bottom-l to bottom-r
				matrix[n-1-i][n-1-j]=matrix[n-1-j][i];
				//left to bottom-l
				matrix[n-1-j][i]=temp;
			}
		}
		
	}
	static void displayMatrix(int N, int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);
      
            System.out.print("\n");
        }
        System.out.print("\n");
    }
      

}

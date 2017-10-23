public class J3
{
	static int[][] mul(int[][] a,int[][] b)
	{
		int[][] c=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	public static void main(String s[])
	{
		int[][] m1= new int[3][3];
		m1[0][0]=13;
		m1[0][1]=0;
		m1[0][2]=12;
		m1[1][0]=10;
		m1[1][1]=90;
		m1[1][2]=9;
		m1[2][0]=34;
		m1[2][1]=56;
		m1[2][2]=1;
		
		int[][] m2= new int[3][3];
		m2[0][0]=1;
		m2[0][1]=1;
		m2[0][2]=3;
		m2[1][0]=45;
		m2[1][1]=23;
		m2[1][2]=12;
		m2[2][0]=89;
		m2[2][1]=3;
		m2[2][2]=7;
		
		int[][] m=new int[3][3];
		m=mul(m1,m2);
		
		System.out.println("The output of matrix multiplication is \n");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
	}
}
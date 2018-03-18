import java.util.*;
import java.io.*;
public class _1010
{
	public static void main(String[] args) throws IOException{
		int dp[][] = new int[30][30];
		dp[1][0] = 1; dp[1][1] = 1;
		for(int i=2; i<30; i++){
			for(int j=0; j<=i; j++){
				if(j==0 || j==i){
					dp[i][j] = 1;
				}else{
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j]; 
				}
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i< num; i++){
			String str = br.readLine();
			StringTokenizer tk = new StringTokenizer(str);
			String temp = tk.nextToken();
			int num1 = Integer.parseInt(temp);
			temp = tk.nextToken();
			int num2 = Integer.parseInt(temp);
			System.out.println( dp[num2][num1] );
		}
	}
}
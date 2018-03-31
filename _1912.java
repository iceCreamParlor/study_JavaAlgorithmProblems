import java.util.*;
import java.io.*;

public class _1912
{
	public static void main(String[] args) throws IOException{
		int arr[] = new int[100010];
		int dp[] = new int[100010];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer tk = new StringTokenizer(str);
		for(int i=1; i<= num ; i++){
			arr[i] = Integer.parseInt(tk.nextToken());
		}
		dp[1] = arr[1];
		for(int i=2; i<=num ; i++){
			if(dp[i-1]+arr[i] > arr[i] ){
				dp[i] = dp[i-1]+arr[i];
			}else{
				dp[i] = arr[i];
			}
		}
		int result = dp[1];
		for(int i=2; i<=num; i++){
			result = (result<dp[i])? dp[i] : result;
		}
		System.out.println(result);
	}
}
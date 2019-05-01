import java.io.*;
import java.util.*;

public class _10872
{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int num = Integer.parseInt(br.readLine());
			int temp = factorial(num);
			System.out.println(temp);
			br.close();
		}catch(IOException e){
			;
		}
	}
	static int factorial(int num){
		if(num==0)	return 1;
		return num * factorial(num-1);
	}
}
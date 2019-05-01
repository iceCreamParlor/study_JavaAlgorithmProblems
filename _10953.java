import java.util.*;
import java.io.*;
public class _10953 
{
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			for(int i=0; i<num; i++){
				String str = br.readLine();
				int num1 = Integer.parseInt(""+str.charAt(0));
				int num2 = Integer.parseInt(""+str.charAt(2));
				System.out.println(num1+num2);
			}
			br.close();
		}catch(IOException e){}
	}
}
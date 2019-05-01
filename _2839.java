import java.io.*;
import java.util.*;

public class _2839
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int five = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		if(num%5 == 0){
			System.out.println(num/5);
		}
		else{
			while(five * 5  < num){
				int temp = num - 5*five;
				if( temp%3 ==0 ){
					list.add(five + temp/3);
				}
				five++;
			}
			Collections.sort(list);
			if(list.isEmpty() == false ) System.out.println( list.get(0) );
			else System.out.println(-1);
		}
	}
}
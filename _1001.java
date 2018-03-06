import java.util.*;
import java.io.*;

public class _1001
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String inp = br.readLine();
		StringTokenizer tk = new StringTokenizer(inp);
		int a = Integer.parseInt(tk.nextToken());
		int b = Integer.parseInt(tk.nextToken());
		System.out.println(a-b);
	}
}
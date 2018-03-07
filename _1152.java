import java.util.*;
import java.io.*;

public class _1152
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer tk = new StringTokenizer(str);
		System.out.println(tk.countTokens());
	}
}
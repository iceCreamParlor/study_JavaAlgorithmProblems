import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class _1934 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("./input.txt");
      br = new BufferedReader(new InputStreamReader(fis));
    }
    catch(FileNotFoundException e){
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    finally {
      int num = Integer.parseInt(br.readLine());
      while(num-- > 0){
        String inp = br.readLine();
        StringTokenizer stk = new StringTokenizer(inp);
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        System.out.println(mcd(a, b));
      }
    }  
  }

  private static int gcd(int a, int b){
    while(b != 0){
      int temp = a;
      a = b;
      b = temp%b;
    }
    return a;
  }
  private static int mcd(int a, int b){
    return a*b / gcd(a, b);
  }
}
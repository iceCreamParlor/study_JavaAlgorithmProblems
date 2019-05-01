import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.*;

public class _11688 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    FileInputStream fis = null;

    try {
      fis = new FileInputStream("./input2.txt");
      br = new BufferedReader(new InputStreamReader(fis));
    }
    catch(FileNotFoundException e){
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    finally {
      String inp = br.readLine();
      StringTokenizer stk = new StringTokenizer(inp);
      long a = Integer.parseInt(stk.nextToken());
      long b = Integer.parseInt(stk.nextToken());
      long target = Integer.parseInt(stk.nextToken());
      long a_b = lcm(a, b);
      long answer = -1;
      for(long i = 0 ; i <= target ; i++){
        if(lcm(a_b, i) == target){
          answer = i;
          break;
        }
      }
      System.out.println(answer);
    }
  }
  private static long gcd(long a, long b){
    while(b != 0){
      long temp = a;
      a = b;
      b = temp % b;
    }
    return a;
  }
  private static long lcm(long a, long b){
    return a * b / gcd(a, b);
  }
}
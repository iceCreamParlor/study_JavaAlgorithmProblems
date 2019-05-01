import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _1000 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = null;
    BufferedReader br = null;

    try {
      fis = new FileInputStream("./input.txt");
      br = new BufferedReader(new InputStreamReader(fis));
    }
    catch(FileNotFoundException e){
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    finally {
      String inp = br.readLine();
      StringTokenizer stk = new StringTokenizer(inp);
      int a = Integer.parseInt(stk.nextToken());
      int b = Integer.parseInt(stk.nextToken());
      System.out.println(a+b);
    }
  }
}
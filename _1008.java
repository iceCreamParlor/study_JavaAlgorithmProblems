import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.*;

public class _1008 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    FileInputStream fis = null;
    try{
      fis = new FileInputStream("./input.txt");
      br = new BufferedReader(new InputStreamReader(fis));
    }
    catch(FileNotFoundException e){
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    finally{
      String inp = br.readLine();
      StringTokenizer stk = new StringTokenizer(inp);

      double a = Double.parseDouble(stk.nextToken());
      double b = Double.parseDouble(stk.nextToken());
      System.out.println(a/b);

    }
  }
}
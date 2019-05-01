import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class _1037{
  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    FileInputStream fis = null;
    try{
      fis = new FileInputStream("./input.txt");
      br = new BufferedReader(new InputStreamReader(fis));
    }catch(FileNotFoundException e){
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    finally{
      int num = Integer.parseInt(br.readLine());
      ArrayList<Integer> arr = new ArrayList<>();
      String inp = br.readLine();
      StringTokenizer stk = new StringTokenizer(inp);

      while(num-- > 0){
        arr.add(Integer.parseInt(stk.nextToken()));
      }
      Collections.sort(arr);
      int result = arr.get(0) * arr.get(arr.size()-1);
      System.out.println(result);
    }
  }
}
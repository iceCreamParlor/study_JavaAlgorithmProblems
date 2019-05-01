import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.*;

public class _1026 {
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
      int num = Integer.parseInt(br.readLine());
      int[] arr = new int[num];
      int[] arr2 = new int[num];

      String inp = br.readLine();
      StringTokenizer stk = new StringTokenizer(inp);
      for(int i = 0 ; i < num ; i++){
        arr[i] = Integer.parseInt(stk.nextToken());
      }
      inp = br.readLine();
      stk = new StringTokenizer(inp);
      for(int i = 0 ; i < num ; i++){
        arr2[i] = Integer.parseInt(stk.nextToken()) * -1;
      }
      Arrays.sort(arr);
      Arrays.sort(arr2);
      int sum = 0;
      for(int i = 0 ; i < num ; i++){
        sum += arr[i] * arr2[i];
      }
      System.out.println(sum * -1);
    }
  }
}
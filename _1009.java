import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.util.*;


public class _1009 {
  public static void main(String[] args) throws IOException{
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
      while(num-- > 0) {
        ArrayList<Integer> arrL = new ArrayList<>();
        String inp = br.readLine();
        StringTokenizer stk = new StringTokenizer(inp);
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int current = 1;
        for(int i = 0 ; i < b ; i++) {
          current = current * a % 10;
          if(arrL.indexOf(current) == -1){
            arrL.add(current);
          }
          else {
            break;
          }
        }
        int result = b % arrL.size();
        int answer;
        if(result == 0){
          answer = arrL.get(arrL.size()-1);
        }
        else {
          answer = arrL.get(result-1);
        }
        if(answer == 0){
          answer = 10;
        }
        System.out.println(answer);
      }
    }
    br.close();
  }
  
}
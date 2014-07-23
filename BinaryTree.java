import java.io.*;
import java.util.*;
import java.awt.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;
class BinaryTree{

  BinaryTree() {

  }


  public static void main(String args[]) {
    boolean isContinue = true;
    String value;
    BinaryTree s = new BinaryTree();
    System.out.println("終了したい場合は end と入力して下さい。");
    while(isContinue){
      try{
        BufferedReader input;
        System.out.println("input:");
        input = new BufferedReader (new InputStreamReader (System.in));
        value = input.readLine( );
        if(value.equals("end")){
          isContinue = false;
        }else if(value.equals("") || value.indexOf(" ") >= 0 || value.indexOf("　") >= 0){
          System.out.println("空白文字は含まないで下さい");
        }else{
          System.out.println(value);
        }
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }


    // 行きがけ順
    void traversePreorder(BinaryTreeNode p) {
        //--(作成済み)--
    }

}
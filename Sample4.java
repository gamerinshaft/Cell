import java.io.*;
import java.util.*;
import java.awt.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;

class Sample4 {
  Cell header, newCell;
  String str;

  Sample4() {
    header = new Cell("");
  }

  void insert(Object data) {
    newCell = new Cell(data);
    Cell pastCell = header;
    while(isNextCellExist(pastCell)){
      if(isNextCellDataInsertData(pastCell, data)){
        if(isNextCellLast(pastCell)){
          break;
        }else{
          pastCell.next = pastCell.next.next;
        }
      }
      pastCell = pastCell.next;
    }
    pastCell.next = newCell;
    sortOfData(header.next);
  }

  private boolean isNextCellExist(Cell cell){
    return cell.next != null;
  }

  private boolean isNextCellDataInsertData(Cell cell, Object data){
    return cell.next.data.equals(data);
  }

  private boolean isNextCellLast(Cell cell){
    return cell.next.next == null;
  }

  String printList() {
    Cell cell = header;
    str = "[";
    invertInsert(cell);
    str += "]";
    return str;
  }

  private void sortOfData(Cell cell){
    Cell nextCell = cell.next;
    Object tmp;
    Integer pareData = Integer.parseInt(cell.data + "");
    while(nextCell != null){
      Integer chilData =  Integer.parseInt(nextCell.data + "");
      if( pareData > chilData ){
        tmp = cell.data;
        cell.data = nextCell.data;
        nextCell.data = tmp;
      }
      nextCell = nextCell.next;
    }
    if(cell.next != null){
      sortOfData(cell.next);
    }
  }

  void regularInsert(Cell cell){
    str += cell.data + " ";
    if(cell.next !=null){
      regularInsert(cell.next);
    }
  }

  void invertInsert(Cell cell){
    if(cell.next != null){
      invertInsert(cell.next);
    }
    str += " " + cell.data;
  }

  public static void main(String args[]) {
    boolean isContinue = true;
    String value;
    Sample4 s = new Sample4();
    System.out.println("終了したい場合は finish と入力して下さい。");
    while(isContinue){
      try{
        BufferedReader input;
        System.out.println("input:");
        input = new BufferedReader (new InputStreamReader (System.in));
        value = input.readLine( );
        if(value.equals("finish")){
          isContinue = false;
        }else if(isNumber(value)){
          s.insert(value);
          System.out.println( s.printList() );
        }else{
          System.out.println("半角英数字のみです");
        }
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }

  private static boolean isNumber(String value){
    Pattern num = Pattern.compile("[^0-9]");
    return !num.matcher(value).find();
  }
}


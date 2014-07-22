import java.io.*;
import java.util.*;
import java.awt.*;
class Sample3 {
  Cell header, newCell;
  String str;

  Sample3() {
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
    Sample3 s = new Sample3();
    System.out.println("終了したい場合は finish と入力して下さい。");
    while(isContinue){
      try{
        BufferedReader input;
        System.out.println("input:");
        input = new BufferedReader (new InputStreamReader (System.in));
        value = input.readLine( );
        if(value.equals("finish")){
          isContinue = false;
        }else if(value.equals("") || value.indexOf(" ") >= 0 || value.indexOf("　") >= 0){
          System.out.println("空白文字は含まないで下さい");

        }else{
          s.insert(value);
          System.out.println( s.printList() );
        }
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }

}


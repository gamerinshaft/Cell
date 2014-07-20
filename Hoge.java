class Hoge{
  String obj;
  Hoge(String elm){
    obj = elm;
  }
  public static void main(String args[]){
    Hoge s = new Hoge(args[0]);
    System.out.println(s.obj);
  }
}

class Practice1 {
    Cell header;

    Practice1() {
        /*
            リストヘッド(ダミーセル)については後述します
            Cell p = header.next;
            Cell q = header;
        */
        header = new Cell("");
    }

    void nextInsert(Object data) {
        Cell p = header;
        Cell x = new Cell(data);
        p.next = x;
    }

    String printList() {
        String s = "[ ";
        s += header.data + " ";
        header = header.next;
        s += header.data + " ";
        s += "]";
        return s;
    }

    public static void main(String args[]) {
        Practice1 s = new Practice1();
        s.topInsert("a");
        s.nextInsert("b");  //追加部分
        s.nextInsert("c");  //追加部分
        System.out.println( s.printList() );
    }
}
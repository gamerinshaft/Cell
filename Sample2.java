class Sample2 {
    Cell header;

    Sample2() {
        /*
            リストヘッド(ダミーセル)については後述します
            Cell p = header.next;
            Cell q = header;
        */
        header = new Cell("");
    }

    void topInsert(Object data) {
        Cell p = new Cell(data);
        header = p;

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
        Sample2 s = new Sample2();
        s.topInsert("a");
        s.nextInsert("b");
        System.out.println( s.printList() );
    }
}
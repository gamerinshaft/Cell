class Sample1 {
    Cell header;

    Sample1() {
        /*
            リストヘッド(ダミーセル)については後述します

            header = new Cell("");
        */
    }

    void topInsert(Object data) {
        Cell p = new Cell(data);
        header = p;

    }

    String printList() {
        String s = "[ ";
        s += header.data;
        s += " ]";
        return s;
    }

    public static void main(String args[]) {
        Sample1 s = new Sample1();
        s.topInsert("a");
        System.out.println( s.printList() );
    }
}

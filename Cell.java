/*-----------------------------
--     再帰的なデータ構造     --
-----------------------------*/
class Cell {
    Cell next;
    Object data;

    Cell( Object obj ) {
        next = null;
        data = obj;
    }
}

class Practice1 {
    Cell header;

    Practice1() {
        /*
            リストヘッド(ダミーセル)については後述します

            header = new Cell("");
        */
    }

    void topInsert(Object data) {
        Cell p = new Cell(data);


        //--(作成してください)--

    }

    String printList() {
        String s = "[ ";
        s += header.data + " ";
        s += "]";
        return s;
    }

    public static void main(String args[]) {
        Practice1 s = new Practice1();
        s.topInsert("a");

        System.out.println( s.printList() );
    }
}

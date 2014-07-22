class Sample3 {
    Cell header;

    Sample3() {
        header = new Cell("");
    }

    void insert(Object data) {
        Cell newCell = new Cell(data);
        Cell pastCell;
        pastCell = header;
        while(pastCell.next != null){
          pastCell = pastCell.next;
        }
        pastCell.next = newCell;
    }

    String printList() {
        String s = "[";
        do{
            s += header.data + " ";
            header = header.next;
        }while(header != null);
        s += "]";
        return s;
    }

    public static void main(String args[]) {
        Sample3 s = new Sample3();
        s.insert( "a" );
        s.insert( "b" );
        s.insert( "c" );
        s.insert( "d" );
        s.insert( "b" );
        s.insert( "e" );
        s.insert( "f" );
        System.out.println( s.printList() );
    }
}
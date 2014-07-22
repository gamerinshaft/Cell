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

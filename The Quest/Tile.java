public class Tile{
    private int col;
    private int row;
    private char display_tile;

    public Tile(int row, int col,char display_tile){
        this.col = col;
        this.row = row;
        this.display_tile= display_tile;

    }
    public int getCol(){
        return this.col;
    }
    public int getRow(){
        return this.row;
    }
  

    public void setDisplaytile(char newtile){
        this.display_tile = newtile;

    }

    public char getDisplaytile(){
        return this.display_tile;
    }


}
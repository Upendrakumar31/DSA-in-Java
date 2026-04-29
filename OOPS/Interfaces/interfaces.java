package Oops.Interfaces;

public class interfaces {
    
}

interface chessPlayer{
    void moves();
}

class queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step )");
    }
}
 

public class interfac {
  public static void main(String[] args) {
    Queen q=new Queen();
    q.move();
  }  
}

interface CheesPlayer{
    void move();
}

class Queen implements CheesPlayer{
    public void move() {
        System.out.println("it can be go up , side down left right and more moves");
    }
}

package Sep14Training;

public class WhileLoopStatement {

    public void ascending()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
    }

    public void descending()
    {
        int i=10;
        while(i>=1)
        {
            System.out.println(i);
            i--;
        }

    }

    public static void main(String[] args) {
        WhileLoopStatement wh = new WhileLoopStatement();
        System.out.println("Numbers are in ascending order : ");
        wh.ascending();
        System.out.println("Numbers are in descending order : ");
        wh.descending();
    }


}

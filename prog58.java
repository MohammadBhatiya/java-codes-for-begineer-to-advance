import java.util.*;
class team
{
    String player1,player2,player3;
    int score1,score2,score3;
    void getplayer()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Player Name:");
        player1 = sc.next();
        System.out.println("Enter Second Player Name:");
        player2 = sc.next();
        System.out.println("Enter Third Player Name:");
        player3 = sc.next();
        System.out.println("Enter First Player Score =");
        score1 = sc.nextInt();
        System.out.println("Enter Second Player Score =");
        score2 = sc.nextInt();
        System.out.println("Enter Third Player Score =");
        score3 = sc.nextInt();
    }
    void putplayer()
    {
        System.out.println("First Player is "+player1);
        System.out.println("Second Player is "+player2);
        System.out.println("Third Player is "+player3);
        System.out.println("First Player Score= "+score1);
        System.out.println("Second Player Score= "+score2);        
        System.out.println("Third Player Score= "+score3);

    }
}
class result extends team
    {
        int totalscore;
        void find()
        {
            totalscore = score1 + score2 + score3;
            System.out.println("Total Score is "+totalscore);
            if(score1>score2 && score1>score3)
            {
                System.out.println("Main of The Match is Player1 "+player1);
            }
            else if(score2>score1 && score2>score3)
            {
                System.out.println("Main Of The Match is Player2 "+player2);
            }
            else
            {
                System.out.println("Main Of The Match is Player3 "+player3);

            }
        }
    }
class prog58
{
    public static void main(String args[])
    {
    result p = new result();
    p.getplayer();
    p.putplayer();
    p.find();
    } 
}
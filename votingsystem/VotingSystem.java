package votingsystem;

public class VotingSystem {
    public static void main(String[] args) {
       int  devendrFadnvis=0;
       int ajitPawar=0;
       int shardpawar=0;
       int vote=1;
        System.out.println("Candidates:");
        System.out.println("1.Devendr");
        System.out.println("2.Ajit");
        System.out.println("3.Shard");
        System.out.println(" you voted for:"+vote);
        if(vote==1){

           devendrFadnvis++;
            System.out.println("Thank you.. Your vote for Devendr has been recorded.");

        } else if (vote==2) {
            ajitPawar++;
            System.out.println("Thank you.. Your vote for Ajit  has been recorded.");
        } else if (vote==3) {
            shardpawar++;
            System.out.println("Thank you.. Your vote for Shard  has been recorded.");


        }else {
            System.out.println("invalid vote");
        }
        System.out.println("Devendr: " + devendrFadnvis);
        System.out.println("Ajit: " + ajitPawar);
        System.out.println("Shard: " + shardpawar);


    }



}

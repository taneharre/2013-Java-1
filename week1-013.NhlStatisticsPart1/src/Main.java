
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();    // orders the players by goals
        NHLStatistics.top(10);          // prints top 10
        
        System.out.println("");         // white space
        
        System.out.println("Top twenty-five by penalties");
        NHLStatistics.sortByPenalties(); // orders the players by penalty minutes
        NHLStatistics.top(25);           // prints top 25
        
        System.out.println("");
        
        System.out.println("Statistics of Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");  // prints stats of player
        
        System.out.println("");
        
        System.out.println("Statistics of the Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");  // print stats of team
        
        System.out.println("");
        
        System.out.println("Players in Anaheim Duck ordered by points");
        NHLStatistics.sortByPoints();     // orders the players by points
        NHLStatistics.teamStatistics("ANA");
    }
}


import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top 10 pleayers based on goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players basen on penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Statistics for Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Statistics for Anaheim Ducks: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}

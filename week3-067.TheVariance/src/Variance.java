import java.util.ArrayList;

public class Variance {
   
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int values : list){
           sum += values;
        }
        return sum;
    }
    
    
    public static double average(ArrayList<Integer> list) {
    return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double var = 0;
        double ttl = 0;
        double avg = average(list);
        for(int nmbr : list){
            var = Math.pow((nmbr * 1.0 - avg), 2);
            ttl += var;
        }
        ttl = ttl / (list.size() - 1);
        return ttl;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}

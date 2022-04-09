import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoQuestion3MergeIntervals {
    public static void main(String[] args) {
        int [][] array  = {{1,2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        System.out.println(Arrays.deepToString(mergeIntervals(array)));

        // Total O(nlong(n)+O(N)) = O(nlog(n))
    }

    public static int [][] mergeIntervals(int [][] intervals){
        int [] [] sortedIntervals =intervals.clone();

        // O(Nlog(N))
        Arrays.sort(sortedIntervals,(a, b)->Integer.compare(a[0], b[0]));

        List<int []> mergedIntervals=new ArrayList<>();
        int[] currentInterval =sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        for(int [] nextInterval:sortedIntervals){
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart=nextInterval[0];
            int nextIntervalEnd= nextInterval[1];

            // O(n)
            if(currentIntervalEnd>=nextIntervalStart) { // this means theres an overlap
                currentInterval[1]=Math.max(currentIntervalEnd, nextIntervalEnd); // will update current intervals end
            //currentInterval[1]=nextIntervalEnd; this line will result in logical error
            }else{// this condition is to confirm theres no overlap
                currentInterval=nextInterval;
                mergedIntervals.add(currentInterval);

            }
            }
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

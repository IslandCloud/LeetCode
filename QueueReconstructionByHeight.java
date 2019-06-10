import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class QueueReconstructionByHeight{

    // https://leetcode.com/problems/queue-reconstruction-by-height/description/

    private static int[][] input = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};

    private int[][] reconstructQueue(int[][] people){
        Arrays.sort(people, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        // {{7,0}, {7,1}, {6,1}, {5,0}, {5,2}, {4,4}}

        List<int[]> list = new LinkedList<>();
        for(int[] p : people){
            list.add(p[1], p);
        }

        return list.toArray(people);
    }

}

/**
 * LastStoneWeight
 */

import java.util.PriorityQueue;
import java.util.Comparator;

public class LastStoneWeight {

    // https://leetcode.com/problems/last-stone-weight/

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int s : stones){ pQueue.offer(s);}
        while(pQueue.size() > 1){
            Integer x = pQueue.poll(), y = pQueue.poll();
            if(x != y){ pQueue.offer(x - y);}
        }

        if(pQueue.size() > 0){ return pQueue.peek();}

        return 0;
    }

}
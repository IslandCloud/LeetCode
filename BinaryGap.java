import java.sql.SQLOutput;

public class BinaryGap{

    // https://leetcode.com/problems/binary-gap/

    private int binaryGap(int N){
        String binary = Integer.toBinaryString(N);
        int length = binary.length();
        int pos1 = 0, pos2 = 0, current_gap, gap = 0;
        for(int i = 0; i < length; i++){
            if(binary.charAt(i) == '1'){
                pos1 = pos2;
                pos2 = i;
                current_gap = pos2 - pos1;
                gap = gap > current_gap ? gap : current_gap;
            }
        }
        System.out.println(binary);

        if(pos1 == pos2){
            return 0;
        }
        return gap;
    }

}

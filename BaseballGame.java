public class BaseballGame{

    // https://leetcode.com/problems/baseball-game/description/

    private static String[] input = {"36","28","70","65","C","+","33","-46","84","C"};

    private int calPoints(String[] ops){
        int sum = 0, last_valid = 0, second_last_valid =0;
        int last_valid_index = 0, second_last_valid_index = 0;
        int length = ops.length;
        int[] round_score = new int[length]; // scores for each round
        boolean[] is_valid = new boolean[length]; // default to false
        for(int i = 0; i < length; i++){
            int score;
            switch(ops[i]){
                case "+":
                    is_valid[i] = true;
                    score = last_valid + second_last_valid;
                    round_score[i] = score;
                    sum += score;
                    second_last_valid = last_valid;
                    last_valid = score;
                    second_last_valid_index = last_valid_index;
                    last_valid_index = i;
                    break;
                case "D":
                    is_valid[i] = true;
                    score = last_valid * 2;
                    round_score[i] = score;
                    sum += score;
                    second_last_valid = last_valid;
                    last_valid = score;
                    second_last_valid_index = last_valid_index;
                    last_valid_index = i;
                    break;
                case "C":
                    is_valid[last_valid_index] = false;
                    sum -= last_valid;
                    last_valid_index = second_last_valid_index;
                    last_valid = second_last_valid;
                    for(int t = last_valid_index - 1; t >= 0; t--){
                        if(is_valid[t]){
                            second_last_valid_index = t;
                            second_last_valid = round_score[t];
                            break;
                        }
                    }
                    break;
                default:
                    is_valid[i] = true;
                    score = Integer.valueOf(ops[i]);
                    round_score[i] = score;
                    sum += score;
                    second_last_valid = last_valid;
                    last_valid = score;
                    second_last_valid_index = last_valid_index;
                    last_valid_index = i;
                    break;
            }
        }

        return sum;
    }

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

    // https://leetcode.com/problems/subdomain-visit-count/description/

    private static String[] input = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

    private List<String> subdomainVisits(String[] cpdomains){
        Map<String, Integer> map = new HashMap<>();
        for(String cpdomain : cpdomains){
            String[] split = cpdomain.split(" ");
            int count = Integer.valueOf(split[0]);
            String domain = split[1];
            map.put(domain, map.getOrDefault(domain, 0) + count);
            int domain_length = domain.length();
            for(int i = 0; i < domain_length; i++){
                if(domain.charAt(i) == '.'){
                    String subdomain = domain.substring(i + 1);
                    map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
                }
            }
        }
        List<String> output = new ArrayList<>();
        for(String s : map.keySet()){
            output.add(map.get(s) + " " + s);
        }

        return output;
    }

    private void showResult(List<String> result){
        System.out.println(result);
    }


}

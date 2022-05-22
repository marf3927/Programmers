package Level1;
import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String,List<String>> map= new HashMap<>();
        Map<String,Integer> mail_map = new HashMap<>();

        for(String user: id_list){
            List<String> list = new LinkedList<>();
            map.put(user,list);
            mail_map.put(user,0);
        }

        for(String temp: report){
            String[] arr=temp.split(" ");
            String reporter=arr[0];
            String reported=arr[1];
            List<String> list =map.get(reported);
            if(list.contains(reporter)){
                continue;
            }
            list.add(reporter);
            map.put(reported,list);
        }

        for(String data: map.keySet()){
            List<String> list =map.get(data);
            if(list.size()>=k){
                for(String user: list){
                    int count =mail_map.get(user)+1;
                    mail_map.put(user,count);
                }
            }
        }

        int i=0;
        int[] answer = new int[id_list.length];
        for(String data: id_list){
            answer[i]= mail_map.get(data);
            i++;
        }
        return answer;
    }
}

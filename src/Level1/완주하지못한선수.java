package Level1;

import java.util.Arrays;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer += participant[i];
                return answer;
            }
        }
        answer += participant[participant.length - 1];
        return answer;
    }
}

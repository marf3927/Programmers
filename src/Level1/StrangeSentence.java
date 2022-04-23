package Level1;

// 이상한 문자 만들기
public class StrangeSentence {
    public String solution(String s) {
        s += "A";
        String[] stringArray = s.split(" ");
        for(int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                char ch = (j%2 == 0) ? Character.toUpperCase(stringArray[i].charAt(j))
                        : Character.toLowerCase(stringArray[i].charAt(j));
                StringBuilder sb = new StringBuilder(stringArray[i]);
                sb.setCharAt(j, ch);
                stringArray[i] = sb.toString();
            }
        }
        String answer = String.join(" ", stringArray);
        return answer.substring(0, answer.length() - 1);
    }
}

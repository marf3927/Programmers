package Level2;

// JadenCase 문자열 만들기
public class JadenCase {
    public String solution(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        int cnt = 1;
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] == ' ') cnt = 0;
            if(cnt == 1) charArray[i] = Character.toUpperCase(charArray[i]);
            cnt++;
        }
        return new String(charArray);
    }
}

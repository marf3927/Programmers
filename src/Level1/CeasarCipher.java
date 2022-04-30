package Level1;

// 시저 암호
public class CeasarCipher {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' ')continue;
            if(chars[i] >= 97 && chars[i] <= 122){
                int a = chars[i] + n;
                System.out.println(a);
                if(a> 122) {
                    chars[i] = (char) ((char) a-26);
                } else {
                    chars[i] = (char) ((char) a);
                }
            }

            if(chars[i] >= 65  && chars[i] <= 90){
                int a = chars[i] + n;
                System.out.println(a);
                if(a> 90) {
                    chars[i] = (char) ((char) a-26);
                }else {
                    chars[i] = (char) ((char) a);
                }
            }
        }
        return new String(chars);
    }
}

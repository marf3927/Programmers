package Level1;

// 핸드폰 번호 가리기 
public class CoveringPhoneNumber {
    public String solution(String phone_number) {
        String answer;
        String last4 = phone_number.substring(phone_number.length()-4);
        answer = "*".repeat(phone_number.length()-4) + last4;
        return answer;
    }
}

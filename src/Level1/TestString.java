package Level1;

import java.util.regex.Pattern;

public class TestString {
    public boolean solution(String s) {
        Pattern pattern = Pattern.compile("^[0-9]{4}{6}$");
        return pattern.matcher(s).find();
    }
}

package Level1;

public class CalMissingAmount {
    public long solution(int price, long money, int count) {
        for(int i=1; i<=count; i++){
            money -= (long) price *i;
        }

        return (money>0) ? 0 : money*-1;
    }
}

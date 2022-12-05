package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
//        float a = 12f;
        System.out.println((double) numberToBeRounded);
    }

    public static void main(String[] args) {
        FloatTypeCasting casting=new FloatTypeCasting();
        casting.roundNumber(12f);
    }
}

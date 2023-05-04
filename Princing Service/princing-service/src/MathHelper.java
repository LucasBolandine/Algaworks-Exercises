public class MathHelper {
    static double calculateAccrualValue(double value, double percentage) {
        return value * ((percentage / 100) +1);
    }
}

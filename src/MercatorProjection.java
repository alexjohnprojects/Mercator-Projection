public class MercatorProjection {
    public static void main(String[] args) {
        double lambda0 = Double.parseDouble(args[0]);
        double lambdaLong = Double.parseDouble(args[1]);
        double phi = Double.parseDouble(args[2]);
        double x = lambdaLong - lambda0;
        double y = (1.0/2.0) * Math.log((1 + Math.sin(phi) / (1 - Math.sin(phi))));
        System.out.println("x = : " + x + ". y = " + y + ".");
    }
}

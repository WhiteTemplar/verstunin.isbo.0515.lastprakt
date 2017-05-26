import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by admin on 26.05.2017.
 */
public class Main {
    private static final Logger LOGGER= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Hello world");
    }
    public static double[] solve (double a, double b, double c){
        double d=Math.sqrt(b*b-4*a*c);
        double d1=(b*b-4*a*c);
        if(d1<0)
            return  new double[0];
        if(d1==0)
            return new double[]{-b/(2*a)};
        return new double[]{(-b-d)/(2*a),(-b+d)/(2*a)};

    }
}

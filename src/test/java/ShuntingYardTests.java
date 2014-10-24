import org.junit.Test;
import ua.org.calculib.ShuntingYard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Anton Goi on 11.10.2014.
 */
public class ShuntingYardTests {

/*    @Test
    public void CorrectingSpacesPublic(){
        String test;

        test="";
        test = ShuntingYard.optimizeSpaces(test);
        System.out.println(test);

        test="(3 +7 )*4- 11^sin(8,8)";
        test = ShuntingYard.optimizeSpaces(test);
        System.out.println(test);

        test="sqrt( 11^7-0.1 *6.9)";
        test = ShuntingYard.optimizeSpaces(test);
        String[] strings = test.split(" ");
        System.out.println(test);
    }*/

    @Test
    public void CorrectingSpacesPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = ShuntingYard.class.getDeclaredMethod("optimizeSpaces", String.class);
        method.setAccessible(true);

        String test;

        test="";
        test = (String) method.invoke(ShuntingYard.getInstance(), test);
        System.out.println(test);

        test="(3 +7 )*4- 11^sin(8,8)";
        test = (String) method.invoke(ShuntingYard.getInstance(), test);
        System.out.println(test);

        test="sqrt( 11^7-0.1 *6.9)";
        test = (String) method.invoke(ShuntingYard.getInstance(), test);
        //String[] strings = test.split(" ");
        System.out.println(test);
    }
}

package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    public Calcul calcul ;
    @Test
    public void testSomme()
    {
      calcul=new Calcul();
      double a=10 ; double b=5;
      double expected=15;
      double res= calcul.somme(a,b);
        Assert.assertTrue(res==expected);

    }

}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Clase que se encarga de realizar las pruebas
 * @author Juan Esteban Quintero Bolaños
 * @author Juan Diego Buitrago Grisales
 * @author Juan David Vasquez Rojas
 */
public class TestJunit {

   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}

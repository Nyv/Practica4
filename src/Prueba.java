
/**
 *
 * @author Nerea
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaFrancesa carta1 = new CartaFrancesa(CartaFrancesa.TREBOLES,12);
        CartaFrancesa carta2 = new CartaFrancesa(1,0);
        CartaFrancesa carta3 = new CartaFrancesa(CartaFrancesa.CORAZONES,4);
        CartaFrancesa carta4 = new CartaFrancesa(3,11);
        CartaFrancesa carta5 = new CartaFrancesa(CartaFrancesa.COMODIN,0);
        //Prueba getNumero
        System.out.println("***Número*****");
        System.out.println(carta1.getNumero());
        System.out.println(carta2.getNumero());
        System.out.println(carta3.getNumero());
        System.out.println(carta4.getNumero());
        System.out.println(carta5.getNumero());
        //Prueba getPalo
        System.out.println("****Palo*****");
        System.out.println(carta1.getPalo());
        System.out.println(carta2.getPalo());
        System.out.println(carta3.getPalo());
        System.out.println(carta4.getPalo());
        System.out.println(carta5.getPalo());
        //Prueba toString
        System.out.println("****Mensaje*****");
        System.out.println(carta1.toString());
        System.out.println(carta2.toString());
        System.out.println(carta3.toString());
        System.out.println(carta4.toString());
        System.out.println(carta5.toString());
        //Prueba toCodigo
        System.out.println("*****Código*****");
        System.out.println(carta1.toCodigo());
        System.out.println(carta2.toCodigo());
        System.out.println(carta3.toCodigo());
        System.out.println(carta4.toCodigo());
        System.out.println(carta5.toCodigo());
    }
}

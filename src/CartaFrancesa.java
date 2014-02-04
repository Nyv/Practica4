
import java.util.Random;


/**
 *
 * @author Nerea
 */
public class CartaFrancesa {
    //Atributos
    public static final int TREBOLES=0;
    public static final int DIAMANTES=1;
    public static final int CORAZONES=2;
    public static final int PICAS=3;
    public static final int COMODIN=4;
    int palo=0;
    String mensaje="";
    String mensajePalo="";
    String codigo="";
    //Random numCarta = new Random();
    //numCarta.nextInt(12);
    int numeroCarta=0;
    //Método Constructor
    
    CartaFrancesa(int palo, int numero){
        if(palo>=0 && palo<=4){
            this.palo=palo;
        }
        if(numero>=0 && numero<=12){
            numeroCarta=numero;
        }
    }
    //Métodos
    public int getPalo(){
        return this.palo;
    }
    public int getNumero(){
        return this.numeroCarta;
    }
    public String toString(){
        switch(palo){
            case TREBOLES:
                mensajePalo=" de Tréboles";
                break;
            case DIAMANTES:
                mensajePalo=" de Diamantes";
                break;
            case CORAZONES:
                mensajePalo=" de Corazones";
                break;
            case PICAS:
                mensajePalo=" de Picas";
                break;
            case COMODIN:
                mensajePalo=" de Comodín";
                break;
        }
        
        switch(numeroCarta){
            case 0:
                if(palo==COMODIN){
                    mensaje="1";
                }else{
                    mensaje="As";
                }
                break;
            case 1:
                mensaje="2";
                break;
            case 2:
                mensaje="3";
                break;
            case 3:
                mensaje="4";
                break;
            case 4:
                mensaje="5";
                break;
            case 5:
                mensaje="6";
                break;
            case 6:
                mensaje="7";
                break;
            case 7:
                mensaje="8";
                break;
            case 8:
                mensaje="9";
                break;
            case 9:
                mensaje="10";
                break;
            case 10:
                mensaje="J";
                break;
            case 11:
                mensaje="Q";
                break;
            case 12:
                mensaje="K";
                break;
                
        }
        return mensaje+=mensajePalo;
    }
    public String toCodigo(){
        codigo += mensajePalo.charAt(4);
        codigo +=numeroCarta;
        return codigo;
    }
}

package miguel_projects.com;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{


    public static String valor_total(float price_object, int count, int iva) {

        price_object =  price_object * count;
        var iva_price = (price_object * iva) / 100 ; 
        price_object = price_object + iva_price;
        var mensagge = "el valor a cancelar es " + price_object ;


        return mensagge;
    }

    public static String valor_digitado(int n, int m){
        // validar que m no se mayor a la cantidad de digitos
        var message =  " ";
        var string_num_n = String.valueOf(n);
        if (string_num_n.length() < m){
             message = "false";
            return message;

        }else{
            while (m != 0){
                n = n / 10;
                m--;
            }

            return message = "valor convertido " + n ;


        }




    }



    public static void main( String[] args )
    {


        /****************************************ejercicio 2 *************************************/
        Scanner valores = new Scanner(System.in);

        System.out.println("Digite el precio del prooducto");
        var price_object = valores.nextFloat();
        System.out.println("Digite la cantidad de vendidos");
        var count = valores.nextInt();
        System.out.println("digite el iva de los productos");
        var iva =  valores.nextInt();
        
       
        System.out.println(valor_total(price_object, count, iva));

        /*****************************************Ejercicio 3**************************************/
            var n = 0;
            var m = 0;
        do{
            System.out.println("digite el numero a convertir");
             n = valores.nextInt();
            System.out.println("digite los numeros a retirar del numero");
             m = valores.nextInt();
        
        }while(valor_digitado(n, m) == "false");

        System.out.println(valor_digitado(n, m));


        

        valores.close();
    }
}

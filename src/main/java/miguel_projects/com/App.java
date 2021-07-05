package miguel_projects.com;


import java.util.Scanner;

import java.math.*;
import java.awt.*;


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


    public static String convert_velocity(Double velocity){
        var message = " ";
        
        var metters = 1000.0; // 1000 metters in a Km
        var seconds = 3600.0; // 3600 seconds in a hour.
        velocity  =  velocity * (metters / seconds);

        message  = "the velocity in m/s is: " + velocity;


        return  message;

    }


    public static boolean validacion(double cateto_1 , double cateto_2){

        if (cateto_1 < 1  | cateto_2 < 1){
            return false;
        }else{
            return true;
        }

    }

    public static String hipotenusa(double cateto_1, double cateto_2){
            var message =  " ";
            var hipotenusa = 0.0;
            
            //elevar al cuadrado los catetos
            cateto_1 = Math.pow(cateto_1, 2);
            cateto_2 = Math.pow(cateto_2, 2);

            // sacar raiz de la suma de los catetos
            hipotenusa = Math.sqrt(cateto_1 + cateto_2);
        
        

        return message = "la hipotenusa es: " + hipotenusa; 

    }

    public static String multiplo10(int numero){
        var message = "";
        if (numero % 10 != 0){
            message =  "el numero" + numero + "no es un multiplo de 10" ;

        }else{
            message =  "el numero " + numero + " es un multiplo de 10" ; 
        }

        return message;

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

        /********************************************Ejercicio 4 ***************************************************/
        System.out.println("digite la velocidad en Km/H");
        var velocity =  valores.nextDouble();

        System.out.println(convert_velocity(velocity));

        /********************************************** Ejercicio 5 *************************************************************/
        var cateto_1 = 0.0;
        var cateto_2 = 0.0;
        var validacion = false;

        while (validacion != true){
            System.out.println("digite la longitud del primer cateto");
            cateto_1  = valores.nextDouble();
            System.out.println("digite la longitud del segundo cateto");
            cateto_2 = valores.nextDouble();
            validacion = validacion(cateto_1, cateto_2);
            
            if (validacion != true){

                System.out.println("alguno de los valores ingresados es menor a 1");
            }

       }
       System.out.println(hipotenusa(cateto_1, cateto_2));
       

    /*******************************************************Ejercicio 6***********************************************************/
       var validacion_multiplo_10 =  "false";
       var numeromultiplo  = 0; 
        while (validacion_multiplo_10 == "false"){
        System.out.println("write a num and tell you is multiple of 10");
        numeromultiplo  = valores.nextInt();
       
        validacion_multiplo_10 = multiplo10(numeromultiplo);

        

        }

        System.out.println(multiplo10(numeromultiplo));






        valores.close();
    }

    


}

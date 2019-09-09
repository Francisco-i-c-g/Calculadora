
/**
 *
 * @author SITE-jltrmr
 */
import javax.swing.JOptionPane;
public class Calculadora
{
     public static void main(String args[])  
     {
         String menu = "1.- Suma \n"+
                       "2.- Resta\n"+
                       "3.- Multiplicacion \n"+
                       "4.- Division \n"+
                       "5.- Salir\n";
         int op = 0;
         float n1 = 0, n2 = 0, r = 0;
        
         op = Integer.parseInt(JOptionPane.showInputDialog(menu));                          
         switch (op)
         {
             case 1 :     n1 = leerNumero();
                          n2 = leerNumero();
                          r = suma(n1,n2);
                          break;
             case 2 : 
                          n1 = leerNumero();
                          n2 = leerNumero();
                          r = resta(n1,n2);
                          break;
             case 3:      
                          n1 = leerNumero();
                          n2 = leerNumero();
                          r = multiplicacion(n1, n2);
                          break;
             
             case 4:
                          n1 = leerNumero();
                          n2 = leerNumero();
                          r = division(n1, n2);
                          break;
             
             case 5:
                          break;
                 
                 
             default: JOptionPane.showMessageDialog(null,"No pinches chingues el 1 al 5","Resultado",2);
         }
        
         if (op >= 0 && op <=4)
         {
         JOptionPane.showMessageDialog(null,r,"Resultado",1);
         }
         if (op == 5)
         {
         JOptionPane.showMessageDialog(null, "Usted ha salido.");
         }
         
     }
    
     // Metodo que me permite sumar dos valores
     static float leerNumero()
     {
         return Float.parseFloat(JOptionPane.showInputDialog("Dame un numero"));
     }
    
    
     static float suma(float numero1, float numero2)
     {       
        return numero1 + numero2;  
     }
     
     static float resta(float numero1, float numero2)
     {
         return numero1 - numero2;   
     }
     
     static float multiplicacion(float numero1, float numero2)
     {
         return numero1 * numero2;   
     }
     
     static float division(float numero1, float numero2)
     {
         return numero1 / numero2;   
     }     
             
}

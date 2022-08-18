/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import static Vista.frm_Buscar.txt_buscar;
import static Vista.frm_JAVA.lbl_impar;
import static Vista.frm_JAVA.lbl_par;
import static Vista.frm_Reemplazar.txt_palabra;
import static Vista.frm_Reemplazar.txt_palabraN;
import java.text.Normalizer;
//import static Vista.frm_Buscar.txt_buscador;


/**
 *
 * @author angeltucubal
 */
public class operaciones {
    
    public static void Repa(String texto, String letra){
        
        String cadenaNormalize = Normalizer.normalize(texto, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
      // System.out.print(times);
       frm_JAVA.lbl_rea.setText(Integer.toString(times));
       
   }
      public static void Repe(String texto, String letra){
        
        String cadenaNormalize = Normalizer.normalize(texto, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
   //    System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_JAVA.lbl_ree.setText(Integer.toString(times));
       
   }
      
       public static void Repi(String texto, String letra){
        
        String cadenaNormalize = Normalizer.normalize(texto, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
        frm_JAVA.lbl_rei.setText(Integer.toString(times));
       
   }
       
        public static void Repo(String texto, String letra){
        
        String cadenaNormalize = Normalizer.normalize(texto, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_JAVA.lbl_reo.setText(Integer.toString(times));
       
   }
        
         public static void Repu(String texto, String letra){
        
        String cadenaNormalize = Normalizer.normalize(texto, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
      frm_JAVA.lbl_reu.setText(Integer.toString(times));
       
   }
  
    /**
     *
     * @param valor
     */
    public static void par_o_impar(String valor){
             String[] valorarray = valor.split(" ");
             int sumapar=0;
             int sumaimpar=0;
             
             
        for (String palabra : valorarray) {
            int contador = palabra.length();
            
            
            if (contador % 2 == 0 ){
                sumapar = sumapar + 1;
                
            }else {
                sumaimpar = sumaimpar + 1;
            }
        }
            
            lbl_par.setText(Integer.toString(sumapar));
            lbl_impar.setText(Integer.toString(sumaimpar));
         }  

       // static void frm_Buscar() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
    
    
     public static void Buscar(){
              
        String valor1 = frm_JAVA.txt_entreda.getText();
        String cadenaNormalize = Normalizer.normalize(valor1, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

       String v= valor2.toLowerCase();
       
       String find = txt_buscar.getText();
      
       
       
       int tiempo = 0;
       for (int i = 0; i < v.length(); i++){
           if (v.substring(i).startsWith(find)){
               tiempo++;
               
           }
       }
       System.out.println(tiempo);
       Vista.frm_Buscar.txt_encontrar.setText(Integer.toString(tiempo));
       


    }
     
    public static void reemplazar(){
       
   
        String valor1 = frm_JAVA.txt_entreda.getText();
        String cadenaNormalize = Normalizer.normalize(valor1, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
       
       String find = txt_palabra.getText();
       String rep = txt_palabraN.getText();
       
    
       
       for (int i = 0; i <find.length(); i++){
          // s = s.replace(abecedario[i], traductor[i]);
           s = s.replace(find, rep);
       }
       frm_JAVA.txt_entreda.setText(s);
    
   } 
    
    
    
    
}

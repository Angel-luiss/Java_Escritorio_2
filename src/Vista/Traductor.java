/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.text.Normalizer;

/**
 *
 * @author angeltucubal
 */
public class Traductor {
     public static void traductor(String valor){
       
   
   
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

        
       String s= dos.toLowerCase();
       
       String M_U="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String tr="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
       String[] abecedario = M_U.split(",");
       String[] traductor= tr.split(",");
       
       for(int i=0; i < abecedario.length; i++){
        System.out.println(abecedario[i]);
        }
       
       for(int i=0; i < traductor.length; i++){
        System.out.println(traductor[i]);
        }
       
       for (int i = 0; i <26; i++){
           s = s.replace(abecedario[i], traductor[i]);
       }
       frm_JAVA.txt_salida.setText(s);
    
   }

    void traductor(String[] valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

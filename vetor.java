package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        
       double[] temperaturas = new double[365];
        temperaturas[0]=31.3;
        temperaturas[1]=32;
        temperaturas[2]=33.7;
        temperaturas[3]=34;
        temperaturas[4]=33.1;
        
       /* System.out.print("o valor da temperatura do dia 1 é:" + temperaturas[0]);
        System.out.println("o tamanho do array:" + temperaturas.length);*/
       
       /*for(int i=0; i<temperaturas.length; i++){
           System.out.println("o valor da temperatura do "
                   + "dia "+(i+1)+" é:"+temperaturas[i]);*/
       
       for(double temp: temperaturas){  /*for melhorado pra vetores*/
           System.out.println(temp);
           
       }
    }
}

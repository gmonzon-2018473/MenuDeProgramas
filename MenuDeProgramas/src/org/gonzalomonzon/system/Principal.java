
package org.gonzalomonzon.system;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nCaso, segTot,horas,minutos,segundos;
        int cDinero, bi200, bi100, bi50, bi20, bi5, bi10, billete1 = 0;
        int nEntero;
        int nPerfecto,div=0,cont=0;
        int n1=0,n2=1,n3=0,limite;
       
        boolean cerrar = false;
        
        do{
                
            System.out.println("Menu de Programas by Gonzalo Monzón"
                     + "\nIndique la Operacion a realizar:"
                     + "\n1.Convertir Segundos a formato H:M:S"
                     + "\n2.Programa Billetes"
                     + "\n3.Número Par o Impar"
                     + "\n4.Programa Número perfecto"
                     + "\n5.Programa serie Fibonaci"
                     + "\n6.Cerrar ");
            
            System.out.println("Ingrese el número de la la Opcion que desea ejecutar");
                nCaso=entrada.nextInt();
            
        switch(nCaso){
            
            case 1:
                    System.out.println("Ingrese la cantidad a operar: ");
                        segTot= entrada.nextInt();
                            horas=segTot/3600;
                            minutos=segTot%3600/60;
                            segundos=segTot%60;
                                System.out.println("El resultado en formatoH:M:S seria: "+horas+""+minutos+""+segundos);
            break;
            case 2:
                    System.out.println("Ingrese la cantidad de dinero a convertir");
                        cDinero=entrada.nextInt();
                        
                        bi200=cDinero/200;
                        bi100=cDinero%200/100;
                        bi50=cDinero%100/50;
                        bi20=cDinero%50/20;
                        bi10=cDinero%20/10;
                        bi5=cDinero%10/5;
                                System.out.println("Tendria una cantidad de billetes de:"
                                        + "\nBilletes de 200= "+bi200
                                        + "\nBilletes de 100= "+bi100
                                        + "\nBilletes de 50= "+bi50
                                        + "\nBilletes de 20= "+bi20
                                        + "\nBilletes de 10= "+bi10
                                        + "\nBilletes de 5="+bi5
                                        + "\nBilletes de 1=" +billete1);
            break;
            case 3:
                    System.out.println("Ingrese número para determinar si es par o impar");
                        nEntero=entrada.nextInt();
                            if (nEntero%2==0) {
                                System.out.println("El número"+" "+nEntero+" "+"Es numero par");
                            
                            }
                            else{
                                System.out.println("El número"+nEntero+"El número es impar");
                            }
            break;
            case 4:
                    System.out.println("Digite Numero a operar: ");
                        nPerfecto=entrada.nextInt();
                            do { 
                                   cont=cont+1;
                               if(nPerfecto%cont == 0 ){
                                   div= div+ cont;
                               }
                               } while (cont<nPerfecto-2);
                               if (nPerfecto== div) {
                                   System.out.println("El numero es perfecto");
                               }else{
                                    System.out.println("El numero no es perfecto");
                               }
            break;
            case 5: 
                    System.out.println("Digite el limite");
                        limite=entrada.nextInt();
                    if (limite==1) 
                          System.out.println("0");
                          else if (limite==2)
                              System.out.println("0,1");
                    else{
                         System.out.println("0,1");
                         for(int i=3;i<=limite;i++){
                             n3=n1+n2;
                                System.out.println(","+n3);
                                n1= n2;
                                n2=n3;
                         }
                          }
                    break;
            case 6:
                    System.out.println("Cerrado");
                        cerrar=true;
            break;
            
                default:
                        System.out.println("El numero de Opcion no esta registrado vuelva a intentarlo.");
            
                    
                
                    
                            
        }
        
                            
                               
        }while(!cerrar);
    
    
    
    
    
    
    
    
        
        
    }
    
}

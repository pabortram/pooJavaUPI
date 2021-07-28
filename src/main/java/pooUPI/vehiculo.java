/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooUPI;

/**
 *
 * @author pabor
 */
public class vehiculo {

    String color;
    String marca;
    String modelo;
    int odometro;
    
    public static void main(String[] args){
        
        vehiculo carro1=new vehiculo();
        carro1.color="gris";
        carro1.marca="Audi";
        carro1.modelo="R8";
        carro1.odometro=123;
        
        System.out.println("El color es: "+carro1.color);
        System.out.println("La marca es: "+carro1.marca);
        System.out.println("El modelo es: "+carro1.modelo);
        System.out.println("El odometro va: "+carro1.odometro);
        
    }
    
    
    
}



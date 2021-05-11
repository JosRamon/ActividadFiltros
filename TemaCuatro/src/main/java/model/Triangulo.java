/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Triangulo {
    public double base;
    public double altura;
    
    public Triangulo(double b, double a){
        base = b;
        altura = a;
    }
    
    public double getArea(){
        return (base * altura) / 2;
    }
    
    public double getPerimetro(){
        return base * 3;
    }
    
}

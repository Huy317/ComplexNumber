/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {
    }
    
    public Complex plus(Complex num){
        Complex a = new Complex();
        a.re = re+num.re;
        a.im = im+num.im;
        return a;
    }
    public Complex minus(Complex num){
        Complex a = new Complex();
        a.re = re-num.re;
        a.im = im-num.im;
        return a;
    }
    public Complex multiply(Complex num){
        Complex a = new Complex();
        a.re = re*num.re - im*num.im;
        a.im = re*num.im + im*num.re;
        return a;
    }

    public void InputComplex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Real: ");
        re = sc.nextDouble();
        System.out.println("imaginary: ");
        im = sc.nextDouble();
    }
    public void print(){
        if (im >=0){
            System.out.println(re+"+"+im+"i");
        }else{
            System.out.println(re+""+im+"i");
        }
        
    }
    
}

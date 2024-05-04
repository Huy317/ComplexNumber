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
        a.re = this.re+num.re;
        a.im = this.im+num.im;
        return a;
    }
    public Complex minus(Complex num){
        Complex a = new Complex();
        a.re = this.re-num.re;
        a.im = this.im-num.im;
        return a;
    }
    public Complex multiply(Complex num){
        Complex a = new Complex();
        a.re = this.re*num.re - this.im*num.im;
        a.im = this.re*num.im + this.im*num.re;
        return a;
    }
    public Complex division(Complex num){
        Complex a = new Complex();
        a.re = (this.re*num.re + this.im*num.im)/(num.re*num.re+num.im*num.im);
        a.im = (this.im*num.re-this.re*num.im)/(num.re*num.re+num.im*num.im);
        return a;
    }
    public void InputComplex(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Real: ");
        re = sc.nextDouble();
        System.out.print("imaginary: ");
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

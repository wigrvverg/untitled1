package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b = scanner.nextDouble();
        double c= scanner.nextDouble();
        double d= scanner.nextDouble();
        double e= scanner.nextDouble();
        if (a<b) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (d<e) {
            double temp = d;
            d = e;
            e = temp;
        }
        if (c<d) {
            double temp = c;
            c = d;
            d = temp;
        }
        if (b<c) {
            double temp = b;
            b = c;
            c = temp;
        }
        if (a<b) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (c<d) {
            double temp = c;
            c = d;
            d = temp;
        }
        if (d<e) {
            double temp = d;
            d = e;
            e = temp;
        }
        if (c<d) {
            double temp = c;
            c = d;
            d = temp;
        }
        if (b<c) {
            double temp = b;
            b = c;
            c = temp;
        }
        if (c<d) {
            double temp = c;
            c = d;
            d = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        }
    }

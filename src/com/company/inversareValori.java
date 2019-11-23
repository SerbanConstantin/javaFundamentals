package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class inversareValori {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("x=");
        int x = in.nextInt();

        System.out.println("y=");
        int y = in.nextInt();

        int z = x;
        x = y;
        y = z;

        System.out.printf("x=%d y=%d %n", x, y);

        System.out.println("a=");
        int a = in.nextInt();
        System.out.println("b=");
        int b = in.nextInt();

        int c =a;
        a = b;
        b = c;
        System.out.printf("a=%d b=%d ", a, b);















        }
    }













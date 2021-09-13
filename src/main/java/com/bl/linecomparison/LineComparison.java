package com.bl.linecomparison;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Line AB = new Line(8,3,2,-2);
        Line CD = new Line(2,-2,-3,3);

        boolean equals = AB.equals(CD);
        int result = AB.length().compareTo(CD.length());

    }
}

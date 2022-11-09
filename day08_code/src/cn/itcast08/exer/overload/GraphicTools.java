package cn.itcast08.exer.overload;

public class GraphicTools {
    double triangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            return 0;
        } else {
            return base * height / 2;
        }
    }

    double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }
        //任意两边之和必须大于第三边
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

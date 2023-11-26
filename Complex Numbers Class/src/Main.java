class ComplexNumber{
    int real;
    int imaginary;
    ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    ComplexNumber add(ComplexNumber n){
        return new ComplexNumber(this.real + n.real, this.imaginary + n.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber x){
        // Complete the function
        int mulReal = this.real*x.real - this.imaginary*x.imaginary;
        int mulImag = this.imaginary*x.real + this.real*x.imaginary;
        return new ComplexNumber(mulReal, mulImag);
    }
    public String toString(){
        return this.real + " + "+ this.imaginary+"i";
    }
}
public class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2,3);
        System.out.println(x);
        ComplexNumber x2 = new ComplexNumber(2,-3);
        System.out.println(x.multiply(x2));
//        ComplexNumber y = new ComplexNumber(-5,7);
//        System.out.println(y);
//        ComplexNumber m = x.add(y);
//        System.out.println(m);
    }
}
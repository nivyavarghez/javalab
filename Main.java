import java.io.*;

class Complex {
    float r;
    float i;

    public void read() {
        DataInputStream val = new DataInputStream(System.in);
        String n;
        try {
            System.out.println("Enter your real num:");
            n = val.readLine();
            r = Float.parseFloat(n);
            System.out.println("Enter your imaginary num:");
            n = val.readLine();
            i = Float.parseFloat(n);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public void display() {
        System.out.println("The real part is " + r + " imaginary part is " + i);
    }

    public Complex add(Complex num) {
        Complex result = new Complex();
        result.r = this.r + num.r;
        result.i = this.i + num.i;
        return result;
    }

    public Complex multiply(Complex num) {
        Complex result = new Complex();
        result.r = this.r * num.r - this.i * num.i;
        result.i = this.r * num.i + this.i * num.r;
        return result;
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex();
        Complex complex2 = new Complex();

        System.out.println("Enter the first complex number:");
        complex1.read();

        System.out.println("Enter the second complex number:");
        complex2.read();

        System.out.println("\nFirst complex number:");
        complex1.display();

        System.out.println("\nSecond complex number:");
        complex2.display();

        // Add two complex numbers
        Complex sum = complex1.add(complex2);
        System.out.println("\nSum of the two complex numbers:");
        sum.display();

        // Multiply two complex numbers
        Complex product = complex1.multiply(complex2);
        System.out.println("\nProduct of the two complex numbers:");
        product.display();
    }
}

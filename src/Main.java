public class Main {

    public static void main(String[] args) {
        System.out.print("Hello world");
        System.out.println("Hello");
        System.out.println("Hello");

        // Print statement and primitive data types
        int x;
        x = 5;

        double y = 8.0;
        System.out.println(x);
        System.out.println(y);


        // String concatenation
        String firstName = "Kanju";
        String lastName = "Gunathilaka";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        fullName = fullName + 123;
        System.out.println(fullName);


        // Arithmetic operators
        int d = 10;
        int b = 3;
        System.out.println(d + b);
        System.out.println(d - b);
        System.out.println(d * b);
        System.out.println(d / b);
        System.out.println(d % b);


        // Strings========================================================
        int c = 10;
        int n = 3;

        String firstName1 = "Kanju";
        String lastName1 = "Gunathilaka";
        String fullName1 = firstName1 + " " + lastName1;
        System.out.println(fullName1);
        System.out.println("c is " + c);
        System.out.println("n is " + n);
        System.out.println("c-n= " + (c - n));
        System.out.println("c*n= " + (c * n));
        System.out.println(b * n);
        System.out.println(c / n);
        System.out.println(c % n);

        // Relational Operators
        int q = 10;
        int w = 3;

        boolean result = (q < w);
        System.out.println("q<w=" + result);
        System.out.println("q is:" + q);
        System.out.println("w is:" + w);
        System.out.println("x<w:" + result);

        // If statement
        int e = 10;
        int r = 5;
        if (e > r) System.out.println("e is bigger than r");

        int t = 10;
        int u = 5;
        if (t > u) {
            System.out.println("e is bigger than r");
            System.out.println("e is bigger than r");
        }

        // If else statement
        int o = 10;
        int p = 5;
        if (o > p) System.out.println("o is bigger than p");
        else System.out.println("o is not bigger than p");

        // else if statement
        int a = 10;
        int s = 5;
        if (a > s) System.out.println("a is bigger than s");
        else if (a == s) System.out.println("a is equal to s");
        else System.out.println("a is not bigger than s");

        // Nested if, else, else if statement
        int g = 8;
        int f = 5;
        if (g > f) {
            if (g % 2 == 0) {
                System.out.println("g is bigger than f");
                System.out.println("g is even");
            } else {
                System.out.println("g is not bigger than f");
                System.out.println("g is odd");
            }
        }


        // Switch statement
        String animal = "Cat";
        switch (animal) {
            case "Cat":
                System.out.println("Meow");
                break;
            case "dog":
                System.out.println("Bark");
            default:
                System.out.println("Don't know what animal this is");
        }


        //Methods

        int h = 1;
        int k = 2;
        int sum = add(h, k);
        System.out.println(sum);

        String fName = "Kanju";
        String lName = "Gunathilaka";
        String Nresult = addstrings(fName, lName);
        System.out.println(Nresult);
    }

    public static int add(int h, int k) {
        return h + k;
    }

    public static String addstrings(String h, String k) {
        return h + " " + k;
    }
}

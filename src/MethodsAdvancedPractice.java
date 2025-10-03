import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Latihan 1: Memahami komponen method signature
        // - Panggil method dengan signature berbeda untuk melihat perbedaannya
        // - Gunakan method overloading untuk mendemonstrasikan signature

        // Contoh pemanggilan method calculate dengan signature berbeda

        // ===== METHOD OVERLOADING =====
        System.out.println("\\n=== METHOD OVERLOADING ===");

        // Latihan 2: Implementasi dan penggunaan method overloading
        // - Panggil semua variasi method calculate yang di-overload

        // - Panggil semua variasi method print yang di-overload

        // - Demonstrasikan bagaimana compiler memilih method yang tepat

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\\n=== STATIC VS INSTANCE METHODS ===");

        // Latihan 3: Perbedaan static dan instance methods
        // - Panggil static method tanpa membuat object

        // - Buat instance object dan panggil instance method

        // - Demonstrasikan akses ke static vs instance variables

        // - Coba akses instance method dari static context (akan error)

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\\n=== PASS BY VALUE - PRIMITIVES ===");

        // Latihan 4: Demonstrasi pass by value untuk primitive types
        int originalNumber = 10;

        // - Panggil method modifyPrimitive dengan originalNumber

        // - Print originalNumber sebelum dan sesudah method call

        // - Jelaskan mengapa nilai tidak berubah

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");

        // Latihan 5: Demonstrasi pass by value of reference untuk objects
        int[] originalArray = {1, 2, 3, 4, 5};

        // - Print array sebelum modification

        // - Panggil method modifyArray dengan originalArray

        // - Print array setelah modification

        // - Jelaskan mengapa isi array berubah tetapi reference tidak

        // Latihan 6: Reference reassignment dalam method
        int[] anotherArray = {10, 20, 30};

        // - Print array sebelum reassignment

        // - Panggil method reassignArray dengan anotherArray

        // - Print array setelah method call

        // - Jelaskan mengapa reference asli tidak berubah

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 7: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method yang mengembalikan copy array yang diurutkan

        // - Panggil method yang mengembalikan statistik array (min, max, avg)

        // - Panggil method yang merge dua array

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\\n=== VARIABLE ARGUMENTS (VARARGS) ===");

        // Latihan 8: Implementasi dan penggunaan varargs
        // - Panggil method sum dengan jumlah parameter berbeda-beda

        // - Panggil method printInfo dengan berbagai kombinasi parameter

        // ===== METHOD CHAINING =====
        System.out.println("\\n=== METHOD CHAINING ===");

        // Latihan 9: Implementasi method chaining
        // - Gunakan Calculator dengan method chaining untuk operasi berurutan

        // ===== RECURSIVE METHODS =====
        System.out.println("\\n=== RECURSIVE METHODS ===");

        // Latihan 10: Implementasi dan penggunaan recursive methods
        // - Hitung faktorial menggunakan recursion

        // - Hitung fibonacci menggunakan recursion

        // - Implementasikan binary search recursive

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\\n=== UTILITY STATIC METHODS ===");

        // Latihan 11: Membuat utility class dengan static methods
        // - Gunakan MathUtils untuk berbagai operasi matematika

        // - Gunakan StringUtils untuk manipulasi string

        // - Gunakan ArrayUtils untuk operasi array

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem kalkulator dengan method overloading
        // - Implementasikan calculator yang bisa handle berbagai tipe data dan operasi

        // Latihan 13: Sistem processing data dengan static utilities
        // - Implementasikan data processor dengan berbagai method utility
    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // TODO: Implementasikan method calculate yang di-overload
    public static int calculate(int a, int b) {
        // Penjumlahan dua integer
        return 0; // Ganti dengan implementasi
    }

    public static double calculate(double a, double b) {
        // Penjumlahan dua double
        return 0.0; // Ganti dengan implementasi
    }

    public static int calculate(int a, int b, int c) {
        // Penjumlahan tiga integer
        return 0; // Ganti dengan implementasi
    }

    public static String calculate(String a, String b) {
        // Concatenation dua string
        return null; // Ganti dengan implementasi
    }

    // TODO: Implementasikan method print yang di-overload
    public static void print(int value) {
        // Print integer dengan format khusus
    }

    public static void print(double value) {
        // Print double dengan format khusus
    }

    public static void print(String value) {
        // Print string dengan format khusus
    }

    public static void print(int[] array) {
        // Print array dengan format khusus
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        // TODO: Return nilai counter static
        return 0;
    }

    public static void incrementCounter() {
        // TODO: Increment counter static
    }

    public String getInstanceName() {
        // TODO: Return instance name
        return null;
    }

    public void setInstanceName(String name) {
        // TODO: Set instance name
    }

    public void displayInfo() {
        // TODO: Display instance dan static information
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        // TODO: Modify parameter dan print perubahan
    }

    public static void modifyArray(int[] array) {
        // TODO: Modify isi array
    }

    public static void reassignArray(int[] array) {
        // TODO: Reassign reference array
    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        // TODO: Return sorted copy tanpa mengubah original
        return null; // Ganti dengan implementasi
    }

    public static double[] getArrayStats(int[] array) {
        // TODO: Return array [min, max, average]
        return null; // Ganti dengan implementasi
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: Merge dua array dan return hasil
        return null; // Ganti dengan implementasi
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        // TODO: Hitung sum dari varargs
        return 0; // Ganti dengan implementasi
    }

    public static void printInfo(String title, int... values) {
        // TODO: Print title dan semua values
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        // TODO: Implementasi factorial recursive
        return 1; // Ganti dengan implementasi
    }

    public static int fibonacci(int n) {
        // TODO: Implementasi fibonacci recursive
        return 0; // Ganti dengan implementasi
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // TODO: Implementasi binary search recursive
        return -1; // Ganti dengan implementasi
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            // TODO: Implementasi power function
            return 0.0;
        }

        public static boolean isPrime(int number) {
            // TODO: Check apakah number adalah prime
            return false;
        }

        public static int gcd(int a, int b) {
            // TODO: Greatest Common Divisor
            return 0;
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            // TODO: Reverse string
            return null;
        }

        public static boolean isPalindrome(String str) {
            // TODO: Check palindrome
            return false;
        }

        public static int countWords(String str) {
            // TODO: Count words in string
            return 0;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            // TODO: Print 2D array dengan format rapi
        }

        public static int[] findDuplicates(int[] array) {
            // TODO: Find duplicate elements
            return null;
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            // TODO: Compare dua array
            return false;
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            // TODO: Add dan return this untuk chaining
            return this;
        }

        public Calculator multiply(double n) {
            // TODO: Multiply dan return this untuk chaining
            return this;
        }

        public Calculator subtract(double n) {
            // TODO: Subtract dan return this untuk chaining
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}

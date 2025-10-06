import java.util.ArrayList;
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
        System.out.println("calculate(5, 3): " + calculate(5, 3));
        System.out.println("calculate(2.3, 5.4): " + calculate(2.3, 5.4));
        System.out.println("calculate(1, 3, 2): " + calculate(1, 3, 2));
        System.out.println("calculate(\"Ini\", \"Tugas\"): " + calculate("Ini", "Tugas"));

        // Contoh pemanggilan method calculate dengan signature berbeda
        // Contoh sudah ada di atasnya.

        // ===== METHOD OVERLOADING =====
        System.out.println("\\n=== METHOD OVERLOADING ===");

        // Latihan 2: Implementasi dan penggunaan method overloading
        // - Panggil semua variasi method calculate yang di-overload
        System.out.println("calculate(6, 4): " + calculate(6, 4));
        System.out.println("calculate(3.4, 6.5): " + calculate(3.4, 6.5));
        System.out.println("calculate(2, 4, 3): " + calculate(2, 4, 3));
        System.out.println("calculate(\"Namaku\", \"Ronald\"): " + calculate("Namaku", "Ronald"));

        // - Panggil semua variasi method print yang di-overload
        print(99);
        print(96.65);
        print("Halo, namaku Ronald Saut.");
        print(new int[]{3, 9, 5, 11, 7});

        // - Demonstrasikan bagaimana compiler memilih method yang tepat
        print(98.4);

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\\n=== STATIC VS INSTANCE METHODS ===");

        // Latihan 3: Perbedaan static dan instance methods
        // - Panggil static method tanpa membuat object
        System.out.println("Panggil static method getCounter() tanpa buat objek: " + getCounter());
        incrementCounter();
        System.out.println("Setelah increment, nilai counter: " + getCounter());

        // - Buat instance object dan panggil instance method
        MethodsAdvancedPractice objek1 = new MethodsAdvancedPractice("Objek1");
        MethodsAdvancedPractice objek2 = new MethodsAdvancedPractice("Objek2");

        System.out.println("Nama instance objek1: " + objek1.getInstanceName());
        objek1.setInstanceName("Objek Satu");
        System.out.println("Nama instance objek1 setelah diubah: " + objek1.getInstanceName());

        // - Demonstrasikan akses ke static vs instance variables
        objek1.displayInfo();
        objek2.displayInfo();
        System.out.println("Nilai counter static saat ini: " + getCounter());

        // - Coba akses instance method dari static context (akan error)
        //getInstanceName();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\\n=== PASS BY VALUE - PRIMITIVES ===");

        // Latihan 4: Demonstrasi pass by value untuk primitive types
        int originalNumber = 10;

        // - Panggil method modifyPrimitive dengan originalNumber

        // - Print originalNumber sebelum dan sesudah method call
        System.out.println("originalNumber sebelum panggil method: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("originalNumber sesudah panggil method: " + originalNumber);

        // - Jelaskan mengapa nilai tidak berubah
        System.out.println("Nilai ga berubah karena Java memberi copy dari nilai primitif ke metode, bukan variabel aslinya.");

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");

        // Latihan 5: Demonstrasi pass by value of reference untuk objects
        int[] originalArray = {1, 2, 3, 4, 5};

        // - Print array sebelum modification
        System.out.println("Array sebelum dimodifikasi: " + Arrays.toString(originalArray));

        // - Panggil method modifyArray dengan originalArray
        modifyArray(originalArray);

        // - Print array setelah modification
        System.out.println("Array setelah dimodifikasi: " + Arrays.toString(originalArray));

        // - Jelaskan mengapa isi array berubah tetapi reference tidak
        System.out.println("Isi array berubah karena method menerima copy dari referensi atau alamat memori objek.");
        System.out.println("Kedua referensi menunjuk ke objek yang sama di memori, sehingga modifikasi melalui");
        System.out.println("salah satu referensi akan terlihat oleh yang lain.");

        // Latihan 6: Reference reassignment dalam method
        int[] anotherArray = {10, 20, 30};

        // - Print array sebelum reassignment
        System.out.println("Array sebelum reassignment: " + Arrays.toString(anotherArray));

        // - Panggil method reassignArray dengan anotherArray
        reassignArray(anotherArray);

        // - Print array setelah method call
        System.out.println("Array setelah reassignment: " + Arrays.toString(anotherArray));

        // - Jelaskan mengapa reference asli tidak berubah
        System.out.println("Referensi asli tidak berubah karena di dalam method, hanya copy dari referensi yang direassign");
        System.out.println("untuk menunjuk ke objek baru. Variabel referensi asli di luar method tetap menunjuk ke objek yang lama.");

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 7: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method yang mengembalikan copy array yang diurutkan
        int[] nomorTerurut = sortArrayCopy(numbers);
        System.out.println("Copy array yg sudah diurutkan: " + Arrays.toString(nomorTerurut));
        System.out.println("Array asli tidak berubah: " + Arrays.toString(numbers));

        // - Panggil method yang mengembalikan statistik array (min, max, avg)
        double[] statistik = getArrayStats(numbers);
        System.out.println("Statistik array (min, max, avg): " + Arrays.toString(statistik));

        // - Panggil method yang merge dua array
        int[] array1 = {9, 7, 8};
        int[] array2 = {5, 6, 4};
        int[] gabung = mergeArrays(array1, array2);
        System.out.println("Hasil merge: " + Arrays.toString(gabung));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\\n=== VARIABLE ARGUMENTS (VARARGS) ===");

        // Latihan 8: Implementasi dan penggunaan varargs
        // - Panggil method sum dengan jumlah parameter berbeda-beda
        System.out.println("Sum(9, 8): " + sum(9, 8));
        System.out.println("Sum(12, 7, 8, 10, 9): " + sum(12, 7, 8, 10, 9));
        System.out.println("Sum(): " + sum());

        // - Panggil method printInfo dengan berbagai kombinasi parameter
        printInfo("Nilai Ujian", 96, 98, 97, 100);
        printInfo("Nilai Tambah");

        // ===== METHOD CHAINING =====
        System.out.println("\\n=== METHOD CHAINING ===");

        // Latihan 9: Implementasi method chaining
        // - Gunakan Calculator dengan method chaining untuk operasi berurutan
        Calculator kalkulator = new Calculator(12);
        double hasil = kalkulator.add(6).multiply(5).subtract(2).getResult();
        System.out.println("Hasil method chaining: " + hasil);

        // ===== RECURSIVE METHODS =====
        System.out.println("\\n=== RECURSIVE METHODS ===");

        // Latihan 10: Implementasi dan penggunaan recursive methods
        // - Hitung faktorial menggunakan recursion
        System.out.println("Faktorial dari 6 adalah: " + factorial(6));

        // - Hitung fibonacci menggunakan recursion
        System.out.println("Angka fibonacci ke-8 adalah: " + fibonacci(8));

        // - Implementasikan binary search recursive
        int[] arrayTerurut = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        int targetnya = 17;
        int ketemuIndex = binarySearchRecursive(arrayTerurut, targetnya, 0, arrayTerurut.length - 1);
        System.out.println("Angka " + targetnya + " ditemukan di index " + ketemuIndex);

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\\n=== UTILITY STATIC METHODS ===");

        // Latihan 11: Membuat utility class dengan static methods
        // - Gunakan MathUtils untuk berbagai operasi matematika
        System.out.println("MathUtils.power(4, 3): " + MathUtils.power(4, 3));
        System.out.println("MathUtils.isPrime(17): " + MathUtils.isPrime(17));
        System.out.println("MathUtils.gcd(88, 94): " + MathUtils.gcd(88, 94));

        // - Gunakan StringUtils untuk manipulasi string
        System.out.println("StringUtils.reverse(\"ProjectSekai\"): " + StringUtils.reverse("ProjectSekai"));
        String kalimat = "ibu ratna antar ubi";
        System.out.println("StringUtils.isPalindrome(" + kalimat + "): " + StringUtils.isPalindrome(kalimat));
        System.out.println("StringUtils.countWords(\"Siap pak lurah\"): " + StringUtils.countWords("Siap pak lurah"));

        // - Gunakan ArrayUtils untuk operasi array
        int[][] matriks = {{9, 6, 5}, {1, 3, 4}, {7, 8, 2}};
        System.out.println("Matriks: ");
        ArrayUtils.printMatrix(matriks);
        int[] duplikat = {8, 9, 10, 7, 6, 5, 9, 2, 8};
        System.out.println("ArrayUtils.findDuplicates: " + Arrays.toString(ArrayUtils.findDuplicates(duplikat)));
        System.out.println("ArrayUtils.areEqual: " + ArrayUtils.areEqual(new int[]{9, 10}, new int[]{9, 10}));

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem kalkulator dengan method overloading
        // - Implementasikan calculator yang bisa handle berbagai tipe data dan operasi
        System.out.println("Penjumlahan 2 integer (7 + 5): " + calculate(7, 5));
        System.out.println("Penjumlahan 2 double (4.5 + 7.6): " + calculate(4.5, 7.6));
        System.out.println("Penjumlahan 2 string (\"Hei\" + \"Kamu\"): " + calculate("Hei", "Kamu"));

        // Latihan 13: Sistem processing data dengan static utilities
        // - Implementasikan data processor dengan berbagai method utility
        String data = "ngolah data gampang jeung java";
        System.out.println("StringUtils.reverse(" + data + "): " + StringUtils.reverse(data));
        System.out.println("StringUtils.isPalindrome(" + data + "): " + StringUtils.isPalindrome(data));
        System.out.println("StringUtils.countWords(" + data + "): " + StringUtils.countWords(data));
    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // TODO: Implementasikan method calculate yang di-overload
    public static int calculate(int a, int b) {
        // Penjumlahan dua integer
        return a + b; // Ganti dengan implementasi
    }

    public static double calculate(double a, double b) {
        // Penjumlahan dua double
        return a + b; // Ganti dengan implementasi
    }

    public static int calculate(int a, int b, int c) {
        // Penjumlahan tiga integer
        return a + b + c; // Ganti dengan implementasi
    }

    public static String calculate(String a, String b) {
        // Concatenation dua string
        return a + b; // Ganti dengan implementasi
    }

    // TODO: Implementasikan method print yang di-overload
    public static void print(int value) {
        // Print integer dengan format khusus
        System.out.println("Int: " + value);
    }

    public static void print(double value) {
        // Print double dengan format khusus
        System.out.println("Double: " + String.format("%.4f", value));
    }

    public static void print(String value) {
        // Print string dengan format khusus
        System.out.println("String: " + value.toUpperCase());
    }

    public static void print(int[] array) {
        // Print array dengan format khusus
        System.out.println("Array: " + Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        // TODO: Return nilai counter static
        return counter;
    }

    public static void incrementCounter() {
        // TODO: Increment counter static
        counter++;
    }

    public String getInstanceName() {
        // TODO: Return instance name
        return this.instanceName;
    }

    public void setInstanceName(String name) {
        // TODO: Set instance name
        this.instanceName = name;
    }

    public void displayInfo() {
        // TODO: Display instance dan static information
        System.out.println("Info Objek: Nama = " + this.instanceName + " , Total Objek = " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        // TODO: Modify parameter dan print perubahan
        System.out.println("number (sebelum) = " + number);
        number = 98;
        System.out.println("number (sesudah) = " + number);
    }

    public static void modifyArray(int[] array) {
        // TODO: Modify isi array
        array[0] = 96;
        array[4] = 100;
        System.out.println("Modifikasi array jadi = " + Arrays.toString(array));
    }

    public static void reassignArray(int[] array) {
        // TODO: Reassign reference array
        array = new int[]{60, 50, 40};
        System.out.println("Mengalokasikan kembali: array yg baru = " + Arrays.toString(array));
    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        // TODO: Return sorted copy tanpa mengubah original
        int[] kopiTerurut = Arrays.copyOf(original, original.length);
        Arrays.sort(kopiTerurut);
        return kopiTerurut; // Ganti dengan implementasi
    }

    public static double[] getArrayStats(int[] array) {
        // TODO: Return array [min, max, average]
        int min = array[0];
        int max = array[0];
        long jumlah = 0;

        for(int nilai : array) {
            if(nilai < min) {
                min = nilai;
            }
            if(nilai > max) {
                max = nilai;
            }
            jumlah += nilai;
        }

        double rataRata = (double) jumlah / array.length;
        return new double[]{min, max, rataRata}; // Ganti dengan implementasi
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: Merge dua array dan return hasil
        int panjang = array1.length + array2.length;
        int[] hasil = new int[panjang];
        System.arraycopy(array1, 0, hasil, 0, array1.length);
        System.arraycopy(array2, 0, hasil, array1.length, array2.length);
        return hasil; // Ganti dengan implementasi
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        // TODO: Hitung sum dari varargs
        int total = 0;
        for(int angka : numbers) {
            total += angka;
        }
        return total; // Ganti dengan implementasi
    }

    public static void printInfo(String title, int... values) {
        // TODO: Print title dan semua values
        System.out.println(title + ": ");
        if(values.length == 0) {
            System.out.println("Ga ada nilai");
        } else {
            for(int nilai : values) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        // TODO: Implementasi factorial recursive
        if(n < 0) return -1;
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1); // Ganti dengan implementasi
    }

    public static int fibonacci(int n) {
        // TODO: Implementasi fibonacci recursive
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2); // Ganti dengan implementasi
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // TODO: Implementasi binary search recursive
        if(left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(array[mid] == target) {
            return mid;
        } else if(array[mid] > target) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            // TODO: Implementasi power function
            return Math.pow(base, exponent);
        }

        public static boolean isPrime(int number) {
            // TODO: Check apakah number adalah prime
            if(number <= 1) {
                return false;
            }
            for(int i = 2; i * i <= number; i++) {
                if(number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int gcd(int a, int b) {
            // TODO: Greatest Common Divisor
            while(b != 0) {
                int temporari = b;
                b = a % b;
                a = temporari;
            }
            return a;
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            // TODO: Reverse string
            return new StringBuilder(str).reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            // TODO: Check palindrome
            String strBersih = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String kebalik = new StringBuilder(strBersih).reverse().toString();
            return strBersih.equals(kebalik);
        }

        public static int countWords(String str) {
            // TODO: Count words in string
            String[] kata = str.trim().split("\\s+");
            return kata.length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            // TODO: Print 2D array dengan format rapi
            for(int[] baris : matrix) {
                System.out.println(Arrays.toString(baris));
            }
        }

        public static int[] findDuplicates(int[] array) {
            // TODO: Find duplicate elements
            Arrays.sort(array);
            ArrayList<Integer> duplikat = new ArrayList<>();
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] == array[i+1]) {
                    if(duplikat.isEmpty() || duplikat.get(duplikat.size() - 1) != array[i]) {
                        duplikat.add(array[i]);
                    }
                }
            }
            int[] hasil = new int[duplikat.size()];
            for(int i = 0; i < duplikat.size(); i++) {
                hasil[i] = duplikat.get(i);
            }
            return hasil;
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            // TODO: Compare dua array
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            this.value += n;
            return this;
        }

        public Calculator multiply(double n) {
            // TODO: Multiply dan return this untuk chaining
            this.value *= n;
            return this;
        }

        public Calculator subtract(double n) {
            // TODO: Subtract dan return this untuk chaining
            this.value -= n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}

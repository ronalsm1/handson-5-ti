import java.util.Arrays;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matriks = new int[3][4];

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        int hitung = 1;
        for(int i = 0; i < matriks.length; i++) {
            for(int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = hitung;
                hitung++;
            }
        }

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        displayMatrix(matriks);

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] papanCatur = {
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        papanCatur[0][0] = "X";
        papanCatur[1][1] = "X";
        papanCatur[2][2] = "X";

        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        papanCatur[0][2] = "O";
        papanCatur[1][0] = "O";
        papanCatur[2][1] = "O";

        // - Print papan dengan format grid yang rapi
        System.out.println("Papan catur: ");
        for(int i = 0; i < papanCatur.length; i++) {
            for(int j = 0; j < papanCatur[i].length; j++) {
                System.out.print(papanCatur[i][j] + " ");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] arrayJagged = new int[4][];
        arrayJagged[0] = new int[2];
        arrayJagged[1] = new int[4];
        arrayJagged[2] = new int[3];
        arrayJagged[3] = new int[5];

        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        hitung = 1;
        for(int i = 0; i < arrayJagged.length; i++) {
            for(int j = 0; j < arrayJagged[i].length; j++) {
                arrayJagged[i][j] = hitung;
                hitung++;
            }
        }

        // - Print array jagged dengan menampilkan panjang setiap baris
        System.out.println("Array jagged: ");
        for(int i = 0; i < arrayJagged.length; i++) {
            System.out.println("Baris " + i + " (Panjang " + arrayJagged[i].length + "): ");
            for(int j = 0; j < arrayJagged[i].length; j++) {
                System.out.print(arrayJagged[i][j] + " ");
            }
            System.out.println();
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] matriks1 = {{3, 1, 2}, {8, 5, 4}};
        int[][] matriks2 = {{4, 6, 7}, {11, 9, 3}};

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        addMatrices(matriks1, matriks2);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        multiplyByScalar(matriks1, 2);

        // - Print hasil operasi

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array

        // - Gunakan Arrays.sort() untuk mengurutkan array

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu

        // - Gunakan Arrays.equals() untuk membandingkan dua array

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)

        // - Isi dengan nilai berurutan dari 1

        // - Print menggunakan triple nested loop dengan format yang jelas

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};

        // - Isi dengan nilai random antara 60-100

        // - Hitung rata-rata per mahasiswa

        // - Hitung rata-rata per mata kuliah

        // - Tentukan mahasiswa dengan nilai tertinggi

        // - Print dalam format tabel yang rapi

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan

        // - Implementasikan method untuk menampilkan papan

        // - Implementasikan method untuk mengecek apakah ada pemenang

        // - Simulasikan beberapa langkah permainan
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implementasi penjumlahan matriks
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        // Implementasi perkalian scalar
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        // Implementasi reverse array
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        // Return array dengan format [min, max]
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matriks) {
        // Implementasi untuk menampilkan matriks dengan format rapi
        System.out.println("Matriks: ");
        for(int i = 0; i < matriks.length; i++) {
            for(int j = 0; j < matriks[i].length; j++) {
                System.out.printf("%-4d", matriks[i][j]);
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        // Implementasi untuk mengisi array dengan nilai random
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        // Implementasi untuk menghitung rata-rata
        return 0.0; // Ganti dengan implementasi yang benar
    }
}

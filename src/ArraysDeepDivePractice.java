import java.util.Arrays;
import java.util.Random;

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
        System.out.println("Matriks: ");
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
            System.out.print("Baris " + i + " panjangnya " + arrayJagged[i].length + ": ");
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
        System.out.println("Matriks A: ");
        displayMatrix(matriks1);
        System.out.println("Matriks B: ");
        displayMatrix(matriks2);

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        addMatrices(matriks1, matriks2);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        multiplyByScalar(addMatrices(matriks1, matriks2), 2);
        multiplyByScalar(matriks1, 2);
        multiplyByScalar(matriks2, 2);

        // - Print hasil operasi
        System.out.println("Penjumlahan Matriks: ");
        displayMatrix(addMatrices(matriks1, matriks2));
        System.out.println("Perkalian Matriks (A+B) dgn Skalar 2: ");
        displayMatrix(multiplyByScalar(addMatrices(matriks1, matriks2), 2));
        System.out.println("Perkalian Matriks A dgn Skalar 2: ");
        displayMatrix(multiplyByScalar(matriks1, 2));
        System.out.println("Perkalian Matriks B dgn Skalar 2: ");
        displayMatrix(multiplyByScalar(matriks2, 2));

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array acak: " + Arrays.toString(numbers));

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        int[] arrayTerurut = sortArray(numbers);
        System.out.println("Array terurut: " + Arrays.toString(arrayTerurut));

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        int[] arrayDibalik = reverseArray(arrayTerurut);
        System.out.println("Array dibalik: " + Arrays.toString(arrayDibalik));

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        int[] nilaiMinMax = findMinMax(numbers);
        System.out.println("Nilai minimum: " + nilaiMinMax[0] + " | Nilai maksimum: " + nilaiMinMax[1]);

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println("Array awal: " + Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println("Array terurut: " + Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        int index = Arrays.binarySearch(data, 5);
        System.out.println("Index dari 5: " + index);

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        int[] baru = new int[6];
        Arrays.fill(baru, 12);
        System.out.println("Array diisi dgn nilai 12: " + Arrays.toString(baru));

        // - Gunakan Arrays.equals() untuk membandingkan dua array
        int[] data2 = {1, 2, 3, 5, 8, 9};
        System.out.println("Array data dgn data2 sama ga? " + Arrays.equals(data, data2));

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        int[] arrCopy = Arrays.copyOf(data, 4);
        System.out.println("Copy array dgn ukuran beda: " + Arrays.toString(arrCopy));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] tigaDimensi = new int[2][3][4];

        // - Isi dengan nilai berurutan dari 1
        hitung = 1;
        for(int i = 0; i < tigaDimensi.length; i++) {
            for(int j = 0; j < tigaDimensi[i].length; j++) {
                for(int k = 0; k < tigaDimensi[i][j].length; k++) {
                    tigaDimensi[i][j][k] = hitung;
                    hitung++;
                }
            }
        }

        // - Print menggunakan triple nested loop dengan format yang jelas
        for(int i = 0; i < tigaDimensi.length; i++) {
            for(int j = 0; j < tigaDimensi[i].length; j++) {
                for(int k = 0; k < tigaDimensi[i][j].length; k++) {
                    System.out.printf("%-4d", tigaDimensi[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] nilaiMahasiswa = new int[namaMahasiswa.length][mataKuliah.length];

        // - Isi dengan nilai random antara 60-100
        fillRandomGrades(nilaiMahasiswa, 60, 100);

        System.out.printf("%-20s |", "Nama Mahasiswa");
        for (String pelajaran : mataKuliah) {
            System.out.printf(" %-10s |", pelajaran);
        }
        System.out.printf(" %-10s |%n", "Rata-rata");
        System.out.println("---------------------------------------------------------------------------------------");

        double maxRataRata = 0;
        String mahasiswaTop = "";

        // Hitung rata-rata per mahasiswa
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-20s |", namaMahasiswa[i]);
            int totalNilaiMhs = 0;
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.printf(" %-10d |", nilaiMahasiswa[i][j]);
                totalNilaiMhs += nilaiMahasiswa[i][j];
            }
            double rataRata1 = calculateAverage(totalNilaiMhs, mataKuliah.length);
            System.out.printf(" %-10.2f |%n", rataRata1);

            // Tentukan mahasiswa dengan nilai tertinggi
            if (rataRata1 > maxRataRata) {
                maxRataRata = rataRata1;
                mahasiswaTop = namaMahasiswa[i];
            }
        }

        System.out.println("---------------------------------------------------------------------------------------");

        // Hitung rata-rata per mata kuliah
        System.out.printf("%-10s |", "Rata-rata per matkul");
        for (int j = 0; j < mataKuliah.length; j++) {
            int totalNilaiMk = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                totalNilaiMk += nilaiMahasiswa[i][j];
            }
            double rataRata2 = calculateAverage(totalNilaiMk, namaMahasiswa.length);
            System.out.printf(" %-10.2f |", rataRata2);
        }
        System.out.printf(" %-10s |%n", "");
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("Mahasiswa dengan nilai tertinggi: " + mahasiswaTop + " (" + maxRataRata + ")");

        // - Print dalam format tabel yang rapi
        // Kode ada di atasnya.

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] papanMain = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // - Implementasikan method untuk menampilkan papan
        System.out.println("Inilah papan mainnya: ");
        tampilkanPapan(papanMain);
        System.out.println();

        // - Simulasikan beberapa langkah permainan
        papanMain[2][0] = 'X';
        System.out.println("X menempati (2,0)");
        tampilkanPapan(papanMain);
        System.out.println();
        papanMain[0][0] = 'O';
        System.out.println("O menempati (0,0)");
        tampilkanPapan(papanMain);
        System.out.println();
        papanMain[1][1] = 'X';
        System.out.println("X menempati (1,1)");
        tampilkanPapan(papanMain);
        System.out.println();
        papanMain[1][2] = 'O';
        System.out.println("O menempati (1,2)");
        tampilkanPapan(papanMain);
        System.out.println();
        papanMain[0][2] = 'X';
        System.out.println("X menempati (0,2)");
        tampilkanPapan(papanMain);
        System.out.println();

        // - Implementasikan method untuk mengecek apakah ada pemenang
        if(cekPemenang(papanMain) != ' ') {
            System.out.println("Pemenangnya adalah: " + cekPemenang(papanMain));
        } else {
            System.out.println("Belum ada yg menang.");
        }
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implementasi penjumlahan matriks
        int[][] hasil = new int[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[0].length; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return hasil; // Ganti dengan implementasi yang benar
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        // Implementasi perkalian scalar
        int[][] hasil = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                hasil[i][j] = matrix[i][j] * scalar;
            }
        }
        return hasil; // Ganti dengan implementasi yang benar
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        Arrays.sort(arr);
        return arr; // Ganti dengan implementasi yang benar
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        // Implementasi reverse array
        int[] arrDibalik = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDibalik[i] = arr[arr.length - 1 - i];
        }
        return arrDibalik; // Ganti dengan implementasi yang benar
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        // Return array dengan format [min, max]
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max}; // Ganti dengan implementasi yang benar
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        // Implementasi untuk menampilkan matriks dengan format rapi
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        // Implementasi untuk mengisi array dengan nilai random
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int total, int panjang) {
        // Implementasi untuk menghitung rata-rata
        return (double) total / panjang; // Ganti dengan implementasi yang benar
    }

    public static void tampilkanPapan(char[][] papan) {
        for(int i = 0; i < papan.length; i++) {
            System.out.print(" " + papan[i][0] + " | " + papan[i][1] + " | " + papan[i][2]);
            if(i < papan.length - 1) {
                System.out.println("\n---|---|---");
            }
        }
        System.out.println();
    }

    public static char cekPemenang(char[][] papan) {
        for(int i = 0; i < 3; i++) {
            if(papan[i][0] == papan[i][1] && papan[i][1] == papan[i][2] && papan[i][0] != ' ') {
                return papan[i][0];
            }
        }
        for(int j = 0; j < 3; j++) {
            if(papan[0][j] == papan[1][j] && papan[1][j] == papan[2][j] && papan[0][j] != ' ') {
                return papan[0][j];
            }
        }
        if(papan[0][0] == papan[1][1] && papan[1][1] == papan[2][2] && papan[0][0] != ' ') {
            return papan[0][0];
        }
        if(papan[0][2] == papan[1][1] && papan[1][1] == papan[2][0] && papan[0][2] != ' ') {
            return papan[0][2];
        }
        return ' ';
    }
}

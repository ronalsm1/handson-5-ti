import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arrayTetap = new int[3];

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> arrayKosong = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        arrayTetap[0] = 2;
        arrayTetap[1] = 1;
        arrayTetap[2] = 5;
        //arrayTetap[3] = 9;
        //arrayTetap[4] = 7;

        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        arrayKosong.add(2);
        arrayKosong.add(1);
        arrayKosong.add(5);
        arrayKosong.add(9);
        arrayKosong.add(7);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Ukuran array biasa: " + arrayTetap.length);
        System.out.println("Ukuran ArrayList: " + arrayKosong.size());
        /*
        Perbedaan array biasa dgn ArrayList adalah ukuran array biasa itu tetap setelah dibuat dan sulit untuk menambah
        atau menghapus elemen, sedangkan ukuran ArrayList itu dinamis (bisa bertambah atau berkurang).
         */

        // ===== GENERICS DASAR =====
        System.out.println("\\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList tipeRaw = new ArrayList();
        tipeRaw.add("Nilai");
        tipeRaw.add(100);
        tipeRaw.add('A');
        tipeRaw.add(true);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> setring = new ArrayList<>();
        setring.add("Namaku");
        setring.add("Ronald");

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> dabel = new ArrayList<>();
        dabel.add(98.5);
        dabel.add(94.6);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        //setring.add(9312);
        //dabel.add("Nilai");
        System.out.println("ArrayList raw: " + tipeRaw);
        System.out.println("ArrayList<String>: " + setring);
        System.out.println("ArrayList<Double>: " + dabel);

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Brandon Sinambela");
        daftarMahasiswa.add("Jessica Shabrina");
        daftarMahasiswa.add("Josef Hasiholan");
        daftarMahasiswa.add("Ronald Saut");
        daftarMahasiswa.add("Vania Rahel");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(1, "Ester Manurung");

        // - Print daftar mahasiswa
        System.out.println("Daftar mahasiswa: " + daftarMahasiswa);

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));

        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size()-1));

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("Ada mahasiswa bernama Ronald Saut? " + daftarMahasiswa.contains("Ronald Saut"));

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index Jessica Shabrina: " + daftarMahasiswa.indexOf("Jessica Shabrina"));

        // - Print ukuran ArrayList menggunakan size()

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(3, "Jordan Girsang");

        // - Print daftar setelah update
        System.out.println("Setelah update data: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(0);
        System.out.println("Setelah hapus index 0: " + daftarMahasiswa);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Vania Rahel");
        System.out.println("Setelah hapus Vania Rahel: " + daftarMahasiswa);

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();
        System.out.println("Setelah clear: " + daftarMahasiswa);

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Apakah daftar mahasiswa kosong? " + daftarMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);

        // - Iterasi menggunakan traditional for loop
        System.out.println("Loop tradisional: ");
        for(int i = 0; i < angka.size(); i++) {
            System.out.println("Index " + i + ": " + angka.get(i));
        }

        // - Iterasi menggunakan enhanced for loop (for-each)
        System.out.println("Loop for-each: ");
        for(Integer nilai : angka) {
            System.out.print(nilai + " ");
        }
        System.out.println();

        // - Iterasi menggunakan while loop
        System.out.println("While loop: ");
        int i = 0;
        while(i < angka.size()) {
            System.out.print(angka.get(i) + " ");
            i++;
        }
        System.out.println();

        // - Iterasi menggunakan Iterator
        System.out.println("Iterator: ");
        Iterator<Integer> bil = angka.iterator();
        while(bil.hasNext()) {
            System.out.print(bil.next() + " ");
        }
        System.out.println();

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\\\\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa
        dataMahasiswa.add(new String[]{"Brandon", "2481001", "Teknik Informatika"});
        dataMahasiswa.add(new String[]{"Chelsea", "2482030", "Sistem Informasi"});
        dataMahasiswa.add(new String[]{"Nadine", "2432020", "Akuntansi"});

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel
        System.out.println("Data Mahasiswa");
        System.out.printf("%-10s | %-8s | %-14s%n", "Nama", "NIM", "Jurusan");
        System.out.println("-----------+----------+-------------------");
        for (String[] data : dataMahasiswa) {
            System.out.printf("%-10s | %-8s | %-14s%n", data[0], data[1], data[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\\\\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        numbers.add(64);
        numbers.add(34);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list
        Collections.sort(numbers);
        System.out.println("Terurut: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list
        Collections.reverse(numbers);
        System.out.println("Terbalik: " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list
        Collections.shuffle(numbers);
        System.out.println("Teracak: " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min
        System.out.println("Nilai maksimum: " + Collections.max(numbers));
        System.out.println("Nilai minimum: " + Collections.min(numbers));

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency
        System.out.println("Menghitung kemunculan 90: " + Collections.frequency(numbers, 90));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\\\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Pisang");
        buah.add("Anggur");
        System.out.println("Awal: " + buah);

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search
        String target2 = "Jeruk";
        System.out.println("Linear search -> Jeruk ditemukan di index " + linearSearch(buah, target2));

        // - Sort secara alfabetis
        // TODO: Sort alphabetically
        Collections.sort(buah);
        System.out.println("Terurut: " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search
        String target1 = "Pisang";
        System.out.println("Binary search -> Pisang ditemukan di index " + Collections.binarySearch(buah, target1));

        // ===== ARRAYLIST 2D =====
        System.out.println("\\\\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList
        ArrayList<Integer> baris1 = new ArrayList<>(Arrays.asList(9, 8, 7));
        ArrayList<Integer> baris2 = new ArrayList<>(Arrays.asList(6, 5));
        ArrayList<Integer> baris3 = new ArrayList<>(Arrays.asList(4, 3, 2, 1));

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix
        matrix2D.add(baris1);
        matrix2D.add(baris2);
        matrix2D.add(baris3);

        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku
        daftarBuku.add(new String[]{"Makanya, Mikir!", "Abigail Limuria", "2025", "tersedia"});
        daftarBuku.add(new String[]{"Aksi Massa", "Tan Malaka", "2022", "dipinjam"});
        daftarBuku.add(new String[]{"Katabasis", "R.F. Kuang", "2025", "dipinjam"});
        daftarBuku.add(new String[]{"0 MDPL", "Nurwina Sari", "2025", "tersedia"});
        daftarBuku.add(new String[]{"Off The Record 3", "Ria SW", "2021", "dipinjam"});

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku
        System.out.println("Pinjam buku 'Makanya, Mikir!'");
        pinjamBuku(daftarBuku, "Makanya, Mikir!");
        System.out.println();

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku
        System.out.println("Ingin kembalikan buku 'Katabasis'");
        kembalikanBuku(daftarBuku, "Katabasis");
        System.out.println();

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku
        if(cariBuku(daftarBuku, "0 MDPL") != null) {
            System.out.println("Ditemukan Judul: " + cariBuku(daftarBuku, "0 MDPL")[0] + ", Status: " + cariBuku(daftarBuku, "0 MDPL")[3]);
        }

        // - Print daftar buku yang tersedia
        // TODO: Print available books
        System.out.println("Daftar buku yang tersedia sekarang: ");
        for(String[] buku : daftarBuku) {
            if(buku[3].equals("tersedia")) {
                System.out.println("- " + buku[0] + " | Pengarang: " + buku[1] + " | Tahun terbit: " + buku[2]);
            }
        }
        System.out.println();

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis
        ArrayList<String> daftarMahasiswa2 = new ArrayList<>(Arrays.asList("Andreas", "Ivan"));
        ArrayList<ArrayList<Integer>> nilaiMahasiswa = new ArrayList<>();
        nilaiMahasiswa.add(new ArrayList<>(Arrays.asList(86, 88, 91)));
        nilaiMahasiswa.add(new ArrayList<>(Arrays.asList(90, 87, 92)));

        daftarMahasiswa2.add("Josch");
        nilaiMahasiswa.add(new ArrayList<>(Arrays.asList(85, 84, 89)));

        for(int j = 0; j < daftarMahasiswa2.size(); j++) {
            System.out.println("Nilai " + daftarMahasiswa2.get(j) + ": " + nilaiMahasiswa.get(j) + " | Rata-rata: " + String.format("%.2f", hitungRataRata(nilaiMahasiswa.get(j))));
        }

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\\\\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
        System.out.println("Perbandingan performa Array dgn ArrayList: ");
        System.out.println("1. Waktu akses untuk keduanya termasuk sangat cepat dgn kompleksitas waktu O(1)");
        System.out.println("2. Waktu insert di tengah untuk keduanya termasuk lambat dgn kompleksitas waktu O(n)");
        System.out.println("3. Waktu insert di akhir: ");
        System.out.println("   a. Untuk Array termasuk cepat dgn kompleksitas waktu O(1) jika ada ruang kosong,");
        System.out.println("      termasuk lambat dgn kompleksitas waktu O(n) jika harus buat ruang baru");
        System.out.println("   b. Untuk ArrayList termasuk cepat dgn kompleksitas waktu O(1)");
        System.out.println("4. Waktu search: ");
        System.out.println("   a. Untuk Array, waktu Linear search (dgn kompleksitas waktu O(n)) lebih cepat dari Binary search");
        System.out.println("      (dgn kompleksitas waktu O(log n))");
        System.out.println("   b. Untuk ArrayList, metode contains() dan indexOf() menggunakan Linear search dgn kompleksitas");
        System.out.println("      waktu O(n)");

    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        // TODO: Print ArrayList dengan title
        System.out.println(title + ": " + list.toString() + "\n");
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        // TODO: Implementasi linear search
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        // TODO: Print 2D ArrayList matrix
        for(ArrayList<Integer> baris : matrix) {
            for(Integer nilai : baris) {
                System.out.printf("%-4d", nilai);
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi pinjam buku
        for(String[] buku : daftarBuku) {
            if(buku[0].equalsIgnoreCase(judul) && buku[3].equals("tersedia")) {
                buku[3] = "dipinjam";
                System.out.println("Buku dgn judul '" + judul + "' berhasil dipinjam");
                return true;
            } else {
                System.out.println("Buku dgn judul '" + judul + "' sedang dipinjam");
                return false;
            }
        }
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi kembalikan buku
        for(String[] buku : daftarBuku) {
            if(buku[0].equalsIgnoreCase(judul)) {
                if(buku[3].equals("dipinjam")){
                    buku[3] = "tersedia";
                    System.out.println("Buku dgn judul '" + judul + "' berhasil dikembalikan");
                    return true;
                } else {
                    System.out.println("Gagal mengembalikan. Buku dgn judul '" + judul + "' tidak sedang dipinjam");
                    return false;
                }
            }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi cari buku
        for(String[] buku : daftarBuku) {
            if(buku[0].equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        // TODO: Hitung rata-rata
        int total = 0;
        for(int nilai : values) {
            total += nilai;
        }
        return (double) total / values.size();
    }
}

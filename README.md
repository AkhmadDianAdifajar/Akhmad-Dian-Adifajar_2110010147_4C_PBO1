# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Rumah`, `RumahDetail`, dan `RumahBeraksi` adalah contoh dari class.

```bash
public class Mahasiswa {
     private String alamat;
    private int jumlahKamar;
    private double luasBangunan;
    private boolean memilikiGarasi;
}

public class MahasiswaDetail extends Mahasiswa {
    private String namaPemilik;
    private int tahunDibangun;
}

public class MahasiswaBeraksi {
     Scanner input = new Scanner(System.in);
}
```

2. **Object** adalah instance dari class. Pada kode ini, `public RumahDetail(String alamat, int jumlahKamar, double luasBangunan, boolean memilikiGarasi,
                       String namaPemilik, int tahunDibangun) {
        super(alamat, jumlahKamar, luasBangunan, memilikiGarasi);` adalah contoh pembuatan object.

```bash
public RumahDetail(String alamat, int jumlahKamar, double luasBangunan, boolean memilikiGarasi,
                       String namaPemilik, int tahunDibangun) {
        super(alamat, jumlahKamar, luasBangunan, memilikiGarasi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `alamat`,`jumlahkamar` adalah contoh atribut.

```bash
String alamat;
int jumlahKamar;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Rumah` dan `RumahDetail`.

```bash
public Rumah(String alamat, int jumlahKamar, double luasBangunan, boolean memilikiGarasi) {
        this.alamat = alamat;
        this.jumlahKamar = jumlahKamar;
        this.luasBangunan = luasBangunan;
        this.memilikiGarasi = memilikiGarasi;
}

public RumahDetail(String alamat, int jumlahKamar, double luasBangunan, boolean memilikiGarasi,
                       String namaPemilik, int tahunDibangun) {
        super(alamat, jumlahKamar, luasBangunan, memilikiGarasi);
        this.namaPemilik = namaPemilik;
        this.tahunDibangun = tahunDibangun;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setAlamat` dan `setJumlahKamar` adalah contoh method mutator.

```bash
public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getAlamat`, `getJumlahKamar`, `getLuasBangunan`, `getMemilikiGarasi` adalah contoh method accessor.

```bash
public String getAlamat() {
        return alamat;
    }

public int getJumlahKamar() {
        return jumlahKamar;
    }

public double getLuasBangunan() {
        return luasBangunan;
    }

public boolean memilikiGarasi() {
        return memilikiGarasi;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPemilik` dan `tahunDiBangun` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaPemilik;
private int tahunDibangun;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `RumahDetail` mewarisi `Rumah` dengan sintaks `extends`.

```bash
public class RumahDetail extends Rumah {
   ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Rumah` merupakan overloading method `displayInfo` dan `displayInfo` di `RumahDetail` merupakan override dari method `displayInfo` di `Rumah`.

```bash
 public String getInfo() {
        String info = "Alamat: " + alamat + ""
                + "Jumlah Kamar: " + jumlahKamar + ""
                + "Luas Bangunan: " + luasBangunan + ""
                + "Memiliki Garasi: " + (memilikiGarasi ? "Ya" : "Tidak") + "";
}

// Override 
    public String getInfo() {
        String info = super.getInfo() +
                "Nama Pemilik: " + namaPemilik + "" +
                "Tahun Dibangun: " + tahunDibangun + "";
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
String alamat = input.nextLine();
            int jumlahKamar = 0; 
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan Jumlah Kamar: ");
                    jumlahKamar = input.nextInt();
                    validInput = true; 
                } 
                catch (InputMismatchException e) {
                    input.nextLine(); 
                    System.out.println("Input tidak valid. Masukkan angka untuk Jumlah Kamar.");
                }

String memilikiGarasi = "";
            boolean inputValid = false;
            while (!inputValid) {
                System.out.print("Apakah Memiliki Garasi? (ya/tidak): ");
                String memilikiGarasiInput = input.nextLine();
                if (memilikiGarasiInput.equalsIgnoreCase("ya")) {
                    memilikiGarasi = "true";
                    inputValid = true;
                } else if (memilikiGarasiInput.equalsIgnoreCase("tidak")) {
                    memilikiGarasi = "false";
                    inputValid = true;
                } else {
                    System.out.println("Input tidak valid. Masukkan ya atau tidak.");
                }
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do-while` untuk meminta input dan menampilkan data.

```bash
do {
    ...

System.out.print("Ingin menginput data rumah lagi? (ya/tidak): ");
            String inginInputLagiInput = input.nextLine();
            inginInputLagi = inginInputLagiInput.equalsIgnoreCase("ya");
        } while (inginInputLagi);
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

        boolean inginInputLagi = false;

        do {
            // Membuat objek rumah dengan detail
            System.out.println("Informasi Rumah:");
            System.out.print("Masukkan Alamat Rumah: ");
            String alamat = input.nextLine();
            int jumlahKamar = 0; 
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan Jumlah Kamar: ");
                    jumlahKamar = input.nextInt();
                    validInput = true; 
                } 
                catch (InputMismatchException e) {
                    input.nextLine(); 
                    System.out.println("Input tidak valid. Masukkan angka untuk Jumlah Kamar.");
                }
            }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `RumahDetail[] rumah = new RumahDetail[2];` adalah contoh penggunaan array.

```bash
RumahDetail[] mahasiswas = new MahasiswaDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
                    System.out.print("Masukkan Jumlah Kamar: ");
                    jumlahKamar = input.nextInt();
                    validInput = true; 
                } 
                catch (InputMismatchException e) {
                    input.nextLine(); 
                    System.out.println("Input tidak valid. Masukkan angka untuk Jumlah Kamar.");
                }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   -     |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Edya Rosadi
NPM: 2110010001

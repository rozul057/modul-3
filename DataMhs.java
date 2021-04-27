/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author acer
 */

public class DataMhs extends DataUniv{
    static String Alamat;
    static String Jurusan;

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        DataMhs.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        DataMhs.Jurusan = Jurusan;
    }

}


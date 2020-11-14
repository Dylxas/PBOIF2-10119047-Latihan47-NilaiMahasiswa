/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan47.nilaimahasiswa;

import data.Nilai;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN INDEKS MAHASISWA
 */

public class PBOIF210119047Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai(100, 100, 39);
        
        nilai.tampil(nilai.getQuiz(), 
                     nilai.getUts(), 
                     nilai.getUas(), 
                     nilai.getNilaiAkhir(nilai.getQuiz(), 
                                         nilai.getUts(),
                                         nilai.getUas()), 
                     nilai.getindex(nilai.getNilaiAkhir(nilai.getQuiz(), 
                                                        nilai.getUts(),
                                                        nilai.getUas())));
    }
    
}

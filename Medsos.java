/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medsos;

/**
 *
 * @author Lenovo
 */
public class Medsos implements Comparable<Medsos>{
    private String Nama;
    private String jenisKelamin;
    private String tglblnthnLahir;
    private String iD;
    private String email;
    private String password;
    private String orang;

    public Medsos(String Nama, String jenisKelamin, String tglblnthnLahir, String iD, String email, String password, String orang) {
        setNama(Nama);
        setJenisKelamin(jenisKelamin);
        setTglblnthnLahir(tglblnthnLahir);
        setiD(iD);
        setEmail(email);
        setPassword(password);
        setOrang(orang);
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTglblnthnLahir() {
        return tglblnthnLahir;
    }
    public void setTglblnthnLahir(String tglblnthnLahir) {
        this.tglblnthnLahir = tglblnthnLahir;
    }
    public String getiD() {
        return iD;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getOrang() {
        return orang;
    }
    public void setOrang(String orang) {
        this.orang = orang;
    }

    @Override
    public int compareTo(Medsos o) {
        if(Nama.compareTo(o.getNama())<0) return -1;
        if(Nama.compareTo(o.getNama())==0) return 0;
        return 1;
    }
 
}

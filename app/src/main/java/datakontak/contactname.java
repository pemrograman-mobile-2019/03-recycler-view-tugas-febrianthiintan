package datakontak;

public class contactname {
    private String nama;
    private String asal;
    private String nohp;

    public contactname(String nama, String asal, String nohp) {
        this.nama = nama;
        this.asal = asal;
        this.nohp = nohp;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAsal(){
        return asal;
    }

    public void setAsal(String asal){
        this.asal = asal;
    }

    public String getNohp(){
        return nohp;
    }

    public void setNohp(String nohp){
        this.nohp = nohp;
    }
}

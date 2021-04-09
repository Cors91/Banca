package org.corso.banca;

public class ContoCorrente {

    private String nContoCorrente;
    private int soglia;
    private int saldoIniziale;
    private int saldoCorrente;
    private Cliente proprietario;



    public ContoCorrente() {

    }

    public ContoCorrente(String nContoCorrente, int soglia, int saldoIniziale,Cliente proprietario){
       this(nContoCorrente,soglia,saldoIniziale); this.proprietario=proprietario;
        
    }





    public ContoCorrente(String nContoCorrente, int soglia, int saldoIniziale) {

        this.saldoCorrente = saldoIniziale;
        this.saldoIniziale = saldoIniziale;
        this.nContoCorrente = nContoCorrente;
        this.soglia = soglia;

        if (this.soglia < 0) {
            this.soglia = 0;
        }

    }

    public String getnContoCorrente() {
        return nContoCorrente;
    }

    public void setnContoCorrente(String nContoCorrente) {
        this.nContoCorrente = nContoCorrente;
    }

    public int getSoglia() {
        return soglia;
    }

    public void setSoglia(int soglia) {
        this.soglia = soglia;
    }

    public int getSaldoIniziale() {
        return saldoIniziale;
    }

    public void setSaldoIniziale(int saldoIniziale) {
        this.saldoIniziale = saldoIniziale;
    }

    public int getSaldoCorrente() {
        return saldoCorrente;
    }

    public void prelievo(int importo)  throws MancanzaFondiException{
        if (saldoCorrente - importo >= soglia) {
            this.saldoCorrente -= importo;
        }else{
           throw new MancanzaFondiException("il Cliente " + this.proprietario.getCognome() + " ha provato a prelevare  " + importo);

        }
    }

    public void versamento(int importo) {
        this.saldoCorrente += importo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nContoCorrente == null) ? 0 : nContoCorrente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContoCorrente other = (ContoCorrente) obj;
        if (nContoCorrente == null) {
            if (other.nContoCorrente != null)
                return false;
        } else if (!nContoCorrente.equals(other.nContoCorrente))
            return false;
        return true;
    }

    

    
}

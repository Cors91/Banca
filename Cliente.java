package org.corso.banca;

public class Cliente {

    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Cliente(){

    }

    public Cliente(String nome,String cognome,String codiceFiscale){
        this.nome=nome; 
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodicefiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
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
        Cliente other = (Cliente) obj;
        if (codiceFiscale == null) {
            if (other.codiceFiscale != null)
                return false;
        } else if (!codiceFiscale.equals(other.codiceFiscale))
            return false;
        return true;
    }

    
    


}

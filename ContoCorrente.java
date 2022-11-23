public class ContoCorrente{
    
    // Attributi
    private int codice;
    private Persona intestatario;
    private int saldo;
    private int numeroMovimenti;
    private Movimenti[] movimenti;


    // Costruttore
    public ContoCorrente(int codice, Persona intestatario,int saldo,int numeroMovimenti, Movimenti[] movimenti) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = 0;
        this.numeroMovimenti = numeroMovimenti;
        this.movimenti=movimenti;
    }

    // Metodi
    public void deposita(int importo) {
        this.saldo += importo;
        this.numeroMovimenti++;
    }

    public void preleva(int importo) {
        this.saldo -= importo;
        this.numeroMovimenti++;
    }

    // Getters
    public int getSaldo(){
        return this.saldo;
    }
    public int getCodice(){
        return this.codice;
    }
    public Persona getIntestatario(){
        return this.intestatario;
    }
    public int getNumeroMovimenti(){
        return this.numeroMovimenti;
    }
    public Movimenti[] getMovimenti() {
        return movimenti;
    }
   

    // Setters
    public void setIntestatario(Persona intestatario){
        this.intestatario = intestatario;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public void setMovimenti(Movimenti[] movimenti) {
        this.movimenti = movimenti;
    }
    public void setNumeroMovimenti(int numeroMovimenti) {
        this.numeroMovimenti = numeroMovimenti;
    }
}
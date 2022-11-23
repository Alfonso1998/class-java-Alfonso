public class Movimenti {
    private int deposito;
    private String informazioni;
    private int prelievo;
    private String data;


//costruttore
public Movimenti(int deposito, String informazioni, int prelievo,String data){
    this.deposito=deposito;
    this.informazioni=informazioni;
    this.prelievo=prelievo;
    this.data=data;
}

//metodi




//Getter
public int getDeposito() {
    return deposito;
}
public int getPrelievo() {
    return prelievo;
}
public String getInformazioni() {
    return informazioni;
}
public String getData() {
    return data;
}

//Setter
public void setInformazioni(String informazioni) {
    this.informazioni = informazioni;
}

public void setDeposito(int deposito) {
    this.deposito = deposito;
}

public void setPrelievo(int prelievo) {
    this.prelievo = prelievo;
}
public void setData(String data) {
    this.data = data;
}




}
public class Test {
    public static void main(String[] args) {
        
        
        

        Persona marius = new Persona("Marius", "Borg", 18);
        Persona alfonso= new Persona("alfonso", "mandato", 24);
        ContoCorrente c1 = new ContoCorrente(0, marius, 1000, 3, 3);
        ContoCorrente c2= new ContoCorrente(100,alfonso, 100, 4, Movimenti[]);
       Movimenti[] movimenti= new Movimenti[4];
       Movimenti movimento1=new Movimenti(100, "nessun prelievo", 0, "09/04/2022");
        
       
            System.out.println(movimenti.getDeposito());
        
        
        
    }
    
}

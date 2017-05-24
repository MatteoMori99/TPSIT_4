package fattoriale;

public class Fatt extends Thread {
    private int n;
        public Fatt(int numero){
            this.n=numero;
            
        }
    public void run(){
        int fatt= 1;
        int cont=this.n;
        while(this.n!=1){
            fatt=fatt*this.n;
            this.n=n-1;
        
            
        }
        System.out.println(cont+"!="+fatt);
        
    }
}

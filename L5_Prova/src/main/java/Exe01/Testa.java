package Exe01;

public class Testa {
    
    public static void main(String[] args) {
        Computador pc1 = new Computador(false, 1);
        
        pc1.setRAM(8);
        pc1.ligar();
        System.out.println(pc1.getModo());
        System.out.println(pc1.getRAM());
        System.out.println(pc1.mostra());
        
        System.out.println("*----------*");
        pc1.desligar();
        System.out.println(pc1.getModo());
        System.out.println(pc1.getRAM());
        System.out.println(pc1.mostra());
        
    }
    
}

package Exe00;

public class Testa {

    public static void main(String[] args) {
        Professor pro1 = new Professor("Tanaka", "44730487800", "Mestre");
        System.out.println(pro1.mostra());

        Disciplina dis1 = new Disciplina("Matemática", 50, pro1);
        System.out.println(dis1.mostra());

        
        
        Professor pro2 = new Professor();
        System.out.println(pro2.mostra());

        Disciplina dis2 = new Disciplina();
        System.out.println(dis2.mostra());

    }

}

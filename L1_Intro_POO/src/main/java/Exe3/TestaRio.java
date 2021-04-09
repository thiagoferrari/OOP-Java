package Exe3;

public class TestaRio {

    public static void main(String[] args) {
        Rio rio1 = new Rio("Tiete", 80, true);

        rio1.mostrarInfo();
        rio1.chover(50);
        rio1.mostrarInfo();
        rio1.limpar();
        rio1.ensolarar(800);
        rio1.mostrarInfo();
        rio1.sujar();

        Rio rio2 = new Rio("Rio Grande", 80, true);

        rio2.mostrarInfo();
        rio2.chover(50);
        rio2.mostrarInfo();
        rio2.limpar();
        rio2.ensolarar(80);
        rio2.mostrarInfo();
        rio2.sujar();
    }

}

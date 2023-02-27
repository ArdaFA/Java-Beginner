import java.util.Random;
import java.util.Scanner;

public class Feldversuch extends Matroschka {
	
	public Feldversuch() {
		super();
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Matroschka obje1 = new Matroschka();

        System.out.println("Willkommen zur Matroschka!");

        for (int i = 0; i < 25; i++) {
        	double a = random.nextDouble() * 1000;
        	obje1.setBigMo(a);        	
        	
        	double b = random.nextDouble() * 900;
        	obje1.setSmallMo(b);
           
        	double c = random.nextDouble() * 100;
        	obje1.setDiff(c);
        	
            int zahlenRekursiv = matroschkaRekursiv(obje1.getBigMo(), obje1.getSmallMo(), obje1.getDiff());
            int zahlenIterativ = matroschkaIterativ(obje1.getBigMo(), obje1.getSmallMo(), obje1.getDiff());

            System.out.println("Größte: " + obje1.getBigMo() + ", Kleinste: " + obje1.getSmallMo() + ", Diff: " + obje1.getDiff());
            System.out.println("Rekursiv: " + zahlenRekursiv);
            System.out.println("Iterativ: " + zahlenIterativ);
        }
    }
}

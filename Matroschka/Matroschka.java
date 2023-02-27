import java.util.Scanner;

public class Matroschka {
	
	private double bigMo; 
	private double smallMo;
	private double diff;
	
	
	public double getBigMo() {
		return bigMo;
	}
	public void setBigMo(double bigMo) {
		this.bigMo = bigMo;
	}
	public double getSmallMo() {
		return smallMo;
	}
	public void setSmallMo(double smallMo) {
		this.smallMo = smallMo;
	}
	public double getDiff() {
		return diff;
	}
	public void setDiff(double diff) {
		this.diff = diff;
	}

	
	public static int matroschkaRekursiv(double bigMo, double smallMo, double diff) {
        if (bigMo < smallMo) {
            return 0;
        }
        double nextMo = bigMo * (diff / 100);
        int count = matroschkaRekursiv(nextMo, smallMo, diff);
        return count + 1;
    }
	
	 public static int matroschkaIterativ(double bigMo, double smallMo, double diff) {
	        int count = 0;
	        while (bigMo >= smallMo) {
	            bigMo *= (diff / 100);
	            count++;
	        }
	        return count;
	    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Matroschka obje = new Matroschka();
        
        System.out.print("Willkommen zur Matroschka! \n"
                + "Geben Sie bitte die Größe der größten Matroschka: ");
        double temp = scanner.nextDouble();
        obje.setBigMo(temp);
        
        
        System.out.print("Geben Sie bitte die Größe der kleinsten Matroschka: ");
        double temp2 = scanner.nextDouble();
        obje.setSmallMo(temp2);
        
        System.out.print("Um wie viel Prozent soll die nächstkleinere Matroschka sein: ");
        double temp3 = scanner.nextDouble();
        obje.setDiff(temp3);

        System.out.print("Wählen Sie die Implementierung aus (1 für rekursiv, 2 für iterativ): ");
        int option = scanner.nextInt();

        
        int count = 0;
        if (option == 1) {
            count = matroschkaRekursiv(obje.getBigMo(), obje.getSmallMo(), obje.getDiff());
        } else if (option == 2) {
            count = matroschkaIterativ(obje.getBigMo(), obje.getSmallMo(), obje.getDiff());
        } else {
            System.out.println("Ungültige Option!");
        }

        System.out.println("Sie haben " + count + " Matroschkas"); 
    }   
}

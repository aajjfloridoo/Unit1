package part_2;

public class Exercise10 {

	public static void main(String[] args) {

        // Declaramos la variable del año
        int año;
        // Declaramos la variable del siglo
        int siglo;
        
        // Iniciamos el Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pedimos por pantalla el año
        System.out.println("Indique un año: ");
        // La guardamos con Scanner
        año = sc.nextInt();
        
        // Calculamos el siglo
        siglo = (año - 1) / 100 + 1;
        
        // Mostramos por pantalla
        System.out.println("El año " + año + " pertenece al siglo " + siglo);
        
        // Cerramos Scanner
        sc.close();	
		
		
		
		
		
		
		
	}
}

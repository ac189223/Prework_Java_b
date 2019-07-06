/*
W pliku `Main2.java` stwórz trzy zmienne o nazwach: `nr1, nr2, result`.
1. Dwie niech przechowują dowolne **liczby całkowite**.
2. Trzeciej – o nazwie `result` – przypisz wartość `0`.
3. Zapisz sumę (użyj znaku dodawania `+`) tych liczb w zmiennej `result` i wypisz wynik na konsoli.  
*/

public class Main2 {

	public static void main(String[] args) {
		// Trzy zmienne całkowite
		short nr1, nr2;
		int result;
		// Przypisania
		nr1 = 437;
		nr2 = 9764;
		result = 0;
		// Działanie
		result = nr1 + nr2;
		System.out.println("Wynik dodawania " + nr1 + " do " + nr2 + " to " + result + ".");
	}

}

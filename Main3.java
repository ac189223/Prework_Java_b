/*
W pliku `Main3.java` stwórz trzy zmienne o nazwach: `nr1, nr2, result`.
1. Jedna niech przechowuje dowolną **liczbę całkowitą**.
2. Druga – dowolną **liczbę zmiennoprzecinkową** typu double.
3. Trzecia – o nazwie `result` – niech przechowuje liczbę `0`.
4. Zapisz sumę tych liczb w zmiennej `result` i wypisz wynik na konsoli.

Napisz w komentarzu jakiego typu i dlaczego powinna być zmienna result.
*/

public class Main3 {

	public static void main(String[] args) {
		// Stworzenie zmiennych
		short nr1;			
		double nr2, result;		// Druga zmienna jest double, więc wynik też musi
		// Przypisanie
		nr1 = 635;
		nr2 = 32.532443;
		result = 0;
		// Wynik
		result = nr1 + nr2;
		System.out.println("Wynik dodawania tych liczb (" + nr1 + 
			" oraz " + nr2 + ") to " + result + ".");
	}

}

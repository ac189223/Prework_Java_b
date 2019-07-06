/*
W pliku `Main1.java` stwórz zmienne dla podanych typów oraz je zainicjuj (ustaw wartość). 
1. int
2. char
3. long
4. double
5. boolean

Nazwy zmiennych utwórz wg wzoru: `typ` i numer podpunktu zadania, np.: `int1` lub `boolean5`.
Dodaj do każdej zmiennej komentarz z informacją jaki typ danych przechowuje ta zmienna.  
Wypisz w konsoli wartości tych zmiennych.  
Przykład:
```
//Ta zmienna przechowuje typ byte
byte byte9 = 23;
System.out.println(byte9);
```
*/

public class Main1 {

	public static void main(String[] args) {
		

		/* Zmienna typu integer - liczby całkowite */
		int int1 = 123;
		System.out.println(int1);
		// Zmienna na pojedyncze znaki
		char char2 = 'a';
		System.out.println(char2);
		/* Zmienna przechowująca duże liczby całkowite
				!!!!!!
			Nie chciała przyjąć duzej liczby
				!!!!!!				 */
		long long3 = 4321;
		System.out.println(long3);
		// Zmienna na liczbę z max około 15 miejsc po przecinku
		double double4 = 1.987654321098;
		System.out.println(double4);
		/* Zmienna zero-jedynkowa */
		boolean boolean5 = false;
		System.out.println(boolean5);

	}

}

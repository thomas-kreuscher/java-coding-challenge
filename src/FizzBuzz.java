/* 
Aufgabe: FizzBuzz-Programm
Schreibe ein Java-Programm, das die Zahlen 
von 1 bis 100 durchläuft. Für Vielfache von 
3 gibt es anstelle der Zahl "Fizz" aus, für 
Vielfache von 5 gibt es "Buzz" aus, und für 
Vielfache von sowohl 3 als auch 5 gibt es 
"FizzBuzz" aus. Ansonsten wird die aktuelle 
Zahl einfach ausgegeben.*/


public class FizzBuzz {

    static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            
            if(i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }

            else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            }

            else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }

            else {
                System.out.println(i);
            }
        }
      }
    
    public static void main(String[] args) {
        fizzBuzz();
        
    }
}

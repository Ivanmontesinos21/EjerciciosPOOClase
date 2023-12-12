package EjerciciosPOO.Ejercicio7;



public class NIF {

    private  char[] letters = new  char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private int number;
    private char letter;




    public char calculatedLetters(){
      return letters[number%23];

    }
    public NIF(int number){
        this.number=number;
        this.letter=calculatedLetters();

    }





    public char[] getLetters() {
        return letters;
    }

    public void setLetters(char[] letters) {
        this.letters = letters;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String toString(){
        return "The dni is " + number + " The letter of this DNi is " + calculatedLetters();
    }
}

import java.util.Scanner;
class BlocDeNotas1{

    static void metodo1(){ //crea un metodo llamado "metodo1"
        String letras = "";     //hay que declarar las variables de este metodo
        Scanner escaner = new Scanner(System.in);

        System.out.println("Hola amante de los gatitos, di hola.");  //ejecucion del programa
        letras = escaner.nextLine();
        System.out.println(letras.toUpperCase());
    } //cierre del metodo 

    static int metodo2(int x, int y){  //crea un metodo ("metodo2") que al ser llamado dara un valor entero, que pide dos entero(x,y)
        return x + y; //varios métodos pueden tener el mismo nombre siempre que el número y/o el tipo de parámetros sean diferentes.
    } //cierre metodo2

    public static void main(String [] args){
        String letras="";
        int num1, num2, num3;
        Scanner escaner = new Scanner(System.in);

        System.out.println(metodo2(5,8)); //llama al metodo "metodo2"

        metodo1(); //llama al metodo "metodo1"
        

        /*System.out.println("Hola, di hola");
        letras = escaner.nextLine();
        System.out.println(letras.toUpperCase()); //imprime en mayusuculas "letras"
        System.out.println(letras.toLowerCase()); //imprime en minusculas "letras" 
        System.out.println("la longitud de caracteres de \"letras\": " + letras.length());*/


        /*
        letras = "15"
        Integer entero = 0;
        Float flotante = 0.0f; // a float se le agrega f y a double d 
        int entero2 = 70;
        flotante += 1.5f;
        entero = Integer.parseInt(letras); //transforma a entero la cadena letras*/
        
        
        /*System.out.println("dame dos valores");
        num1 = escaner.nextInt();
        num2 = escaner.nextInt();
        num3 = Math.max(num1 , num2); //da el  valor mas alto, para el mas bajo remplazar con min
        System.out.println(num3 + " es el mayor valor.");*/


        /*num1 = 10; num2 = 9;
        System.out.println(num1 < num2);//da falso */


        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//arrays o matrices, almacena multiples valores en una variable poniendo [] luego del tipo de variable
        cars[0] = "Opel";
        System.out.println("Hay " + cars.length + " de elementos en \"cars\""); //cantidad de elementos en la variable cars.
        for(String i: cars){
        System.out.println(i);
        }*/


        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        } //muestra el elemento i de cars mientras este sea menor que la cantidad de elementos en cars.*/


        /*int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; //Multiples arrays , en este caso 2
        int x = myNumbers[1][2];  //establece x como el valor en la segunda array(1), y el tercer elemento(1)
        System.out.println(x); // Outputs 7*/
        

        /*int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {        //for con multiples array, busca el numero de arrays que hay
            for(int j = 0; j < myNumbers[i].length; ++j) {     //imprime el elemento dentro de la array del for(i)
            System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println("");
        }*/


        /*{
            int magia = 1; //las variables creadas aqui no son de todo el codigo sino solo hasta donde cierran las llaves
            System.out.print(magia); //puedes usar llaves para meter codigo que solo se ejecuta ahi
        }*/ 
    }
}
class Bucles{
    public static void main(String [] args){
        bucle1:  //etiqueta
        for (int i = 0 , j = 0; i < 100; i++){
            while (true) {
                if((++j)>5){System.out.println(i + "J ES:" + j); break bucle1;} //Finaliza ambos bucles 
                else {break;} //finaliza el interior (while)

            }
        }   
     }
}
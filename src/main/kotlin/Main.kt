package org.example

fun main() {
    var nomePokemon = "";
    var continuare = true;

    do{
        print("Inserisci il nome del pokemon da cercare: ");
        nomePokemon = readln();

        //RICHIESTE API
        print("\n\n$nomePokemon");


        print("\nContinuare  (Y/y): ");
        val strContinuare = readln();
        if(strContinuare != "Y" && strContinuare != "y")
            continuare = false;
    }while (continuare);
}
package com.acceleratedskillup;

class Familia {
    int numeroMembrosFamilia
    String nomeMae
    String nomePai
    int qtdDogs
    String nomeDosDogs
    def script

    Familia(script) {
        this.script = script
    }

    void printFamilia() {
        script.echo "using script.echo"
        script.echo "numeroMembrosFamilia:${numeroMembrosFamilia}"
        script.echo "The car model is:${nomePai}"
        script.echo "The car brand is:${nomeMae}"
        script.echo "The car brand is:${qtdDogs}"
        script.echo "The car brand is:${nomeDosDogs}"
    }

}

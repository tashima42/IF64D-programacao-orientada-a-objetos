#include <iostream>

struct pokemon {
  char nome[40];
  char tipo[40];
  int vida;
  int ataque;
  int defesa;

  void perguntarDados() {
    fflush(stdin);
    printf("\nDigite o nome do seu pokemon: ");
    gets(nome);
    
    printf("\nDigite o tipo do seu pokemon: ");
    gets(tipo);
    
    printf("\nDigite a vida do pokemon: ");
    scanf("%d", &vida);
    
    printf("\nDigite o ataque do pokemon: ");
    scanf("%d", &ataque);
    
    printf("\nDigite a defesa do pokemon: ");
    scanf("%d", &defesa);
  }

  void mostrarDados() {
    printf("\nNome: %s", nome);
    printf("\nTipo: %s", tipo);
    printf("\nVida: %d", vida);
    printf("\nAtaque: %d", ataque);
    printf("\nDefesa: %d", defesa);
  }
};

struct treinador {
  char nome[40];
  char cidadeDeOrigem[40];
  int idade;

  void perguntarDados() {
    fflush(stdin);
    printf("\nDigite o nome do treinador: ");
    gets(nome);
    
    printf("\nDigite a cidade de origem do treinador: ");
    gets(cidadeDeOrigem);
    
    printf("\nDigite a idade do treinador: ");
    scanf("%d", &idade);
  }

  void mostrarDados() {
    printf("\nNome: %s", nome);
    printf("\nTipo: %s", cidadeDeOrigem);
    printf("\nIdade: %d", idade);
  }
};

int main(int argc, char** argv) {
  treinador treinador1;
  pokemon pokemon1;
  pokemon pokemon2;
		
  printf("\n\nTreinador");
  treinador1.perguntarDados();

  printf("\n\nPokemon 1");
  pokemon1.perguntarDados();

  printf("\n\nPokemon 2");
  pokemon2.perguntarDados();

  pokemon1.mostrarDados();
  pokemon2.mostrarDados();
  treinador1.mostrarDados();
		
	return 0;
}


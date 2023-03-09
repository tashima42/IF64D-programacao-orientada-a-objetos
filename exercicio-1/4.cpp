#include <iostream>

struct pokemon {
  char nome[40];
  char tipo[40];
  int vida;
  int ataque;
  int defesa;

};

void perguntarDadosPokemon(pokemon *p) {
  fflush(stdin);
  printf("\nDigite o nome do seu pokemon: ");
  gets(p->nome);
  
  printf("\nDigite o tipo do seu pokemon: ");
  gets(p->tipo);
  
  printf("\nDigite a vida do pokemon: ");
  scanf("%d", &p->vida);
  
  printf("\nDigite o ataque do pokemon: ");
  scanf("%d", &p->ataque);
  
  printf("\nDigite a defesa do pokemon: ");
  scanf("%d", &p->defesa);
}

void mostrarDadosPokemon(pokemon *p) {
  printf("\nNome: %s", p->nome);
  printf("\nTipo: %s", p->tipo);
  printf("\nVida: %d", p->vida);
  printf("\nAtaque: %d", p->ataque);
  printf("\nDefesa: %d", p->defesa);
}

int main(int argc, char** argv) {
  pokemon pokemon1;
  pokemon pokemon2;
		
  printf("\n\nPokemon 1");
  perguntarDadosPokemon(&pokemon1);

  printf("\n\nPokemon 2");
  perguntarDadosPokemon(&pokemon2);

  mostrarDadosPokemon(&pokemon1);
  mostrarDadosPokemon(&pokemon2);
		
	return 0;
}


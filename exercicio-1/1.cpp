#include <iostream>

struct pokemon {
  char nome[40];
  char tipo[40];
  int vida;
  int ataque;
  int defesa;
};

int main(int argc, char** argv) {
  pokemon userPokemon;
		
	fflush(stdin);
	printf("\nDigite o nome do seu pokemon: ");
	gets(userPokemon.nome);
	
	printf("\nDigite o tipo do seu pokemon: ");
	gets(userPokemon.tipo);
	
	printf("\nDigite a vida do pokemon: ");
	scanf("%d", &userPokemon.vida);
	
	printf("\nDigite o ataque do pokemon: ");
	scanf("%d", &userPokemon.ataque);
	
	printf("\nDigite a defesa do pokemon: ");
	scanf("%d", &userPokemon.defesa);
	
	printf("\nNome: %s", userPokemon.nome);
	printf("\nTipo: %s", userPokemon.tipo);
	printf("\nVida: %d", userPokemon.vida);
	printf("\nAtaque: %d", userPokemon.ataque);
	printf("\nDefesa: %d", userPokemon.defesa);
		
	return 0;
}

#include <iostream>

struct pokemon {
  char nome[40];
  char tipo[40];
  int vida;
  int ataque;
  int defesa;
};

int main(int argc, char** argv) {
  pokemon pokemon1;
  pokemon pokemon2;
		
  printf("\nPokemon 1");
	fflush(stdin);
	printf("\nDigite o nome do seu pokemon: ");
	gets(pokemon1.nome);
	
	printf("\nDigite o tipo do seu pokemon: ");
	gets(pokemon1.tipo);
	
	printf("\nDigite a vida do pokemon: ");
	scanf("%d", &pokemon1.vida);
	
	printf("\nDigite o ataque do pokemon: ");
	scanf("%d", &pokemon1.ataque);
	
	printf("\nDigite a defesa do pokemon: ");
	scanf("%d", &pokemon1.defesa);

  printf("\n\nPokemon 2");
	fflush(stdin);
	printf("\nDigite o nome do seu pokemon: ");
	gets(pokemon2.nome);
	
	printf("\nDigite o tipo do seu pokemon: ");
	gets(pokemon2.tipo);
	
	printf("\nDigite a vida do pokemon: ");
	scanf("%d", &pokemon2.vida);
	
	printf("\nDigite o ataque do pokemon: ");
	scanf("%d", &pokemon2.ataque);
	
	printf("\nDigite a defesa do pokemon: ");
	scanf("%d", &pokemon2.defesa);
	
	printf("\nNome: %s", pokemon1.nome);
	printf("\nTipo: %s", pokemon1.tipo);
	printf("\nVida: %d", pokemon1.vida);
	printf("\nAtaque: %d", pokemon1.ataque);
	printf("\nDefesa: %d", pokemon1.defesa);

	printf("\nNome: %s", pokemon2.nome);
	printf("\nTipo: %s", pokemon2.tipo);
	printf("\nVida: %d", pokemon2.vida);
	printf("\nAtaque: %d", pokemon2.ataque);
	printf("\nDefesa: %d", pokemon2.defesa);
		
	return 0;
}


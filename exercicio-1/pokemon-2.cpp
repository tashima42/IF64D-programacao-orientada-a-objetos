#include <iostream>

int main(int argc, char** argv) {
	char nome1[40], tipo1[40], nome2[40], tipo2[40];
	int vida1, ataque1, defesa1, vida2, ataque2, defesa2;
		
	fflush(stdin);
	printf("\nDigite o nome do seu pokemon: ");
	gets(nome1);
	
	printf("\nDigite o tipo do seu pokemon: ");
	gets(tipo1);
	
	printf("\nDigite a vida do pokemon: ");
	scanf("%d", &vida1);
	
	printf("\nDigite o ataque do pokemon: ");
	scanf("%d", &ataque1);
	
	printf("\nDigite a defesa do pokemon: ");
	scanf("%d", &defesa1);

	printf("\nDigite o nome do seu pokemon: ");
	gets(nome2);
	
	printf("\nDigite o tipo do seu pokemon: ");
	gets(tipo2);
	
	printf("\nDigite a vida do pokemon: ");
	scanf("%d", &vida2);
	
	printf("\nDigite o ataque do pokemon: ");
	scanf("%d", &ataque2);
	
	printf("\nDigite a defesa do pokemon: ");
	scanf("%d", &defesa2);
	
	printf("\nNome: %s", nome1);
	printf("\nTipo: %s", tipo1);
	printf("\nVida: %d", vida1);
	printf("\nAtaque: %d", ataque1);
	printf("\nDefesa: %d", defesa1);

	printf("\nNome: %s", nome2);
	printf("\nTipo: %s", tipo2);
	printf("\nVida: %d", vida2);
	printf("\nAtaque: %d", ataque2);
	printf("\nDefesa: %d", defesa2);
		
	return 0;
}

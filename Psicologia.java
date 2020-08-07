package primeiroprogramajava;
import java.util.Scanner;

public class Psicologia{		//Criação da classe publica "Psicologia"
	
	public String nome; 
	public String area;	//Atributos que representam: nome, area de estudo,	
	public int nasceu; 
	public int morreu;	//ano que nasceu, ano de sua morte.

	public Psicologia(String nome, String area, int nasceu, int morreu )
 	{
		this.nome = nome;
		this.area = area;
		this.nasceu = nasceu;
		this.morreu = morreu;
    }
	
	public Psicologia() {
		// Eu não ia criar isso, mas a ide recomendou e ai o programa rodou, então deixei.
	}

	public int calculartempovivo(){	//Método que devolve o tempo que o psicólogo viveu em anos.
		return (morreu-nasceu);
	}
	
					//Métodos getters:
	public String getnome(){
		return nome;
	}
	public String getarea(){
		return area;
	}
	public void analisar(){
		System.out.println("Analisando como um " + getarea());
	}
	public int getnasceu(){
		return nasceu;
	}	
	public int getmorreu(){
		return morreu;
	}
					//Métodos setters:	
	public void setnome(String nome) {
        	this.nome=nome;
    	}
	public void setarea(String area) {
        	this.area=area;
    	}
	public void setnasceu(int nasceu) {
        	this.nasceu= nasceu;
    	}
	public void setmorreu(int morreu) {
        	this.morreu= morreu;
    	}
	
	//Corpo da função principal(main):
	public static void main(String[] args)
	{
		Psicologia p1 = new Psicologia();	//Objeto da classe(p1)
		p1.setnome("Sigmund Freud");
		p1.setarea("Psicanalista");
		p1.setnasceu(1856);
		p1.setmorreu(1939);
		
		System.out.println("Psicologo 1"); 	
		System.out.println("Nome: " + p1.getnome());
		System.out.println("Nasceu em: " + p1.getnasceu());
		System.out.println("Morreu em: " + p1.getmorreu());
		System.out.println("Area: " + p1.area);
		p1.analisar();
		System.out.println("Tempo de vida: " + p1.calculartempovivo());
		
		Scanner ler = new Scanner(System.in);
		Psicologia p2 = new Psicologia();	//Objeto da classe(p2)
		System.out.println("Digite o nome: ");  //Burrhus Frederic Skinner
		p2.nome = ler.nextLine();
		System.out.println("Area: "); //Behaviorista
		p2.area = ler.nextLine();
		System.out.println("Nasceu em: ");  //1904
		p2.nasceu=ler.nextInt();
		System.out.println("Ano de sua morte: "); //1990
		p2.morreu=ler.nextInt();
		
		System.out.println("Psicologo 2"); 	
		System.out.println("Nome: " + p2.getnome());
		System.out.println("Nasceu em: " + p2.getnasceu());
		System.out.println("Morreu em: " + p2.getmorreu());
		System.out.println("Area: " + p2.area);
		p2.analisar();
		System.out.println("Tempo de vida: " + p2.calculartempovivo());
		
		System.out.println("Os behavioristas acreditam que todos os comportamentos sao resultados de experiencia e condicionamentos.");
		System.out.println("Os psicanalistas realizam interpretacoes do inconsciente de acoes, palavras e imaginacao do individuo. Nao precisam ser necessariamente psicologos, podem se tornar pscinalista derivando de outras fomrmacoes da area neurologica.");
		ler.close(); // Pra fechar o "ler" do scanner pq tava dando aviso.
	}
}

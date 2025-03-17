package GETTERS_SETTERS;

public class salasDeCinema {
	private String nome;
	private int id;
	private int capacidade;
	private int idCinema;
	
	public salasDeCinema(int id, int capacidade, int idCinema, String nome){
		
		this.id = id;
		this.capacidade = capacidade;
		this.idCinema = idCinema;
		this.nome = nome;
		
		}
	
	public int getId() {
		return id;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getIdCinema() {
		return idCinema;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setIdCinema(int idCinema) {
		this.idCinema = idCinema;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String exibirSalas() {
        return "ID da sala: " + this.id + " | Nome: " + this.nome + " | Capacidade: " + this.capacidade + " | ID do Cinema: " + this.idCinema;
    }
}

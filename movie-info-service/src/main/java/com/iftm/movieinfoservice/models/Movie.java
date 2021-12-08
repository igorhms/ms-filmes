package com.iftm.movieinfoservice.models;

public class Movie {

	private String movieId;
	private String name;
		
	//AQUI INDICA COMO ESTA CLASSE PODERÁ SER ACESSADA
	public Movie(String movieId, String nome) {
		super();
		this.movieId = movieId;
		this.name = nome;
	}
	
	//INDICA COMO GERAR UM OBJETO VAZIO DESSA CLASSE QUE DEPOIS SERÁ POPULADO
	public Movie() {super();}
	
	//AQUI TEMOS OS METODOS PARA PEGAR (GET) E SETAR(SET) AS INFORMAÇÕES
	public String getMovieId() {return movieId;}
	public void setMovieId(String movieId) {this.movieId = movieId;}
	public String getName() {return name;}
	public void setName(String nome) {this.name = nome;}
	
	
	
}

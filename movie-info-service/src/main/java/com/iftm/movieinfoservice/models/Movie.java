package com.iftm.movieinfoservice.models;

public class Movie {

	private String movieId;
	private String name;
    private String description;
		
	//INDICA COMO GERAR UM OBJETO VAZIO DESSA CLASSE QUE DEPOIS SERÁ POPULADO
	public Movie() {}
	
	//AQUI INDICA COMO ESTA CLASSE PODERÁ SER ACESSADA
    public Movie(String movieId, String name, String description) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
    }
	
	//AQUI TEMOS OS METODOS PARA PEGAR (GET) E SETAR(SET) AS INFORMAÇÕES
    public String getMovieId() {return movieId;}
    public void setMovieId(String movieId) {this.movieId = movieId;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}
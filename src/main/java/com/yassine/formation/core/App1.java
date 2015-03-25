package com.yassine.formation.core;

import com.yassine.formation.core.entity.Film;
import com.yassine.formation.core.service.FilmService;

public class App1 {

	public static void main(String[] args) {
		Film film = new Film();
		
		film.setTitre("Titanic");
		film.setGenre("Aventure");
		film.setNbExemplaires(2);
		
		FilmService service= new FilmService();
		
		service.registerFilm(film);

	}

}

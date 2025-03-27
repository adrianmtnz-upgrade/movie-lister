package com.movie_lister._03_service;


public interface Controllable {
    public void initiateController();
    public void listMovies();
    public void addMovie(String title);
    public void deleteMovie(String title);
    public void searchMovie(String movieToSearch);
}

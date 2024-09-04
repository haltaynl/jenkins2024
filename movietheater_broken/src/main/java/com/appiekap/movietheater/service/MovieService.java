package com.appiekap.movietheater.service;

import com.appiekap.movietheater.model.Movie;

public interface MovieService {
    Movie saveMovie(Movie movie);
    Iterable<Movie> listMovies();


}

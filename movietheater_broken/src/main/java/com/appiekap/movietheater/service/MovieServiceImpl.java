package com.appiekap.movietheater.service;

import com.appiekap.movietheater.model.Movie;
import com.appiekap.movietheater.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie saveMovie(Movie movie) {
        return null;
    }

    @Override
    public Iterable<Movie> listMovies() {
        return null;
    }
}

package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class GenreStorage {
    private GenreRepository genreRepo;

    public GenreStorage(GenreRepository genreRepo){
        this.genreRepo = genreRepo;
    }
}

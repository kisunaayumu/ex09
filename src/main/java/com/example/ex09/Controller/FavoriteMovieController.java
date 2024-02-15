package com.example.ex09.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FavoriteMovieController {
    //このクラスには、作成した`[favorite-movie.html]`にフォワードさせる`showFavoriteMovie()`メソッドを作成してください
    @RequestMapping("/movie/show-favorite")
    public String showFavoriteMovie() {
        return "favorite-movie";
    }

}

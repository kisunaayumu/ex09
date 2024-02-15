package com.example.ex09.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book/show-favorite")
public class FavoriteBookController {
    //このクラスには、作成した`[favorite-book.html]`にフォワードさせる`showFavoriteBook()`メソッドを作成してください
    @RequestMapping("")
    public String showFavoriteBook() {
        return "favorite-book";
    }


}

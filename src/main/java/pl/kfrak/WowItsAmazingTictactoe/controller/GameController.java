package pl.kfrak.WowItsAmazingTictactoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/newGame")
    public String displayBoard(){
        return "display";
    }

}

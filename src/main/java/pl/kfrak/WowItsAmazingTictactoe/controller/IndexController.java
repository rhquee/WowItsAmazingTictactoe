package pl.kfrak.WowItsAmazingTictactoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

        @GetMapping("/")
        public String mainMenuOptions() {
            return "index";
        }

        @PostMapping(value = "/mainMenuOptions", params = "newGame")
        public String newGame() {
            return "redirect:/newGame";
        }

        @PostMapping(value = "/mainMenuOptions", params = "resumeGame")
        public String resumeGame() {
        return "redirect:/resumeGame";
        }

        @PostMapping(value = "/mainMenuOptions", params = "boardSize")
        public String changeBoardSize() {
        return "redirect:/boardSize";
        }

}
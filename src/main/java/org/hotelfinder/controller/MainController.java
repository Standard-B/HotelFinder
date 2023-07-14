package org.hotelfinder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index.do")
    public String index() {

        return "index";
    }

    @GetMapping("/hotel/list.do")
    public String hotelList() {

        return "hotels/hotel-list";
    }

}

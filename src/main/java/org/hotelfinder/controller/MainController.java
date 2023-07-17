package org.hotelfinder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/hotels")
    public String hotelList() {

        return "hotels/hotel-list";
    }

    @GetMapping("/hotels/{hotel_id}")
    public String hotelDetails() {

        return "hotels/hotel-details";
    }

}

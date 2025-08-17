package com.example.demo.Controller;
import com.example.demo.Service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FanController {
    private FanService fanService;
    @Autowired
    public FanController (FanService fanService){
        this.fanService=fanService;
    }
    @GetMapping("/fan/switchon/{fanNum}")
    public void switchon(@PathVariable int fanNum){
        fanService.switchon(fanNum);
    }
    @GetMapping("/fan/switchoff/{fanNum}")
    public void switchoff(@PathVariable int fanNum){
        fanService.switchoff(fanNum);
    }
    @GetMapping("/fan/up/{fanNum}")
    public void up(@PathVariable int fanNum){
        fanService.up(fanNum);
    }
    @GetMapping("/fan/down/{fanNum}")
    public void down(@PathVariable int fanNum){
        fanService.down(fanNum);
    }
    @GetMapping("/fan/report")
    public void report(){
        fanService.report();
    }
}
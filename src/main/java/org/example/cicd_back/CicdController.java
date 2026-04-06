package org.example.cicd_back;

@RestController
@RequestMapping("/cicd")
public class CicdController {
    @GetMapping("/test")
    public String test(){
        return "v1";
    }
}
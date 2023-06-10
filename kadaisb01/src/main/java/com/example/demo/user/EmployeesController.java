package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class EmployeesController {
    @Autowired
    private UserRepository repository;

    @GetMapping("")
    public List<Employees> getAllUsers() {
        List<Employees> emp = repository.findAll();
        return emp;
    }

    // @GetMapping("/a/{name}")
    // public User getById(@PathVariable("name") String name) {
    // return repository.findByName(name);
    // }

    @PostMapping("/update")
    public String Employees(@RequestParam("name") String Name) {
    repository.Employees(Name);
    return "変更したよ";
    }

    // @PostMapping("/insert")
    // public String insertUser(String insertName) {
    //     repository.insertUser(1111, "MORI0", "kome@dssasa.jp");
    //     return "追加したよ";
    // }

    // これでもできる
    // @PostMapping("update")
    // public String updateName(@RequestBody Map<String, String> body) {
    // String fromName = body.get("fromName");
    // repository.updateUser(fromName);
    // return "変更したよ";
    // }

}
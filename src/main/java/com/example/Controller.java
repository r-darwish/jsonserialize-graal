package com.example;

import io.micronaut.http.annotation.Get;

@io.micronaut.http.annotation.Controller
public class Controller {
    @Get
    Result getStuff() {
        return new Result(new MacAddress("12-34-56-78-90-12"));
    }
}

package com.diamanti.app;

import io.vertx.core.Vertx;

public class App {
    public static void main(String[] args) {
        Vertx.vertx()
             .createHttpServer()
             .requestHandler(request -> {
                 request.response()
                        .putHeader("content-type", "text/html")
                        .end("<h1>Hello World!</h1>");
             })
             .listen(8080);
    }
}

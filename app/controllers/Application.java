package controllers;

import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    // About us
    /*public static Result aboutUs() {
        return ok(index.render());
    }*/

    // Login Page
    /*public static Result todoList() {
        return ok(index.render());
    }*/

}

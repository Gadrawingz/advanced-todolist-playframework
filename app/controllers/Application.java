package controllers;

import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    // Support page
    /*public static Result support() {
        return ok(index.render("Support"));
    }*/

    // Login Page
    /* public static Result userLogin() {
        return ok(index.render("Login Page"));
    }*/

}

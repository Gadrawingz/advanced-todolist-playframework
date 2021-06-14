package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    // Index page
    public static Result index() {
        return ok(index.render("Welcome to Home page"));
    }

    // About us
    public static Result aboutUs() {
        return ok(index.render("About us page"));
    }

    // Contact us page
    public static Result contactUs() {
        return ok(index.render("Contact us"));
    }

    // Support page
    public static Result support() {
        return ok(index.render("Support"));
    }

    // Login Page
    public static Result userLogin() {
        return ok(index.render("Login Page"));
    }

    // Signup Page
    public static Result userSignup() {
        return ok(index.render("Signup Page"));
    }

}

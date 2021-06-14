package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class AboutUs extends Controller {

    public static Result about() {
        return ok(index.render("About us!"));
    }

}

package in.yunyul.vertx.console.example;

import in.yunyul.vertx.console.base.ConsolePage;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("unused")
public class ExampleConsolePage implements ConsolePage {
    private final SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");

    public static ExampleConsolePage create() {
        return new ExampleConsolePage();
    }

    @Override
    public void mount(Vertx vertx, Router router, String basePath) {
        router.route(basePath + "/example").handler(ctx ->
                ctx.response().end("Hello World! It is currently " + sdf.format(new Date()))
        );
    }

    @Override
    public String getLoaderFileName() {
        return "/js/example.js";
    }
}

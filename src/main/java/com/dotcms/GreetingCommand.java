package com.dotcms;

import io.quarkus.runtime.annotations.QuarkusMain;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "greeting", mixinStandardHelpOptions = true)
@QuarkusMain
public class GreetingCommand implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "picocli",
            description = "Your name.")
    String name;

    @Override
    public void run() {
        System.out.printf("Hello %s, go go commando!\n", name);
    }

    public static void main(String[] args) {
        CommandLine.run(new GreetingCommand(), args);
//        int exitCode = new CommandLine(new GreetingCommand()).execute(args);
//        System.exit(exitCode);
    }
}

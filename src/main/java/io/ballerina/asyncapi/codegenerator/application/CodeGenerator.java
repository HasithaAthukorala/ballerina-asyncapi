package io.ballerina.asyncapi.codegenerator.application;

public class CodeGenerator implements Application {
    private final String specPath;

    public CodeGenerator(String specPath) {
        this.specPath = specPath;
    }

    @Override
    public void generate(String specPath) {
        // TODO: call the controller and hand over the job
    }
}

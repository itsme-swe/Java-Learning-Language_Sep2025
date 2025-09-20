package javaDocsAndAnnotations;

@interface MyOwnAnno {
    String name();  // elements

    String project();

    String version() default "2.0";
}

@MyOwnAnno(name = "Harsh", project = "Bank", version = "2.0")
public class UserDefinedAnnotations {

    public static void main(String[] args) {

    }
}

/*
 * This is how we create user defined annotations. And can can have elements which act as annotation parameters along with default values.
 * */
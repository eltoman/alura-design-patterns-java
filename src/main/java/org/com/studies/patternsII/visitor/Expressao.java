package org.com.studies.patternsII.visitor;

public interface Expressao {
    int avalia();

    void aceita(Visitor visitor);
}

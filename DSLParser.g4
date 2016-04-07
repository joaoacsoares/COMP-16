parser grammar DSLParser;

options{
    tokenVocab = DSLLexer;
}

//DSL

dsl:
        DSLBEGIN line* DSLEND;

line:
        declaration
        |dslAssignment;

declaration:
        VAR_TYPE VAR DSL_SEMI;

dslAssignment:
    leftSide DSL_ASSIGN rightSide DSL_SEMI;

leftSide:
    VAR;

rightSide:
    VAR;


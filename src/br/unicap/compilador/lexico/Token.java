package br.unicap.compilador.lexico;

public class Token {

    public static final String TK_IDENTIFIER = "Identificador";
    public static final String TK_INTEIRO = "Inteiro";
    public static final String TK_LETRA = "Letra";
    public static final String TK_FLOAT = "Float";
    public static final String TK_CHAR = "Character";
    public static final String TK_DIGIT = "Dígito";
    public static final String TK_OPERATOR_relacional_maior = "Operador maior";
    public static final String TK_OPERATOR_relacional_menor = "Operador menor";
    public static final String TK_OPERATOR_relacional_maior_igual = "Operador maior igual";
    public static final String TK_OPERATOR_relacional_menor_igual = "Operador menor igual";
    public static final String TK_OPERATOR_relacional_diferenca = "Operador diferença";
    public static final String TK_OPERATOR_aritmetrico_mais= "Operador mais";
    public static final String TK_OPERATOR_aritmetrico_menos= "Operador menos";
    public static final String TK_OPERATOR_aritmetrico_multiplicacao= "Operador multiplicação";
    public static final String TK_OPERATOR_aritmetrico_divisao= "Operador divisão";
    public static final String TK_OPERATOR_igual= "Operador igual";
    public static final String TK_OPERATOR_atribuidor= "Operador atribuição";
    public static final String TK_CARACTER_especial_abre_parenteses = "Abre parênteses";
    public static final String TK_CARACTER_especial_fecha_parenteses = "Fecha parênteses";
    public static final String TK_CARACTER_especial_abre_chave = "Abre chave";
    public static final String TK_CARACTER_especial_fecha_chave = "Fecha chave";
    public static final String TK_CARACTER_especial_virgula = "Vírgula";
    public static final String TK_CARACTER_especial_pontovirgula = "Ponto e vírgula";
    public static final String TK_PALAVRA_reservada = "Palavra reservada";

    private String type;
    private String text;

    public Token(String type, String text) {
        super();
        this.type = type;
        this.text = text;
    }

    public Token() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Token [type=" + type + ", text=" + text + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        unicodeIndex("cassaforte", 7);
    }
    public static void unicodeIndex (String stringa, int indice) {
        StringBuilder risultato = new StringBuilder("il risultao è ");
        if (indice < stringa.length() && indice > 0) {
            System.out.println(risultato.append(stringa.charAt(indice)));
        } else {
            System.out.println(risultato.append("impossibile"));
        }
    }
}

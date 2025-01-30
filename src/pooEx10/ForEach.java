package pooEx10;

public class ForEach {
    public static void main(String[] args) {

        String[] nomes = new String[]{
                "Ricardo",
                "Patricia",
                "Heloisa",
                "Bernardo",
                "Theo"
        };

        for (String nomeFamilia : nomes){
            System.out.println(nomeFamilia);
        }
    }
}

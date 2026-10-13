public class Condicional {
    public static void main(String[] args){
        int ano = 2020;
        boolean incluidoNoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if(ano >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        }else{
            System.out.println("Precisa pagar locação.");
        }
    }
}

public class DiaDaSemanaSwitch {
    public static void main(String[] args) {

        //Domingo=1; Segunda=2; Terça=3; Quarta=4; Quinta=5; Sexta=6; Sabado=7

        int dia = 4;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

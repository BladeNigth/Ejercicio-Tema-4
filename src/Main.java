public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;

        if(numeroIf > 0){
            System.out.println("El numero "+ numeroIf + " es Positivo");
        }else if(numeroIf == 0){
            System.out.println("El numero "+ numeroIf + " es 0");
        }else if (numeroIf < 0){
            System.out.println("El numero "+ numeroIf + " es Negativo");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("el bucle while se ha Ejecutado " + numeroWhile);
            numeroWhile += 1;
        }
        numeroWhile = 2;
        do{
            System.out.println("El bucle Do-while se ha Ejecutado ");
            numeroWhile += 1;
        }while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ){
            System.out.println("El bucle for se ha ejecutado " + numeroFor);
        }

        String estacion = "VERAN";
        switch (estacion){
            case "INVIERNO":
                System.out.println("Estamos en Invierno ");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en Primavera");
                break;
            case "OTOÑO":
                System.out.println("Estamos en Otoño");
                break;
            case "VERANO":
                System.out.println("Estamos en Verano");
                break;
            default:
                System.out.println("La estacion por default es Invierno");
                break;
        }

    }
}
import java.util.ArrayList;
import java.util.List;

public class ListGenerics {
    public static void main(String args[]) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Ford());
        carros.add(new Honda());
        carros.add(new Mercedes());
        carros.add(new Tesla());
        carros.add(new Volkswagen());
        imprimirCarros(carros);
    }
    private static void imprimirCarros(List<? extends Carro> carro) {
        for (Carro carros : carro) {
            System.out.println("Lista de carro, " + carro);
        }
    }
}

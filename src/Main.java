//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        System.out.println("Ваш вес: " + weight + "кг");
        double height = 1.87;
        System.out.println("Ваш рост: " + height + "метра");
        int index = service.calculate(weight, height);
        System.out.println("Индекс Вашего тела: " + index);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        iCalculable calc = new Calculator(0);

        Decorator newCalc = new Decorator(new Calculator(0), new Logger());

        ViewCalculator view = new ViewCalculator(newCalc);
        view.run();  
    }
}

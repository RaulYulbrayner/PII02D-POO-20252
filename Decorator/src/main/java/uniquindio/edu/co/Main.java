package uniquindio.edu.co;

import uniquindio.edu.co.model.CafeBase;
import uniquindio.edu.co.model.CafeConChocolate;
import uniquindio.edu.co.model.CafeConCrema;
import uniquindio.edu.co.model.ICafe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Cafe base
        ICafe cafe = new CafeBase();
        System.out.println(cafe.getDescripcion() + " = $:" + cafe.getValor());

        ICafe cafeConCrema = new CafeConCrema(cafe);
        System.out.println(cafeConCrema.getDescripcion() + " = $:" + cafeConCrema.getValor());

        ICafe cafeConChocolate = new CafeConChocolate(cafe);
        System.out.println(cafeConChocolate.getDescripcion() + " = $:" + cafeConChocolate.getValor());

    }

}
class ExerciseMain {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Peter Munyaka";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.study();

  }
}
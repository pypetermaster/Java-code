class Exercise {

  // field and method of the parent class
  String name;
  public void study() {
    System.out.println("I can study");
  }
}

// inherit from Animal
class Study extends Exercise {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

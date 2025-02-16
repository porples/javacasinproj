public class Player {
  //inatnace variables
  String name;
  double money;
  int age;
  //constuctor
  public Player(String name, int age)
  {
    this.name = name;
    this.money = 998.56;
    this.age = age;
  }

  //methods
  //getters
  public String getname(){
    return name;
  }
  
  public double getmoney()
  {
    return money;
  }

  public int getage()
  {
    return age;
  }

  //setters
  public String setname(String name)
  {
    this.name = name;
    
    return this.name;

  }

  public double setmoney(double money)
  {
    this.money = money;
    return this.money;
  }

  public int setage( int age) 
  {
    this.age = age;

    return this.age;
  }
  // other methods

  




}
